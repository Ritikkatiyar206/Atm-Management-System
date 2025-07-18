  package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
  import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.*;
import javax.swing.SwingUtilities;

public class FastCash extends JFrame implements ActionListener {
  


    JButton hundred,fivehundred, onethousand, twothousand, fivethousand, tenthousand,exit,logout;
    
JLabel titles;
String card;
    public FastCash(String card) {
this.card=card;
         setTitle("Fast Cash");
       setBounds(0, 0, 1370, 725);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
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
        
         
       
        

        ImageIcon atmImage = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg")); 
        Image atmImage2 = atmImage.getImage().getScaledInstance(1350, 700, Image.SCALE_SMOOTH);
       ImageIcon atmImage3 = new ImageIcon(atmImage2);
        JLabel img = new JLabel(atmImage3);
        img.setBounds(0, 0, 1350, 700);
        add(img);
         titles = new JLabel("Please Select Amount to Fastcash");
        titles.setBounds(340, 225, 400, 80);
        titles.setFont(new Font("Chiller", Font.BOLD, 28));
        titles.setForeground(Color.red);
        img.add(titles);
        
        
        hundred = new JButton("Rs.100");
        hundred.setBounds(230, 320, 150, 25);
        hundred.addActionListener(this);
        hundred.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        img.add(hundred);
        
        
        onethousand = new JButton("Rs. 1000");
        onethousand.setBounds(230, 347, 150, 25);
        onethousand.addActionListener(this);
        onethousand.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        img.add(onethousand);

       fivethousand  = new JButton("Rs. 5000");
        fivethousand.setBounds(230, 374, 150, 25);
         fivethousand.addActionListener(this);
        fivethousand.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        img.add(fivethousand);

       fivehundred = new JButton("Rs. 500");
        fivehundred.setBounds(600, 320, 150, 25);
         fivehundred.addActionListener(this);
        fivehundred.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        img.add(fivehundred);
        
        
        twothousand = new JButton("Rs. 2000");
        twothousand.setBounds(600, 347, 150, 25);
        twothousand.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
          twothousand.addActionListener(this);
        img.add(twothousand);

       tenthousand  = new JButton("Rs. 10000");
        tenthousand.setBounds(600, 374, 150, 25);
         tenthousand.addActionListener(this);
        tenthousand.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        img.add(tenthousand);
        logout=new JButton("Log Out");
logout.setBounds(330,440,320,40);
logout.setForeground(Color.red);
logout.setFont(new Font("Serif",Font.BOLD,29));
img.add(logout);
logout.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              System.exit(0);
          }
    
});
        
        
        
         exit = new JButton("Exit");
        exit.setBounds(600, 401, 150, 25);
         exit.addActionListener(this);
        exit.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        img.add(exit);
      
         } 
     @Override
    public void actionPerformed(ActionEvent e) {
        try{
          String amount = ((JButton)e.getSource()).getText().substring(3).trim();;  
          Conn c=new Conn();
          ResultSet rs=c.s.executeQuery("select * from bank where cardno="+card+"");
          int balance=0;
          while(rs.next())
          {
              if(rs.getString("mode").equals("Deposite")){
         balance+=Integer.parseInt(rs.getString("amount"));
              }
              else
              {
    balance-=Integer.parseInt(rs.getString("amount"));               
              }
          }
    if(e.getSource()!=exit && balance<Integer.parseInt(amount))
    {
        JOptionPane.showMessageDialog(null,"Insufficient balance");
        return;
    }
      if (e.getSource() == exit) {
                this.setVisible(false);
                 new Index(card).setVisible(true);
            }else{
                Date date = new Date();
                c.s.executeUpdate("insert into bank values('"+card+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Withdraawl Successfully");
                    
                setVisible(false);
                   new Index(card).setVisible(true);
            }

            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
      
    }

 
  
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FastCash(""));
}

   

    
}
