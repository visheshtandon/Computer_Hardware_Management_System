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
public class menu3 implements ActionListener
{

    JButton jButton1,jButton2,jButton3,jButton4,jButton5;
    JTextField jt1,jt2,jt3;
    JLabel l1,l2,l3;
    jdbc j = new jdbc();
    JFrame f1=new JFrame();
    JFrame f2= new JFrame();
    JFrame f3 = new JFrame();
    customer c = new customer();
    product p = new product();
    String mnumber1,type,name;
    long mnumber2;
    
    menu3()
    {
        f1.setVisible(true);
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        jt1 = new JTextField();
        jt2= new JTextField();
        jt3 = new JTextField();
        
        l1.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setText("ENTER CUSTOMER MOBILE NUMBER:");
        
        l2.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setText("ENTER PRODUCT NAME:");
        
        l3.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        l3.setHorizontalAlignment(SwingConstants.CENTER);
        l3.setText("ENTER PRODUCT TYPE:");
        
        
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        
        f1.setSize(new Dimension(500, 500));
        f2.setSize(new Dimension(500, 500));
        f3.setSize(new Dimension(500, 500));
        
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton1.setText("DELETE CUSTOMER");
        
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        jButton5.addActionListener(this);
        
        jButton2.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton2.setText("DELETE PRODUCT");
        
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton3.setText("BACK");
        
        jButton4.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton4.setText("SUBMIT");
        
        jButton5.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton5.setText("SUBMIT");
        
        f1.setLayout(new GridLayout(3,1));
        f2.setLayout(new GridLayout(3,1));
        f3.setLayout(new GridLayout(5,1));
        
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
        f1.add(jButton3);
        //f1.add(jButton3);
        
        f2.add(l1);
        f2.add(jt1);
        f2.add(jButton4);
        
        f3.add(l2);
        f3.add(jt2);
        f3.add(l3);
        f3.add(jt3);
        f3.add(jButton5);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource()==jButton3)
        {
            f1.setVisible(false);
            menu m = new menu();
        }
        if(e.getSource()==jButton1)
        {
            f1.setVisible(false);
            f2.setVisible(true);
        }
        if(e.getSource()==jButton4)
        {
            mnumber1 = jt1.getText();
            mnumber2 = Long.parseLong(mnumber1);
            j.deletec(c,mnumber2);
            f2.setVisible(false);
            menu3 m2 = new menu3();
        }
        if(e.getSource()==jButton2)
        {
            f1.setVisible(false);
            f3.setVisible(true);
        }
        if(e.getSource()==jButton5)
        {
            name = jt2.getText();
            type = jt3.getText();
            j.deletep(p,name,type);
            menu3 m2 = new menu3();
        }
    }
    
}
