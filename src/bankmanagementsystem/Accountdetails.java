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
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Er. Ritik Katiyar
 */
public class Accountdetails extends JFrame {
    public Accountdetails(){
         setTitle("Additional Details");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 1350, 715);
        getContentPane().setBackground(new Color(145, 245, 250));
          setVisible(true);
          
          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/sbi logos.png"));
        Image i2=i1.getImage().getScaledInstance(150, 90, Image.SCALE_SMOOTH);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70, 10,150, 90);
        add(label);
        
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("icons/cardlogo.png "));
        Image i11=image.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i111=new ImageIcon(i11);
        JLabel img=new JLabel(i111);
        img.setBounds(1000, 300, 200,200);
        add(img);
    }
    JLabel title,heading,accounttype,cardno,req,reqs,reqss,pin,services;
    JRadioButton saccount,faccount,caccount,raccount;
    JCheckBox atm,internate,mobile,email,cheque,estatement,condition;
    JButton submit,cancel,Preview;
    JTextField cardnos,pinno;
 
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000000000000000L) + 10000000000000L;
    String first = "" + Math.abs(first4);
    
    String firsts="XXXX XXXX XXXX "+first.substring(12);
    public void components(String forms)
    {
       title =new JLabel("APPLICATION FORM NO."+forms);
        title.setFont(new Font("serif",Font.BOLD,50));
        title.setBounds(350,5,900,90);
        add(title);
        heading =new JLabel(" Page 3: Account Details ");
        heading.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        heading.setBounds(470,50,900,90);
        add(heading);  
        
        accounttype =new JLabel("Account Type :");
          accounttype.setBounds(100,130, 200, 40);
          accounttype.setForeground(Color.BLACK);
          accounttype.setFont(new Font("Comic Sans MS",Font.BOLD,25));
          add(accounttype);
          
          
          saccount=new JRadioButton("Saving Account");
          saccount.setBounds(120,180,250,40);
          saccount.setForeground(Color.BLACK);
          saccount.setBackground(new Color(145, 245, 250));
          saccount.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
          add(saccount);
           faccount=new JRadioButton("Fixed Deposit Account");
        faccount.setBounds(550,180,300,40);
       faccount.setForeground(Color.BLACK);
        faccount.setBackground(new Color(145, 245, 250));
          faccount.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
          add(faccount);
          
          caccount=new JRadioButton("Current Account");
          caccount.setBounds(120,230,300,40);
        caccount.setForeground(Color.BLACK);
        caccount.setBackground(new Color(145, 245, 250));
       caccount.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
          add(caccount);
           raccount=new JRadioButton("Recurring Deposit Account");
        raccount.setBounds(550,230,450,40);
       raccount.setForeground(Color.BLACK);
        raccount.setBackground(new Color(145, 245, 250));
          raccount.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
          add(raccount);
          ButtonGroup bg=new ButtonGroup();
          bg.add(saccount);
          bg.add(faccount);
          bg.add(caccount);
          bg.add(raccount);
          
          cardno=new JLabel("Card Number :");
           cardno.setBounds(100,280, 200, 40);
           cardno.setForeground(Color.BLACK);
          cardno.setFont(new Font("Comic Sans MS",Font.BOLD,25));
          add(cardno);
          req=new JLabel("( Your 16-digits Card Number )");
           req.setBounds(100,320, 300, 40);
           req.setForeground(Color.BLACK);
          req.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
          add(req);
           cardnos=new JTextField("      "+firsts);
           cardnos.setBounds(450,280, 400, 40);
           cardnos.setEditable(false);
           cardnos.setForeground(Color.BLACK);
          cardnos.setFont(new Font("Comic Sans MS",Font.BOLD,25));
          add(cardnos);
          reqs=new JLabel("( It would appear on ATM Card/ChequeBook and Statement)");
           reqs.setBounds(450,320, 600, 40);
           reqs.setForeground(Color.BLACK);
          reqs.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
          add(reqs);
          pin=new JLabel("Pin No :");
          pin.setBounds(100,370, 200, 40);
          pin.setForeground(Color.BLACK);
          pin.setFont(new Font("Comic Sans MS",Font.BOLD,25));
          add(pin);
          reqss=new JLabel("(  4-digit Paassword)");
           reqss.setBounds(100,390, 300, 40);
           reqss.setForeground(Color.BLACK);
          reqss.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
          add(reqss);
          pinno=new JTextField();
           pinno.setForeground(Color.BLACK);
          pinno.setFont(new Font("Comic Sans MS",Font.BOLD,25));
          pinno.setBounds(450,370,400,40);
          add(pinno);
          services=new JLabel("Services Required :");
          services.setBounds(100,430, 350, 40);
          services.setForeground(Color.BLACK);
          services.setFont(new Font("Comic Sans MS",Font.BOLD,25));
          add(services);
           atm=new JCheckBox("ATM Card");
           atm.setBounds(100,470,200,40);
           atm.setForeground(Color.BLACK);
        atm.setBackground(new Color(145, 245, 250));
          atm.setFont(new Font("Serif",Font.PLAIN,25));
           add(atm);
           
           internate=new JCheckBox("Internate Banking");
           internate.setBounds(450,470,260,40);
           internate.setForeground(Color.BLACK);
        internate.setBackground(new Color(145, 245, 250));
        internate.setFont(new Font("Serif",Font.PLAIN,25));
           add(internate);
           
            mobile=new JCheckBox("Mobile Banking");
           mobile.setBounds(100,510,200,40);
           mobile.setForeground(Color.BLACK);
        mobile.setBackground(new Color(145, 245, 250));
          mobile.setFont(new Font("Serif",Font.PLAIN,25));
           add(mobile);
           
           email=new JCheckBox("Email Alerts");
          email.setBounds(450,510,200,40);
           email.setForeground(Color.BLACK);
       email.setBackground(new Color(145, 245, 250));
        email.setFont(new Font("Serif",Font.PLAIN,25));
           add(email);
           
            cheque=new JCheckBox("Cheque Book");
            cheque.setBounds(100,550,200,40);
           cheque.setForeground(Color.BLACK);
         cheque.setBackground(new Color(145, 245, 250));
           cheque.setFont(new Font("Serif",Font.PLAIN,25));
           add( cheque);
           
           estatement=new JCheckBox("E-Statement");
           estatement.setBounds(450,550,200,40);
           estatement.setForeground(Color.BLACK);
      estatement.setBackground(new Color(145, 245, 250));
        estatement.setFont(new Font("Serif",Font.PLAIN,25));
           add(estatement);
           
           condition=new JCheckBox("I hereby declares that the above  entered details correct to the best of any knowledge.");
           condition.setBounds(100,580,1000,40);
           condition.setForeground(Color.BLACK);
  condition.setBackground(new Color(145, 245, 250));
        condition.setFont(new Font("Serif",Font.BOLD,15));
           add(condition);
            
          submit=new JButton("Submit");
          submit.setBounds(450,630,150,30);
          submit.setForeground(Color.WHITE);
          submit.setBackground(Color.BLACK);
          submit.setFont(new Font("Serif",Font.BOLD,20));
           
          add(submit);
          Preview=new JButton("Previous");
          Preview.setBounds(100,630,150,30);
          Preview.setForeground(Color.red);
          Preview.setBackground(Color.WHITE);
          Preview.setFont(new Font("Serif",Font.BOLD,20));
           add(Preview);
           Preview.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
           SwingUtilities.invokeLater(new Runnable(){
     @Override
     public void run() {
      AdditionalDetail a=new AdditionalDetail();
      a.components("");
     }
     
 }); 
           }
               
           });
          
          submit.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               String form=forms;
             String Saving="";
             if(saccount.isSelected())
             {
               Saving="saccount";   
             }
             else if(faccount.isSelected())
             {
               Saving="faccount";   
             }
              else if(caccount.isSelected())
             {
               Saving="caccount";   
             }
              else if(raccount.isSelected())
             {
               Saving="raccount";   
             }
             else
              {
                  Saving="Not Selected";
              }
             String cardsno=first;
             String pins=pinno.getText();
             String services="";
              if(atm.isSelected())
             {
               services="Atm Card";   
             }
             else if(internate.isSelected())
             {
               services="Internate Banking";   
             }
               else if(mobile.isSelected())
             {
               services="Mobile Banking";   
             }
               else if( email.isSelected())
             {
               services="Email Alerts";   
             }
              else if( cheque.isSelected())
             {
               services="Cheque Book";   
             }
              else if( estatement.isSelected())
             {
               services="E-Statement";   
             }
              else
              {
                  services="Not Selected";
              }
              
              boolean at=atm.isSelected();
              boolean inte=internate.isSelected();
              boolean mob=mobile.isSelected();
              boolean em=email.isSelected();
              boolean ch=cheque.isSelected();
              boolean estat=estatement.isSelected();
              try{
                Conn c1=new Conn();
                String queries = "insert into accountDetails(Formno,Accounttype,Cardno,Pin,Services,atmcard,internarebanking,mobilebanking,emailalerts,chequebook,estatement) values('"
        + form + "','" + Saving + "','" + cardsno + "','" + pins + "','" + services + "'," + at + "," + inte + "," + mob + "," + em + "," + ch + "," + estat + ")";

             int i=   c1.s.executeUpdate(queries);
             if(i>0){
                   
             UIManager.put("OptionPane.messageFont", new Font("Comic Sans MS", Font.BOLD, 18));
             
UIManager.put("OptionPane.buttonFont", new Font("Serif", Font.PLAIN, 16));
UIManager.put("OptionPane.background", new Color(220, 245, 255)); // background
UIManager.put("Panel.background", new Color(220, 245, 255)); // panel bg
UIManager.put("OptionPane.messageForeground", new Color(0, 51, 102)); // text color

JOptionPane.showMessageDialog(
    null, 
    "<html><b>Account Created Successfully!</b><br><br>Your Card Number is: <font color='blue'>" + first + "</font><br>Your PIN is: <font color='red'>" + pins + "</font></html>",
    "Success",
    JOptionPane.INFORMATION_MESSAGE
        
);


            
             }
             else
             {
               JOptionPane.showMessageDialog(null,"Account Created Failed !");  
             }
                
              }
              catch(Exception ex){
                 ex.printStackTrace();
              }
             
             
               
               
               
            
               SwingUtilities.invokeLater(new Runnable(){
     @Override
     public void run() {
          setVisible(false);
        Login l= new Login();
        l.components();
         
     }
     
 }); 
               
               
           }
              
          });
          cancel=new JButton("Cancel");
          cancel.setForeground(Color.WHITE);
          cancel.setBackground(Color.BLACK);
          cancel.setFont(new Font("Serif",Font.BOLD,20));
          cancel.setBounds(650,630,150,30);
          add(cancel);
          
          cancel.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
             System.exit(10);
           }
              
          });
          
          
    }
     
 public static void main(String[] args){
    
     SwingUtilities.invokeLater(new Runnable(){
         @Override
         public void run() {
           Accountdetails a=new Accountdetails();
     a.components("");   
         }
         
     });
 }   
}
