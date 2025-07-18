   package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author Er. Ritik Katiyar
 */
public class Withdrawl extends JFrame implements ActionListener{

    JLabel titles;
    JTextField rss;
    JButton withdrawl, logout,back;
    String card;

    public Withdrawl(String card) {
        this.card=card;
        setTitle("Withdraw");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1370, 725);
        getContentPane().setBackground(new Color(145, 245, 250));

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1370, 90);
        panel.setLayout(null);
        panel.setBackground(new Color(5, 80, 242));
        add(panel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ newsbilogo.png"));
        Image i2 = i1.getImage().getScaledInstance(170, 90, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0, 0, 170, 90);
        panel.add(label);

        JLabel title = new JLabel("Welcome to State Bank Of India");
        title.setBounds(150, 3, 1000, 80);
        title.setFont(new Font("Chiller", Font.BOLD, 68));
        title.setForeground(Color.red);
        title.setHorizontalAlignment(JLabel.CENTER);
        panel.add(title);

        setVisible(true);
    

    
        JPanel pane = new JPanel(null);
        pane.setBounds(0, 91, 1350, 640);
        pane.setBackground(new Color(5, 80, 249));

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i22 = i11.getImage().getScaledInstance(1350, 800, Image.SCALE_SMOOTH);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel labels = new JLabel(i33);
        labels.setBounds(0, 0, 1350, 600);
        labels.setLayout(null);
        pane.add(labels);
        add(pane);

        titles = new JLabel("Please Enter Amount to Withdraw");
        titles.setBounds(340, 150, 400, 80);
        titles.setFont(new Font("Chiller", Font.BOLD, 28));
        titles.setForeground(Color.red);
        labels.add(titles);

        rss = new JTextField();
        rss.setBounds(300, 230, 400, 40);
        labels.add(rss);

        withdrawl = new JButton("Withdraw");
        withdrawl.setBounds(650, 300, 120, 40);
        withdrawl.setForeground(Color.red);
        withdrawl.addActionListener(this);
        withdrawl.setFont(new Font("Serif", Font.BOLD, 15));
        labels.add(withdrawl);
        
        back =new JButton("Back");
back.setBounds(650,345,120,40);
back.setForeground(Color.red);
back.setFont(new Font("Serif",Font.BOLD,15));
labels.add(back);
back.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
               new Index(card);
          }
            
    
});

        logout = new JButton("Log Out");
        logout.setBounds(330, 410, 320, 40);
        logout.setForeground(Color.red);
        logout.addActionListener(this);
        logout.setFont(new Font("Serif", Font.BOLD, 29));
        labels.add(logout);
        
        

//         
  }
  
        @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == withdrawl) {
        try {
            String amount = rss.getText();
            Date date = new Date();

            if (amount.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                return;
            }else
            {

            Conn c1 = new Conn();  // Your DB connection class
            ResultSet rs = c1.s.executeQuery("select * from bank where Cardno = '" + card + "'");
            int balance = 0;

            while (rs.next()) {
                if (rs.getString("mode").equalsIgnoreCase("Deposite")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else  {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            
            }
            

            int withdrawAmount = Integer.parseInt(amount);

            if (balance < withdrawAmount) {
                JOptionPane.showMessageDialog(null, "Insufficient Balance"+amount);
                return;
            
            }
            

            c1.s.executeUpdate("insert into bank values('" + card + "', '" + date + "', 'Withdrawal', '" + amount + "')");
            JOptionPane.showMessageDialog(null, "Rs. " + amount + " withdrawl successfully.");
            setVisible(false);
            new Index(card);

        } 
        }catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    } else if (e.getSource() == logout) {
        System.exit(0); // logout
    }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Withdrawl w = new Withdrawl("");
             
        });
    }

   
}
