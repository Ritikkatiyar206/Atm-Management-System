 package bankmanagementsystem;

import java .sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Login extends JFrame {

    JLabel title,user, password,message,signup;
    JTextField txtuser;
    JPasswordField txtpass;
    JButton signin, clear;

    public Login() {
        setTitle("Login Form");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 150, 700, 500);
        getContentPane().setBackground(new Color(145, 245, 250));
        
         ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/sbi logos.png"));
        Image img = icon.getImage().getScaledInstance(130, 70, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(img);
        JLabel imgLabel = new JLabel(scaledIcon);
        imgLabel.setBounds(20, 20, 150, 70);
        add(imgLabel);
        title=new JLabel("WELCOME TO SBI");
        title.setBounds(220,28,500,50);
        title.setFont(new Font("Comic Sans MS",Font.BOLD,40));
        add(title);
        
         
        setVisible(true);
    }

    public void components() {
      
       
        

       
        user = new JLabel("Card NO :");
        user.setBounds(90, 120, 200, 30);
          user.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        add(user);

        password = new JLabel("Pin :");
        password.setBounds(90, 200, 150, 30);
        password.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        add(password);

        
        txtuser = new JTextField();
        txtuser.setBounds(300, 120, 250, 40);
        txtuser.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
        txtuser.setForeground(Color.BLACK);
        add(txtuser);

        txtpass = new JPasswordField();
        txtpass.setBounds(300, 200, 250, 40);
        txtpass.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
        txtpass.setForeground(Color.BLACK);
        add(txtpass);

       
        signin = new JButton("Sign In");
        signin.setBounds(200, 290, 130, 30);
        signin.setBackground(new Color(33, 33, 33));
        signin.setForeground(Color.white);
         signin.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        add(signin);
        signin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String Cardno=txtuser.getText();
                 String Pin=txtpass.getText();
                try{
                    
                  Conn c1=new Conn();
                  String que="select*from accountdetails where Cardno='"+Cardno+"' and Pin='"+Pin+"'";
                ResultSet rs =  c1.s.executeQuery(que);
                if (rs.next()) {
     
    JOptionPane.showMessageDialog(null, "Login Successfully");
     SwingUtilities.invokeLater(new Runnable(){
     @Override
     public void run() {
      Index i=new Index(Cardno );
//      i.components();
     }
     
 }); 
                }
    else
    {
         JOptionPane.showMessageDialog(null, " Please correct fill  Card no or pin no ");    
            }
                
                
             
                
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }  
            }
            
        });

        clear = new JButton("Clear");
        clear.setBounds(350, 290, 100, 30);
         clear.setForeground(Color.white);
         clear.setBackground(new Color(33, 33, 33));
         clear.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        add(clear);
        message=new JLabel("If you have not  account ? ");
        message.setBounds(220,350,500,40);
           message.setForeground(Color.BLACK);
           message.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        add(message);
        signup=new JLabel("Signup");
            signup.setForeground(Color.red);
           signup.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        signup.setBounds(490,355,100,30);
        add(signup);
        clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtuser.setText("");
                txtpass.setText("");
               
            }
            
        });
signup.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
              SwingUtilities.invokeLater(new Runnable(){
     @Override
     public void run() {
      PersonalDetail p=  new PersonalDetail();
      p.components();
         
     }
     
 });        
            }

            @Override
            public void mousePressed(MouseEvent e) {
                 
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 
            }
});
            
 
 





        
        

 
    }

    public static void main(String[] args) {
 
SwingUtilities.invokeLater(new Runnable(){
     @Override
     public void run() {
        Login l= new Login();
        l.components();
         
     }
     
 }); 
    }
}
