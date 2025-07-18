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
import javax.swing.SwingUtilities;

/**
 *
 * @author Er. Ritik Katiyar
 */
public class Index extends JFrame  implements ActionListener{
    JLabel title,titles;
    JButton deposite,balance,cash,fast,statement,pinc,logout;
    String card; 
    
    public Index(String card){
        this.card=card;
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
        
        title = new JLabel("Welcome to State Bank Of India");
title.setBounds(150,3, 1000, 80);
title.setFont(new Font("Chiller", Font.BOLD, 68));
title.setForeground(Color.red);  
title.setHorizontalAlignment(JLabel.CENTER); 
panel.add(title);
        
       
        
     
     
        
        
    
    
   
    
    
    
 

// Main title


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

     titles = new JLabel("Please Select Your Transaction ");
titles.setBounds(340,150, 400, 80);
titles.setFont(new Font("Chiller", Font.BOLD, 28));
titles.setForeground(Color.red);  
 labels.add(titles);
deposite =new JButton("Deposite");
deposite.setBounds(250,245,120,40);
deposite.setForeground(Color.red);
deposite.addActionListener(this);
deposite.setFont(new Font("Serif",Font.BOLD,15));
labels.add(deposite);
 
cash =new JButton("Withdrawl ");
cash.setForeground(Color.red);
cash.setFont(new Font("Serif",Font.BOLD,15));
cash.setBounds(430,245,120,40);
cash.addActionListener(this);
labels.add(cash);
 
fast =new JButton("Fast Cash");
fast.setBounds(630,245,120,40);
fast.setForeground(Color.red);
fast.addActionListener(this);
fast.setFont(new Font("Serif",Font.BOLD,15));
labels.add(fast);

statement =new JButton("Statement");
statement.setBounds(250,320,120,40);
 statement.setForeground(Color.red);
 statement.addActionListener(this);
statement.setFont(new Font("Serif",Font.BOLD,15));
labels.add(statement);
pinc =new JButton("Pin Change");
 pinc.setForeground(Color.red);
pinc.setFont(new Font("Serif",Font.BOLD,15));
pinc.setBounds(430,320,120,40);
pinc.addActionListener(this);
labels.add(pinc);
balance=new JButton("Balance");
balance.setBounds(630,320,120,40);
balance.setForeground(Color.red);
balance.addActionListener(this);
balance.setFont(new Font("Serif",Font.BOLD,15));
labels.add(balance);
logout=new JButton("Log Out");
logout.setBounds(330,410,320,40);
logout.setForeground(Color.red);
logout.addActionListener(this);
logout.setFont(new Font("Serif",Font.BOLD,29));
labels.add(logout);




 

    }
     @Override
    public void actionPerformed(ActionEvent e) {
           if(e.getSource()==deposite){ 
            setVisible(true);
           new Deposite(card).setVisible(true);
        }else if(e.getSource()==cash){ 
         setVisible(true);
            new Withdrawl(card).setVisible(true);
        }else if(e.getSource()==pinc){ 
            setVisible(true);
            new PinChange(card).setVisible(true);
        }else if(e.getSource()==fast){ 
             new FastCash(card).setVisible(true);
        }else if(e.getSource()==statement){ 
            setVisible(false);
            new MiniStatement(card).setVisible(true);
        }else if(e.getSource()==balance){ 
            this.setVisible(true);
             new BalanceCheck(card).setVisible(true);
        }else if(e.getSource()==logout){ 
            System.exit(0);
}
           }


public static void main(String[] args){
    SwingUtilities.invokeLater(new Runnable(){
     @Override
     public void run() {
      Index i=new Index("");
   
     }
     
 }); 
}   

   

   

   
}
