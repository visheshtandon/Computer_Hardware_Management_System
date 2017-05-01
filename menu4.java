/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Vishesh Tandon
 */
public class menu4 implements ActionListener
{

    JButton jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8;
    JTextField jt1,jt2,jt3,jt4,jt6,jt7,jt8,jt9,jt10;
    JTextArea jt5;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    jdbc j = new jdbc();
    JFrame f1=new JFrame();
    JFrame f2= new JFrame();
    JFrame f3 = new JFrame();
    JFrame f4 = new JFrame();
    customer c = new customer();
    product p = new product();
    int cid,age;
    String age1,cid1;
    String mnumber1,rate1;
    
    menu4()
    {
        f1.setVisible(true);
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();
        l6 = new JLabel();
        l7 = new JLabel();
        l8 = new JLabel();
        l9 = new JLabel();
        l10= new JLabel();
        
        jt1 = new JTextField();
        jt2= new JTextField();
        jt3 = new JTextField();
        jt4 = new JTextField();
        jt5 = new JTextArea();
        jt5.setLineWrap(true);
        jt5.setWrapStyleWord(true);
        jt6 = new JTextField();
        jt7 = new JTextField();
        jt8 = new JTextField();
        jt9 = new JTextField();
        jt10 = new JTextField();
        
        
        
        l1.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setText("CUSTOMER ID:");
        
        l2.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setText("CUSTOMER NAME:");
        
        l3.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        l3.setHorizontalAlignment(SwingConstants.CENTER);
        l3.setText("GENDER:");
        
        l4.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        l4.setHorizontalAlignment(SwingConstants.CENTER);
        l4.setText("AGE:");
        
        l5.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        l5.setHorizontalAlignment(SwingConstants.CENTER);
        l5.setText("ADDRESS:");
        
        l6.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        l6.setHorizontalAlignment(SwingConstants.CENTER);
        l6.setText("CONTACT:");
        
        l7.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        l7.setHorizontalAlignment(SwingConstants.CENTER);
        l7.setText("PRODUCT ID:");
        
        l8.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        l8.setHorizontalAlignment(SwingConstants.CENTER);
        l8.setText("PRODUCT NAME:");
        
        l9.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        l9.setHorizontalAlignment(SwingConstants.CENTER);
        l9.setText("PRODUCT TYPE:");
        
        l10.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        l10.setHorizontalAlignment(SwingConstants.CENTER);
        l10.setText("RATE:");
        
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        
        
        f1.setSize(new Dimension(500, 500));
        f2.setSize(new Dimension(500, 500));
        f3.setSize(new Dimension(500, 500));
        f4.setSize(new Dimension(500, 500));
        
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton1.setText("MODIFY CUSTOMER");
        
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        //jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        jButton5.addActionListener(this);
        jButton6.addActionListener(this);
        jButton7.addActionListener(this);
        jButton8.addActionListener(this);
        
        jButton2.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton2.setText("MODIFY PRODUCT");
        
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton3.setText("MODIFY BILL");
        
        jButton4.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton4.setText("BACK");
        
        jButton5.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton5.setText("SUBMIT");
        
        jButton6.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton6.setText("BACK");
        
        jButton7.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton7.setText("SUBMIT");
        
        jButton8.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton8.setText("BACK");
        
        f1.setLayout(new GridLayout(3,1));
        f2.setLayout(new GridLayout(7,2));
        f3.setLayout(new GridLayout(5,2));
        
        /*GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        //pack();
        */
        
        f1.add(jButton1);
        f1.add(jButton2);
        //f1.add(jButton3);
        f1.add(jButton6);
        
        //f1.add(jButton3);
        
        f2.add(l1);
        f2.add(jt1);
        f2.add(l2);
        f2.add(jt2);
        f2.add(l3);
        f2.add(jt3);
        f2.add(l4);
        f2.add(jt4);
        f2.add(l5);
        f2.add(jt5);
        f2.add(l6);
        f2.add(jt6);
        f2.add(jButton5);
        f2.add(jButton4);
        
        f3.add(l7);
        f3.add(jt7);
        f3.add(l8);
        f3.add(jt8);
        f3.add(l9);
        f3.add(jt9);
        f3.add(l10);
        f3.add(jt10);
        f3.add(jButton7);
        f3.add(jButton8);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource()==jButton6)
        {
            f1.setVisible(false);
            f2.setVisible(false);
            menu m = new menu();
        }
        if(e.getSource()==jButton1)
        {
            f1.setVisible(false);
            f2.setVisible(true);
        }
        if(e.getSource()==jButton2)
        {
            f1.setVisible(false);
            f3.setVisible(true);
        }
        if(e.getSource()==jButton4)
        {
            f2.setVisible(false);
            f1.setVisible(true);
        }
        if(e.getSource()==jButton5)
        {
            
            cid1 = jt1.getText();
            c.cid = Integer.valueOf(cid1);
            c.cname = jt2.getText();
            c.gender = jt3.getText();           
            age1 = jt4.getText();
            c.age = Integer.parseInt(age1);    
            c.address = jt5.getText();
            mnumber1 = jt6.getText();
            c.mnumber = Long.parseLong(mnumber1);
            
            j.modifyc(c);
            f2.setVisible(false);
            menu4 m4 = new menu4();
        }
        if(e.getSource()==jButton3)
        {
            f1.setVisible(false);
            f2.setVisible(false);
            f3.setVisible(true);
        }
        if(e.getSource()==jButton7)
        {
            
            p.pid = jt7.getText();
            p.pname=jt8.getText();
            p.ptype= jt9.getText();
            rate1 = jt10.getText();
            p.rate = Integer.parseInt(rate1);  
            
            j.modifyp(p);
            f3.setVisible(false);
            menu4 m4 = new menu4();
        }
        if(e.getSource()==jButton8)
        {
            f1.setVisible(false);
            f2.setVisible(false);
            f3.setVisible(false);
            menu m = new menu();
        }
    }
    
}
