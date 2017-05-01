/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class fcust implements ActionListener
{
    JTextField t1,t2,t3,t4,t6;
    JTextArea t5;
    JButton b1,b2;  
    JLabel j1,j2,j3,j4,j5,j6;
    JFrame f= new JFrame();
    customer c1= new customer();
    String age1,cid1,mnumber1;
    fcust()
    {  
        f.setVisible(true);
        //j1= new JLabel("CUSTOMER ID:");
        j2 = new JLabel("CUSTOMER Name:");
        j3= new JLabel("GENDER:");
        j4 = new JLabel("AGE:");
        j5 = new JLabel("ADDRESS:");
        j6 = new JLabel("CONTACT:");
        t1=new JTextField(10);
        t2=new JTextField(10);  
        t3=new JTextField(10);  
        t4 = new JTextField(10);
        t5 = new JTextArea(10,50);
        t5.setLineWrap(true);
        t5.setWrapStyleWord(true);
        t6 = new JTextField(10);
        b1=new JButton("Submit");  
        //b1.setBounds(50,200,50,50);  
        b2=new JButton("Close");  
        //b2.setBounds(120,200,50,50);  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        f.setLayout(new GridLayout(12,1));
        
        //f.add(j1);
        //f.add(t1);
        f.add(j2);
        f.add(t2);
        f.add(j3);
        f.add(t3);
        f.add(j4);
        f.add(t4);
        f.add(j5);
        f.add(t5);
        f.add(j6);
        f.add(t6);
        f.add(b1);
        f.add(b2);  
        f.setSize(500,500);  
        //f.setLayout(null);  
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {  
//cid2 = Integer.getInteger(cid1);
        //c1.cid=cid2;
//        tf1.setBounds(50,50,150,20);  
        
//        tf2.setBounds(50,100,150,20);  
//        tf3.setBounds(50,150,150,20);  
        /*String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()==b1){  
            c=a+b;  
        }else if(e.getSource()==b2){  
            c=a-b;  
        }  
        String result=String.valueOf(c);  
        tf3.setText(result);  
         */
        String s1=b2.getText();
        
        if(e.getSource()==b2)
        {
            f.setVisible(false);
            System.exit(1);
        }
        if(e.getSource()==b1)
        {
            //cid1 = t1.getText();
            //c1.cid = Integer.valueOf(cid1);
            c1.cname = t2.getText();
            c1.gender = t3.getText();           
            age1 = t4.getText();
            c1.age = Integer.parseInt(age1);    
            c1.address = t5.getText();
            mnumber1 = t6.getText();
            c1.mnumber = Long.parseLong(mnumber1);
            
            jdbc j = new jdbc();
            j.insertc(c1);
            menu2 m = new menu2();
        }
    }  
}