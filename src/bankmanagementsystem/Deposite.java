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
import java.util.Date;
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
public class Deposite extends JFrame {
JLabel titles;
     JTextField  rs;
     
    JButton deposite ,logout,back;
    public Deposite(String card)
    {
      setTitle("Additional Details");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1370, 725);
        getContentPane().setBackground(new Color(145, 245, 250));
          setVisible(true);
          JPanel panel=new JPanel();
          panel.setBounds(0,0,1370,90);
          panel.setLayout(null);
          panel.setBackground(new Color(5, 80, 242));
          add(panel);
          
          
          
          
          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/ newsbilogo.png"));
        Image i2=i1.getImage().getScaledInstance(170, 90, Image.SCALE_SMOOTH);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(0, 0,170, 90);
        panel.add(label);
        
       JLabel title = new JLabel("Welcome to State Bank Of India");
title.setBounds(150,3, 1000, 80);
title.setFont(new Font("Chiller", Font.BOLD, 68));
title.setForeground(Color.red);  
title.setHorizontalAlignment(JLabel.CENTER); 
panel.add(title);
        
        
        
     
      
        
        
    


     
     
        JPanel pane=new JPanel(null);
          pane.setBounds(0,91,1350,640);
          pane.setLayout(null);
          pane.setBackground(new Color(5, 80, 249));
         
ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i22=i11.getImage().getScaledInstance(1350, 800, Image.SCALE_SMOOTH);
        ImageIcon i33=new ImageIcon(i22);
        JLabel labels=new JLabel(i33);
        labels.setBounds(0, 0,1350, 600);
        labels.setLayout(null);
        pane.add(labels);
         add(pane);
          titles = new JLabel("Please Enter Amount to Deposite ");
titles.setBounds(340,150, 400, 80);
titles.setFont(new Font("Chiller", Font.BOLD, 28));
titles.setForeground(Color.red);  
 labels.add(titles);
 rs=new JTextField();
 rs.setBounds(300,230,400,40);
 labels.add(rs);
 deposite =new JButton("Deposite");
deposite.setBounds(650,300,120,40);
deposite.setForeground(Color.red);
deposite.setFont(new Font("Serif",Font.BOLD,15));
labels.add(deposite);
 
 back =new JButton("Back");
back.setBounds(650,350,120,40);
back.setForeground(Color.red);
back.setFont(new Font("Serif",Font.BOLD,15));
labels.add(back);
back.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
               new Index(card);
          }
            
    
});


logout=new JButton("Log Out");
logout.setBounds(330,410,320,40);
logout.setForeground(Color.red);
logout.setFont(new Font("Serif",Font.BOLD,29));
labels.add(logout);
logout.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              System.exit(0);
          }
    
});
deposite.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 String amount=rs.getText();
                Date date=new Date();
                 
               try{
                   
               if(rs.getText().equals("")){
                   JOptionPane.showMessageDialog(null,"Please enter the amount ");
               }
                   else
                   {
                           Conn c1=new Conn();
                           c1.s.executeUpdate("insert into bank( Cardno,date,mode,amount) values('"+card+"','"+date+"','Deposite','"+amount+"')");
                            JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposite Successfully ");
                            setVisible(false);
                            Index i=new Index(card);
                              
                           

                           
                           }
               
               }
               catch(Exception ex){
                  ex.printStackTrace();
               }
                
                
            }
    
});
 
 
    }
   public static void main(String[] args)
   {
      
       SwingUtilities.invokeLater(new Runnable(){
     @Override
     public void run() {
       Deposite d=new Deposite(""); 

     }
       
       });
   }
}
       
   

