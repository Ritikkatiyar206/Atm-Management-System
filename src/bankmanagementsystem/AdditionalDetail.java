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
 
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class AdditionalDetail extends JFrame {
    AdditionalDetail (){
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
        
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("icons/rupay.png "));
        Image i11=image.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i111=new ImageIcon(i11);
        JLabel img=new JLabel(i111);
        img.setBounds(1000, 250, 200,200);
        add(img);
                    
    }
    JLabel title,heading,Religion,catagory,incom,qualificaatin,occupation,pan,adhar,senoir,existing; 
    JTextField txtpan,txtadhar;
    JRadioButton syes,sno,eyes,eno;
    JComboBox creligion,ccategory,cincom,coccur,cedu;
    JButton next,Preview;
  
 
   public void  components (String forms){
     title =new JLabel("APPLICATION FORM NO."+forms);
        title.setFont(new Font("serif",Font.BOLD,50));
        title.setBounds(350,5,900,90);
        add(title);
        heading =new JLabel(" Page 2: Additional Details ");
        heading.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        heading.setBounds(470,50,900,90);
        add(heading);  
        Religion=new JLabel("Religion :");
      Religion.setBounds(150,140,150,30);
       Religion.setForeground(Color.BLACK);
      Religion.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(Religion);
          catagory=new JLabel("Catagory :");
      catagory.setBounds(150,190,150,30);
       catagory.setForeground(Color.BLACK);
     catagory.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(catagory);
        incom=new JLabel("Income :");
      incom.setBounds(150,240,150,30);
       incom.setForeground(Color.BLACK);
    incom.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(incom);
        
         qualificaatin=new JLabel("Qualification:");
      qualificaatin.setBounds(150,300,190,30);
      qualificaatin.setForeground(Color.BLACK);
    qualificaatin.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(qualificaatin);
        occupation=new JLabel("Occupation :");
      occupation.setBounds(150,350,200,30);
      occupation.setForeground(Color.BLACK);
    occupation.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(occupation);
         pan=new JLabel("Pan Card :");
    pan.setBounds(150,400,150,30);
      pan.setForeground(Color.BLACK);
pan.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(pan);
       adhar=new JLabel("Adhar Card :");
   adhar.setBounds(150,450,170,30);
      adhar.setForeground(Color.BLACK);
adhar.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(adhar);
        senoir=new JLabel("Senoir Citizen :");
   senoir.setBounds(150,500,200,30);
   senoir.setForeground(Color.BLACK);
senoir.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(senoir);
        existing=new JLabel("Existing Account :");
   existing.setBounds(150,550,250,30);
      existing.setForeground(Color.BLACK);
existing.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        add(existing);
        
        
         txtpan=new JTextField();
          txtpan.setBounds(450,400,400,30);
          txtpan.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
        txtpan.setForeground(Color.BLACK);
          add(txtpan);
           txtadhar=new JTextField();
          txtadhar.setBounds(450,450,400,30);
          txtadhar.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
        txtadhar.setForeground(Color.BLACK);
          add(txtadhar);
          syes=new JRadioButton("Yes");
          syes.setBounds(450,500,100,30);
          syes.setBackground(new Color(145, 245, 250));
    syes.setFont(new Font("Comic Sans MS",Font.BOLD,20));
          add(syes);
            sno=new JRadioButton("No");
          sno.setBounds(600,500,100,30);
          sno.setBackground(new Color(145, 245, 250));
    sno.setFont(new Font("Comic Sans MS",Font.BOLD,20));
          add(sno);
          ButtonGroup b=new ButtonGroup();
                     b.add(syes);
                            b.add(sno);
            eyes=new JRadioButton("Yes");
        eyes.setBounds(450,550,100,30);
          eyes.setBackground(new Color(145, 245, 250));
    eyes.setFont(new Font("Comic Sans MS",Font.BOLD,20));
          add(eyes);
           eno =new JRadioButton("No");
          eno.setBounds(600,550,100,30);
          eno.setBackground(new Color(145, 245, 250));
    eno.setFont(new Font("Comic Sans MS",Font.BOLD,20));
          add(eno);
           ButtonGroup bg=new ButtonGroup();
       bg.add(eyes);
              bg.add(eno);
              
               String religion[] = {"--Select--","Hindu","Muslim","Sikh","Christian","Other"};

        creligion = new JComboBox(religion);
        creligion.setBounds(450,140,400,30);
        creligion.setBackground(Color.WHITE);
        creligion.setFont(new Font("Raleway", Font.BOLD, 14));
       add(creligion);
        
       String[] categories={"--Select--","OBC","General","SC","ST","Other"};
        ccategory = new JComboBox(categories );
       ccategory.setBounds(450,190,400,30);
        ccategory.setBackground(Color.WHITE);
       ccategory.setFont(new Font("Raleway", Font.BOLD, 14));
       add(ccategory);
       
        String[] incoms={"--Select--","Null","<1,50,000","<2,00,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
         cincom = new JComboBox(incoms );
      cincom.setBounds(450,240,400,30);
        cincom.setBackground(Color.WHITE);
       cincom.setFont(new Font("Raleway", Font.BOLD, 14));
       add(cincom);
       
        String educations[] = {"--Select--","Non-Graduate","Gradute","Post-Graduate","Other"};
           cedu = new JComboBox(educations );
      cedu.setBounds(450,295,400,30);
        cedu.setBackground(Color.WHITE);
       cedu.setFont(new Font("Raleway", Font.BOLD, 14));
       add(cedu);
       
       String occurs[] = {"--Select--","Salaried","Self- Employed","Student","Bussiness","Retired","Other"};
           coccur = new JComboBox( occurs );
       coccur.setBounds(450,340,400,30);
         coccur.setBackground(Color.WHITE);
        coccur.setFont(new Font("Raleway", Font.BOLD, 14));
       add( coccur);
       
       
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
     PersonalDetail p= new PersonalDetail();
      p.components();
     }
     
 });  
           }
               
           });
        next=new JButton("Save & Next");
        next.setBounds(1100,590,150,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font(" SANS_Comic Sans MS",Font.BOLD,20));
        add(next);
        next.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e) {
            
             String rel=(String) creligion.getSelectedItem();
               String cat=(String)   ccategory.getSelectedItem();
                String  inc=(String)  cincom.getSelectedItem();
                 String educ=(String)  cedu.getSelectedItem();
                  String occu=(String)   coccur.getSelectedItem();
                  String adhars=txtadhar.getText();
                  String pans=txtpan.getText();
                  String Senior="";
          if(syes.isSelected())
          {
              Senior="yes";
          }
          else if(sno.isSelected())
          {
              Senior="no";
          }
          
          else{
              Senior="Not Selected";
          }
          
           String Existing="";
          if(eyes.isSelected())
          {
              Existing="yes";
          }
          else if(eno.isSelected())
          {
              Existing="no";
          }
          
          else{
              Senior="Not Selected";
          }
          try{
              
          Conn c1=new Conn();
          
             String queries="INSERT into AdditionalDetai(Formno,Relogions,Catagory,Income,Qualification,Occupation,Pancard,Adharcard,Seniorcitizen,Existingcode)"+"values('"+ forms+"','"+rel +"','"+cat +"','"+inc +"','"+educ+"','"+occu +"','"+pans +"','"+adhars +"','"+Senior +"','"+Existing+"')";
              int i=    c1.s.executeUpdate(queries);
               if(i>0)
        {
            JOptionPane.showMessageDialog(null,"Data Save Successfully");
                    
        }
        else
        {
          JOptionPane.showMessageDialog(null,"Data Save Failed !");   
        }
            
         }
         
         catch(Exception ex)
         {
             ex.printStackTrace();
         }
          
           SwingUtilities.invokeLater(new Runnable(){
         @Override
         public void run() {
           Accountdetails a=new Accountdetails();
     a.components(forms);   
         }
         
     });
         } 
        });
       
       


               
       
          
        
   }
        
    public static void main(String[] args){
       
        SwingUtilities.invokeLater(new Runnable(){
     @Override
     public void run() {
      AdditionalDetail a=new AdditionalDetail();
      a.components("");
     }
     
 }); 
        
    }
    
}
