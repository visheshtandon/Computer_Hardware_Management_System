/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;
import java.awt.IllegalComponentStateException;
import java.util.Scanner;
import javax.swing.SwingUtilities;

/**
 *
 * @author Vishesh Tandon
 */
public class Dbms 
{

    /**
     * @param args the command line arguments
     
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        /*jdbc j= new jdbc();
        product p = new product();
        customer c = new customer();
        Scanner sc= new Scanner(System.in);
        p.pid= sc.next();
        sc.nextLine();
        p.pname=sc.nextLine();
        p.ptype=sc.nextLine();
        p.rate=sc.nextInt();
        
        c.cid= sc.nextInt();
        sc.nextLine();
        c.cname=sc.next();
        sc.nextLine();
        c.gender=sc.next();
        c.age=sc.nextInt();
        sc.nextLine();
        c.address=sc.nextLine();
        c.mnumber= sc.nextLong();
        
        j.insertc(c);
        j.insertp(p);
        j.display();
    */
        //fprod f = new fprod();
        //fcust f1 = new fcust();
        //menu m = new menu();
        try
        {
            
            menu m = new menu() ;
        }
        catch(UnsupportedOperationException | IllegalArgumentException | IllegalComponentStateException e)
        {
            System.out.println(e);
        }
       
        
    }
}