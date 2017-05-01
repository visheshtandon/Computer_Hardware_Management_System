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
public class menu2 implements ActionListener
{
    JButton jButton1,jButton2,jButton3,jButton4;
    JFrame f1=new JFrame();
    
    menu2()
    {
        f1.setVisible(true);
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        
        f1.setSize(new Dimension(500, 500));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton1.setText("ADD NEW CUSTOMER");
        
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        
        jButton2.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton2.setText("ADD NEW PRODUCT");

        jButton3.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton3.setText("ADD NEW BILL");
        
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton4.setText("BACK");
        
        f1.setLayout(new GridLayout(2,2));
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
        f1.add(jButton4);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==jButton4)
        {
            f1.setVisible(false);
            menu m = new menu();
        }
        if(e.getSource()==jButton1)
        {
            fcust fc= new fcust();
        }
        if(e.getSource()==jButton2)
        {
            fprod fp = new fprod();
        }
        if(e.getSource()==jButton3)
        {
            fbill fb = new fbill();
        }
        
    }
    
}
