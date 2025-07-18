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
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.SwingUtilities;

/**
 *
 * @author Er. Ritik Katiyar
 */

public class BalanceCheck extends JFrame implements ActionListener {
 JLabel titles,balances;
String card;
JButton Check,logout,back; 
JTextField amounts;
 
public BalanceCheck(String card) 
        
{
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
         titles = new JLabel("Please Check Your Account Balance");
        titles.setBounds(340, 225, 400, 80);
        titles.setFont(new Font("Chiller", Font.BOLD, 28));
        titles.setForeground(Color.red);
        img.add(titles);
        
        balances=new JLabel("Your Account Balance :");
        balances.setBounds(270,300, 250, 40);
        balances.setFont(new Font("Chiller", Font.BOLD, 22));
               balances.setForeground(Color.white);
        img.add(balances);
        amounts=new JTextField();
        amounts.setBounds(470,300, 250, 40);
        amounts.setEditable(false);
         amounts.setFont(new Font("Chiller", Font.BOLD, 18));
        amounts.setForeground(Color.blue);
        img.add(amounts);
            Check = new JButton("Check Balance");
        Check.setBounds(600, 360, 150, 25);
         Check.addActionListener(this);
         Check.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        img.add( Check);
        back =new JButton("Back");
back.setBounds(600,400,150,25);
back.setForeground(Color.black);
back.setFont(new Font("Serif",Font.BOLD,15));
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
 
logout.setFont(new Font("Serif",Font.BOLD,29));
img.add(logout);
 logout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                  System.exit(0);
                
            }
            
        });
        
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        Conn c=new Conn();
           int balance=0;
        try{
           ResultSet rs=c.s.executeQuery("select*from bank where Cardno='"+card+"'");
        
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
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
         amounts.setText("Rs. " + balance);
       

      
    }
    public static void main(String [] args)
            {
                SwingUtilities.invokeLater(new Runnable(){
                    @Override
                    public void run() {
                          new BalanceCheck("");  
                    }
                    
                });
    
    }
}
