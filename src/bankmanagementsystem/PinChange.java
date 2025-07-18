/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Er. Ritik Katiyar
 */
public class PinChange extends JFrame implements ActionListener  {
    JLabel titles,pinl,cpinl;
    JButton confirm,logout,back;
    JTextField txtpin,txtcpin;
    String card;
    PinChange(String card){
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
         titles = new JLabel("Please Change Your Pin Number ");
        titles.setBounds(340, 225, 400, 80);
        titles.setFont(new Font("Chiller", Font.BOLD, 28));
        titles.setForeground(Color.red);
        img.add(titles);
        
         pinl=new JLabel("New Pin :");
        pinl.setBounds(270,300, 250, 40);
        pinl.setFont(new Font("Chiller", Font.BOLD, 22));
               pinl.setForeground(Color.white);
        img.add(pinl);
          cpinl=new JLabel("Re-Enter New Pin :");
        cpinl.setBounds(270,360, 250, 40);
        cpinl.setFont(new Font("Chiller", Font.BOLD, 22));
              cpinl.setForeground(Color.white);
        img.add(cpinl);
        txtpin=new JTextField();
        txtpin.setBounds( 430,300, 250, 30);
       img. add(txtpin);
        txtcpin=new JTextField();
        txtcpin.setBounds( 430,360, 250, 30);
       img. add(txtcpin);
         confirm = new JButton("Confirm");
        confirm.setBounds(600, 401, 150, 25);
        confirm.addActionListener(this);
       confirm.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        img.add(confirm);
         back = new JButton("Back");
        back.setBounds(350, 401, 150, 25);
        back.addActionListener(this);
       back.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        img.add(back);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new Index(card);
            }
            
        });
        
        
        logout=new JButton("Logout");
logout.setBounds(330,440,320,40);
logout.setForeground(Color.red);
logout.addActionListener(this);
logout.setFont(new Font("Serif",Font.BOLD,29));
img.add(logout);
        
        
        
        
    }
    
     @Override  
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == confirm) {
        try {
            String pinn = txtpin.getText().trim();
            String pinc = txtcpin.getText().trim();

            if (pinn.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Pin");
                return;
            }

            if (pinc.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Confirm Pin");
                return;
            }

            if (!pinn.equals(pinc)) {
                JOptionPane.showMessageDialog(null, "Entered Pins do not Match");
                return;
            }

            Conn c = new Conn();
            String query = "UPDATE accountdetails SET Pin = '" + pinc + "' WHERE Cardno = '" + card + "'";
            c.s.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Pin Changed Successfully");
            setVisible(false);
            new Index(card).setVisible(true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } else if (e.getSource() == logout) {
      System.exit(0);
       
    }
}

    public static void main(String[] args)
    {
       
        SwingUtilities.invokeLater(new Runnable(){
                    @Override
                    public void run() {
                         new PinChange("");
                    }
                    
                });
    }

   
    
}
