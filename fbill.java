/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
/**
 *
 * @author Vishesh Tandon
 */
public class fbill implements ActionListener
{
    //product p = new product();
    JTextField jt1,jt2,jt3,jt4,jt5,jt6;
    JButton b1,b2,b3,b4;  
    JLabel j1,j2,j3,j4,j5,j6;
    JFrame f= new JFrame();
    JFrame f1= new JFrame();
    JFrame f2 = new JFrame();
    tbill tb = new tbill();
    bill b = new bill();
    customer c1 = new customer();
    String bnum1,quantity1,price1,mnumber1,bnum2;
    int n=0,billam;
    fbill()
    {
        f.setVisible(true);
        j1 = new JLabel();
        j2= new JLabel();
        j3 = new JLabel();
        j4= new JLabel();
        //j5 = new JLabel("Address:");
        jt1=new JTextField(10);
        jt2=new JTextField(10);  
        jt3=new JTextField(10);
        jt4 = new JTextField(10);
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton(); 
        j1.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        j1.setHorizontalAlignment(SwingConstants.CENTER);
        j1.setText("CUSTOMER MOBILE NUMBER:");
        
        j2.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        j2.setHorizontalAlignment(SwingConstants.CENTER);
        j2.setText("PRODUCT ID:");
        
        j3.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        j3.setHorizontalAlignment(SwingConstants.CENTER);
        j3.setText("QUANTITY:");
        
        j4.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        j4.setHorizontalAlignment(SwingConstants.CENTER);
        j4.setText("BILL AMOUNT TO BE PAID:");
        //jt3=new JTextField(10);  
        //jt4 = new JTextField(10);
        //jt5 = new JTextField(10);
        b1.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        b1.setText("NEXT");
        
        b2.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        b2.setText("NEXT");
        
        b3.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        b3.setText("SUBMIT");
        
        b4.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        b4.setText("CLOSE");
        
        b1.addActionListener(this);  
        //b2.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);
        
        f.setSize(500,500);
        f1.setSize(500,500);
        f2.setSize(500,500);
        
        f.setLayout(new GridLayout(3,1));
        f1.setLayout(new GridLayout(3,2));
        f2.setLayout(new GridLayout(3,1));
        
        f.add(j1);
        f.add(jt1);
        f.add(b1);
        
        f1.add(j2);
        f1.add(jt2);
        f1.add(j3);
        f1.add(jt3);
        f1.add(b2);
        f1.add(b3);  
        
        f2.add(j4);
        f2.add(jt4);
        f2.add(b4);
    }
    @Override
     public void actionPerformed(ActionEvent e) 
    {  
        n=0;
        if(e.getSource()==b1)
        {
            
            mnumber1 = jt1.getText();
            b.mnum = Long.parseLong(mnumber1);
            f.setVisible(false);
            f1.setVisible(true);
        }
        if(e.getSource()==b2)
        {
            
            quantity1 = jt3.getText();
            b.quantity= Integer.parseInt(quantity1);
            b.pid =jt2.getText();
            jdbc j = new jdbc();
            if(n==0)
            {
                j.insertb(b,tb);
                ++n;
            }
            else
                j.insertb1(b,tb);
            jt2.setText("");
            jt3.setText("");
            f1.setVisible(false);
            f1.setVisible(true);
        }
        if(e.getSource()==b3)
        {
            billam =0;
            quantity1 = jt3.getText();
            b.quantity= Integer.parseInt(quantity1);
            b.pid =jt2.getText();
            jdbc j = new jdbc();
            j.insertb1(b,tb);
            billam= j.displayb1(b.bnum);
            
            jt4.setText(Integer.toString(billam));
            f1.setVisible(false);
            f2.setVisible(true);
            //menu2 m2 = new menu2();
        }
        if(e.getSource()==b4)
        {
            menu2 m2 = new menu2();
            f2.setVisible(false);
            
            
        }
    }
}
