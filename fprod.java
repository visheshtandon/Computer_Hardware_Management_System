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

/*
<applet code="fswing" width=300 height=50> 
</applet>
*/

/**
 *
 * @author Vishesh Tandon
 */
public class fprod implements ActionListener
{
    JTextField tf1,tf2,tf3,tf4;  
    JButton jb1,jb2;  
    JLabel l1,l2,l3,l4,l5;
    String rate1;
    JFrame f= new JFrame();
    product p1= new product();
    fprod()
    {  
        f.setVisible(true);
        l1= new JLabel("PRODUCT ID:");
        l2 = new JLabel("PRODUCT Name:");
        l3= new JLabel("PRODUCT Type:");
        l4 = new JLabel("RATE:");
        
        tf1=new JTextField(10);  
//        tf1.setBounds(50,50,150,20);  
        tf2=new JTextField(10);  
//        tf2.setBounds(50,100,150,20);  
        tf3=new JTextField(10);  
//        tf3.setBounds(50,150,150,20);  
        tf4 = new JTextField(10);
        jb1=new JButton("SUBMIT");  
        //b1.setBounds(50,200,50,50);  
        jb2=new JButton("CLOSE");  
        //b2.setBounds(120,200,50,50);  
        jb1.addActionListener(this);  
        jb2.addActionListener(this);  
        f.setLayout(new GridLayout(5,2));
        //f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(l3);
        f.add(tf3);
        f.add(l4);
        f.add(tf4);
        f.add(jb1);
        f.add(jb2);  
        f.setSize(500,500);  
        //f.setLayout(null);  
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {  
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
        String s1=jb2.getText();
        
        if(e.getSource()==jb2)
        {
            f.setVisible(false);
            System.exit(1);
        }
        if(e.getSource()==jb1)
        {
            p1.pid = tf1.getText();
            p1.pname = tf2.getText();
            p1.ptype = tf3.getText();
            rate1 = tf4.getText();
            p1.rate = Integer.parseInt(rate1);
            
            jdbc j = new jdbc();
            j.insertp(p1);
            menu2 m = new menu2();
        }
    }  
}

