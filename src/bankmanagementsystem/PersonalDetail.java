/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Er. Ritik Katiyar
 */
public class PersonalDetail extends JFrame  {
    PersonalDetail (){
         setTitle("PersonalDetail Form");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 1350, 715);
        getContentPane().setBackground(new Color(145, 245, 250));
          setVisible(true);



          
    }
 
    JLabel title,heading,name,fname,dob,gender,email,mstatus,address,city,pin,state;
    JTextField txtname,txtfname,txtemail,txtaddress,txtcity,txtpin,txtstate;
    JDateChooser datechooser1;
    JRadioButton male,female,other,married,unmarried;
    JButton next;
    
    
    
    
     Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String firstno = "" + Math.abs(first4);
   
    
    public void components(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/sbi logos.png"));
        Image i2=i1.getImage().getScaledInstance(150, 90, Image.SCALE_SMOOTH);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70, 20,150, 90);
        add(label);
        
         ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("icons/ newuser.png"));
        Image i11=image.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i111=new ImageIcon(i11);
        JLabel img=new JLabel(i111);
        img.setBounds(1000, 300, 200,200);
        add(img);
        
       
        
        
        title =new JLabel("APPLICATION FORM NO."+firstno);
        title.setFont(new Font("Comic Sans MS",Font.BOLD,50));
        title.setBounds(350,20,900,90);
        add(title);
        heading =new JLabel(" Page 1: Personal Details ");
        heading.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        heading.setBounds(470,80,900,90);
        add(heading);
        name=new JLabel("Name:");
        name.setBounds(150,180,150,30);
        name.setForeground(Color.BLACK);
        name.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(name);
         fname=new JLabel("Father's Name:");
        fname.setBounds(150,230,250,30);
        fname.setForeground(Color.BLACK);
        fname.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(fname);
        dob=new JLabel("Date Of Birth:");
        dob.setBounds(150,280,250,30);
        dob.setForeground(Color.BLACK);
        dob.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(dob);
        gender=new JLabel("Gender:");
        gender.setBounds(150,330,250,30);
        gender.setForeground(Color.BLACK);
        gender.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(gender);
        email=new JLabel("Email Address:");
        email.setBounds(150,380,250,30);
        email.setForeground(Color.BLACK);
        email.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(email);
        mstatus=new JLabel("Marital Status:");
        mstatus.setBounds(150,430,250,30);
         mstatus.setForeground(Color.BLACK);
        mstatus.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add( mstatus);
        address=new JLabel("Address:");
      address.setBounds(150,480,250,30);
     address.setForeground(Color.BLACK);
        address.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add( address);
        city=new JLabel("City:");
      city.setBounds(150,530,250,30);
     city.setForeground(Color.BLACK);
        city.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add( city);
        pin=new JLabel("Pin Code:");
      pin.setBounds(150,580,250,30);
     pin.setForeground(Color.BLACK);
        pin.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add( pin);
        state=new JLabel("State:");
  state.setBounds(150,630,250,30);
     state.setForeground(Color.BLACK);
        state.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add( state);
        
        
        
        txtname=new JTextField();
        txtname.setBounds(380,180,400,30);
        txtname.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
        txtname.setForeground(Color.BLACK);
        add(txtname);
        txtfname=new JTextField();
        txtfname.setBounds(380,230,400,30);
        txtfname.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
        txtfname.setForeground(Color.BLACK);
        add(txtfname);
        datechooser1=new JDateChooser();
        datechooser1.setFont(new Font("SERIF",Font.BOLD,20));
        datechooser1.setBounds(380,280,400,30);
        add(datechooser1);
        male=new JRadioButton("Male");
        male.setBounds(380,330,100,35);
        male.setBackground(new Color(145, 245, 250));
       male.setFont(new Font("Comic Sans MS",Font.BOLD,20)); 
       add(male);
        female=new JRadioButton("Female");
        female.setBounds(530,330,100,35);
        female.setBackground(new Color(145, 245, 250));
       female.setFont(new Font("Comic Sans MS",Font.BOLD,20)); 
       add(female);
        other=new JRadioButton("Other");
        other.setBounds(680,330,100,35);
        other.setBackground(new Color(145, 245, 250));
       other.setFont(new Font("Comic Sans MS",Font.BOLD,20)); 
       add(other);
       
          
              txtemail=new JTextField();
        txtemail.setBounds(380,380,400,30);
        txtemail.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
        txtemail.setForeground(Color.BLACK);
        add(txtemail);
         married=new JRadioButton("Married");
        married.setBounds(380,430,120,35);
        married.setBackground(new Color(145, 245, 250));
       married.setFont(new Font("Comic Sans MS",Font.BOLD,20)); 
       add(married);
         unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(560,430,250,35);
        unmarried.setBackground(new Color(145, 245, 250));
      unmarried.setFont(new Font("Comic Sans MS",Font.BOLD,20)); 
       add(unmarried);
        
       ButtonGroup bg=new ButtonGroup();
       bg.add(male);
       bg.add(female);
       bg.add(other);
        ButtonGroup b=new ButtonGroup();
       b.add(married);
        b.add(unmarried);
         txtaddress=new JTextField();
        txtaddress.setBounds(380,480,400,30);
        txtaddress.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
        txtaddress.setForeground(Color.BLACK);
        add(txtaddress);
         txtcity=new JTextField();
        txtcity.setBounds(380,530,400,30);
        txtcity.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
        txtcity.setForeground(Color.BLACK);
        add(txtcity);
          txtpin=new JTextField();
        txtpin.setBounds(380,580,400,30);
        txtpin.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
        txtpin.setForeground(Color.BLACK);
        add(txtpin);
           txtstate=new JTextField();
        txtstate.setBounds(380,630,400,30);
        txtstate.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
        txtstate.setForeground(Color.BLACK);
        add(txtstate);
        
 
        next=new JButton("Save & Next");
        next.setBounds(1100,640,150,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font(" SANS_Comic Sans MS",Font.BOLD,20));
        add(next);
        
        
        next.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String Formno=firstno;
                String nm=txtname.getText();
                String Fn=txtfname.getText();
                java.util.Date utilDate = datechooser1.getDate();
          java.sql.Date dob = new java.sql.Date(utilDate.getTime());
          String Gender="";
          if(male.isSelected())
          {
              Gender="male";
          }
          else if(female.isSelected())
          {
              Gender="female";
          }
          else if(other.isSelected())
          {
              Gender="other";
          }
          else{
              Gender="Not Selected";
          }
          String emails=txtemail.getText();
           String Marital="";
          if(married.isSelected())
          {
              Marital="married";
          }
          else if(unmarried.isSelected())
          {
              Marital="unmarried";
          }
          else{
            Marital="Not Selection";
          }

          String add=txtaddress.getText();
          String cit=txtcity.getText();
          String pin=txtpin.getText();
          String States=txtstate.getText();
          try{
            Conn c1=new Conn();
            String queries = "INSERT INTO PersonalDetail(Formno, Name, FatherName, Dateofbirth, Gender, Email, Marital, Address, City, pincode,State) " +
                 "VALUES('" + Formno + "','" + nm + "','" + Fn + "','" + dob + "','" + Gender + "','" + emails+ "','" + Marital + "','" + add + "','" + cit + "','" + pin + "','" + States + "')";

        int i=    c1.s.executeUpdate(queries);
        if(i>0)
        {
            JOptionPane.showMessageDialog(null," your All detail is correct");

            JOptionPane.showMessageDialog(null,"Data Save Successfully");
                    
        }
        else
        {
          JOptionPane.showMessageDialog(null,"Data Save Failed !");   
        }
            
            
          }
          catch (Exception ex)
          {
              ex.printStackTrace();
          }
          
          
                
                SwingUtilities.invokeLater(new Runnable(){
     @Override
     public void run() {
      AdditionalDetail a=new AdditionalDetail();
      a.components(firstno);
     }
     
     
 }); 
            }
            
        });
        
        
       
    }
    
     public static void main(String[] args) {
 
SwingUtilities.invokeLater(new Runnable(){
     @Override
     public void run() {
     PersonalDetail p= new PersonalDetail();
      p.components();
     }
     
 }); 
    }

   
    
}
