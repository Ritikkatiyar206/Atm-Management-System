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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
 

/**
 *
 * @author Er. Ritik Katiyar
 */
public class MiniStatement extends JFrame  {
     JLabel titles,cardl,cardn;
     String card;
      JTable Table;
       String[] columnnames={"Card No","Date","Mode","Amount"};
     public MiniStatement(String card){
           this.card=card;
           
           setTitle("Fast Cash");
       setBounds(0, 0, 1370, 725);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
         JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1370, 90);
        panel.setLayout(null);
         getContentPane().setBackground(new Color(145, 245, 250));
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
        
        JButton back = new JButton("Back");
back.setBounds(900, 600, 100, 40);
back.setBackground(Color.BLACK);
back.setForeground(Color.WHITE);
back.setFont(new Font("Arial", Font.BOLD, 16));
add(back);
back.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e) {
                   setVisible(false);
                    new Index(card);
               }
    
});
     

// Inside your MiniStatement constructor, after add(pane);
JButton printButton = new JButton("Print");
printButton.setBounds(600, 600, 100, 40);
printButton.setBackground(Color.BLACK);
printButton.setForeground(Color.WHITE);
printButton.setFont(new Font("Arial", Font.BOLD, 16));
add(printButton);

// Print action
printButton.addActionListener(e -> {
    try {
        boolean complete = Table.print();
        if (!complete) {
            System.out.println("Printing canceled");
        }
    } catch (Exception pe) {
        pe.printStackTrace();
    }
});

        
        cardl=new JLabel("Card Number :   "+card);
        cardl .setBounds(330, 100, 900, 80);
       cardl.setFont(new Font("Serif", Font.BOLD, 28));
        cardl.setForeground(Color.black);
        add(cardl);
        DefaultTableModel model=new DefaultTableModel(columnnames,0);
     Table =new JTable(model);
     Table.setForeground(Color.white);
     Table.setBounds(230,190,900,400);
     Table.getTableHeader().setForeground(Color.red);
     Table.setBackground(new Color(204, 204, 255));
     Table.setForeground(Color.BLACK);
   
     add(Table);
     JScrollPane pane=new JScrollPane(Table);
          
     pane.setBounds(230,190,900,400);
     add(pane);
      try{
        Conn c=new Conn();
         String query = "SELECT * FROM bank where Cardno='"+card+"'";
     ResultSet rs=    c.s.executeQuery(query);
     while(rs.next()){
          String car = rs.getString("Cardno");
                String dat = rs.getString("date");
                String mod = rs.getString("mode");
                String amo = rs.getString("amount");

               Object[] row = {car, dat, mod, amo};
                model.addRow(row);
         
     }
        
      }  
      catch(Exception ex){
          ex.printStackTrace();   
      }
         
        
     }
    
    public static void main(String []  args)
    {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new MiniStatement("");
            }
            
        });
    }
    
    
}
