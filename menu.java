/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Vishesh Tandon
 */
public class menu implements ActionListener
{
    JButton jButton1,jButton2,jButton3,jButton4,jButton5;
    JLabel jLabel1;
    JFrame f1=new JFrame();
    menu()
    {
        jLabel1 = new JLabel();
        
        f1.setVisible(true);
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();

        f1.setSize(new Dimension(500, 500));

        jLabel1.setFont(new Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO S.T.A.R ELECTRONICS");
        jLabel1.setToolTipText("");

        
        
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton1.setText("DISPLAY");
        
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        jButton5.addActionListener(this);
        
        jButton2.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton2.setText("ADD ");

        jButton3.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton3.setText("DELETE");
        
        jButton4.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton4.setText("MODIFY");

        jButton5.setFont(new Font("Comic Sans MS", 3, 12)); // NOI18N
        jButton5.setText("CLOSE");

        f1.setLayout(new GridLayout(6,1));
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
        
        f1.add(jLabel1);
        
        f1.add(jButton1);
        f1.add(jButton2);
        f1.add(jButton3);
        f1.add(jButton4);
        f1.add(jButton5);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        String s1=jButton5.getText();
        
        if(e.getSource()==jButton5)
        {
            f1.setVisible(false);
            System.exit(1);
        }
        if(e.getSource()==jButton1)
        {
            f1.setVisible(false);
            menu1 m1 = new menu1();
        }
        if(e.getSource()==jButton2)
        {
            f1.setVisible(false);
            menu2 m2 = new menu2();
        }
        if(e.getSource()==jButton3)
        {
            f1.setVisible(false);
            menu3 m3 = new menu3();
        }
        if(e.getSource()==jButton4)
        {
            f1.setVisible(false);
            menu4 m4 = new menu4();
        }
        /*if(e.getSource()==b1)
        {
            cid1 = t1.getText();
            c1.cid = Integer.valueOf(cid1);
            c1.cname = t2.getText();
            c1.gender = t3.getText();           
            age1 = t4.getText();
            c1.age = Integer.parseInt(age1);    
            c1.address = t5.getText();
            mnumber1 = t6.getText();
            c1.mnumber = Long.parseLong(mnumber1);
            
            jdbc j = new jdbc();
            j.insertc(c1);
        }*/
        //To change body of generated methods, choose Tools | Templates.
    }

    
    

    
    
    

    
}
