/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.sql.*;

/**
 *
 * @author Vishesh Tandon
 */
public class jdbc 
{
    int billam;
    //int flag=0;
    public void insertp(product p)
    {
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/vishesh","root","root");
            Statement stmt;
            stmt = con.createStatement();
            int rows;
            rows = stmt.executeUpdate("insert into product values('"+p.pid+"','"+p.pname+"','"+p.ptype+"',"+p.rate+")");
            System.out.println(rows + " rows effected.");
        } 
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        }
    }
    public void insertc(customer c)
    {
       
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/vishesh","root","root");
            Statement stmt;
            stmt = con.createStatement();
            int rows;
            rows = stmt.executeUpdate("insert into customer values("+c.cid+",'"+c.cname+"','"+c.gender+"',"+c.age+",'"+c.address+"',"+c.mnumber+")");
            System.out.println(rows + " rows effected.");
        } 
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        } 
    }
    public void insertb(bill b,tbill b1)
    {
        //b.bnum= b1.bnumber;
        try
        {  
            
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost/vishesh","root","root");
                Statement stmt;
                stmt = con.createStatement();
                int rows,rows1,rows2;
                ResultSet rs = stmt.executeQuery("select max(bnumber)+1 as bnumber from tbill");
                rs.next();
                    
                int bnum=rs.getInt(1);
            
                rows1 = stmt.executeUpdate("insert into tbill values("+bnum+")");
                System.out.println(rows1 + " rows effected.");
            //b.bnum=b1.bnumber;
            
                rows= stmt.executeUpdate("insert into bill values("+bnum+","+b.mnum+",'"+b.pid+"',"+b.quantity+")");
           
                System.out.println(rows + " rows effected.");
           
            //System.out.println(rows + " rows effected.");
        } 
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        } 
    }
    public void insertb1(bill b,tbill b1)
    {
        //b.bnum= b1.bnumber;
        try
        {  
            
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost/vishesh","root","root");
                Statement stmt;
                stmt = con.createStatement();
                int rows,rows1,rows2;
                ResultSet rs = stmt.executeQuery("select max(bnumber) as bnumber from tbill");
                rs.next();
                    
                int bnum=rs.getInt(1);
            
                //rows1 = stmt.executeUpdate("insert into tbill values("+bnum+")");
                //System.out.println(rows1 + " rows effected.");
            //b.bnum=b1.bnumber;
            
                rows= stmt.executeUpdate("insert into bill values("+bnum+","+b.mnum+",'"+b.pid+"',"+b.quantity+")");
           
                System.out.println(rows + " rows effected.");
           
            //System.out.println(rows + " rows effected.");
        } 
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        } 
    }
    public void insertb2(bill b,tbill b1)
    {
        //b.bnum= b1.bnumber;
        try
        {  
            
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost/vishesh","root","root");
                Statement stmt;
                stmt = con.createStatement();
                int rows,rows1,rows2;
                ResultSet rs = stmt.executeQuery("select max(bnumber)+1 as bnumber from tbill");
                rs.next();
                    
                int bnum=rs.getInt(1);
            
                rows1 = stmt.executeUpdate("insert into tbill values("+bnum+")");
                System.out.println(rows1 + " rows effected.");
            //b.bnum=b1.bnumber;
            
                rows= stmt.executeUpdate("insert into bill values("+bnum+","+b.mnum+",'"+b.pid+"',"+b.quantity+")");
           
                System.out.println(rows + " rows effected.");
           
            //System.out.println(rows + " rows effected.");
        } 
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        } 
    }
    public void deletec(customer c,long mnumber1)
    {
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/vishesh","root","root");
            Statement stmt;
            stmt = con.createStatement();
            int rows,rows1;
            //rows = stmt.executeUpdate("delete from bill where b.cid = (select c.cid from customer where c.mnumber= mnumber1");
            rows1 = stmt.executeUpdate("delete from customer where  mnumber = '"+mnumber1+"' ");
            //rows = stmt.executeUpdate("insert into customer values("+c.cid+",'"+c.cname+"','"+c.gender+"',"+c.age+",'"+c.address+"',"+c.mnumber+")");
            System.out.println(rows1 + " rows effected.");
        } 
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        } 
    }
    public void deletep(product p,String name,String type)
    {
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/vishesh","root","root");
            Statement stmt;
            stmt = con.createStatement();
            int rows,rows1;
            //rows = stmt.executeUpdate("delete from bill where b.cid = (select c.cid from customer where c.mnumber= mnumber1");
            rows1 = stmt.executeUpdate("delete from product where  ptype = '"+type+"' and pname = '"+name+"' ");
            //rows = stmt.executeUpdate("insert into customer values("+c.cid+",'"+c.cname+"','"+c.gender+"',"+c.age+",'"+c.address+"',"+c.mnumber+")");
            System.out.println(rows1 + " rows effected.");
        } 
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        } 
    }
    public void modifyc(customer c)
    {
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/vishesh","root","root");
            Statement stmt;
            stmt = con.createStatement();
            int rows,rows1;
            //rows = stmt.executeUpdate("delete from bill where b.cid = (select c.cid from customer where c.mnumber= mnumber1");
            rows1 = stmt.executeUpdate("update customer set cname= '"+c.cname+"' , gender = '"+c.gender+"', age= "+c.age+" , address = '"+c.address+"' , mnumber = "+c.mnumber+" where cid = "+c.cid+" ");
            //rows = stmt.executeUpdate("insert into customer values("+c.cid+",'"+c.cname+"','"+c.gender+"',"+c.age+",'"+c.address+"',"+c.mnumber+")");
            System.out.println(rows1 + " rows effected.");
        } 
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        } 
    }
    public void modifyp(product p)
    {
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/vishesh","root","root");
            Statement stmt;
            stmt = con.createStatement();
            int rows,rows1;
            //rows = stmt.executeUpdate("delete from bill where b.cid = (select c.cid from customer where c.mnumber= mnumber1");
            rows1 = stmt.executeUpdate("update product set pname = '"+p.pname+"', ptype = '"+p.ptype+"', rate =  "+p.rate+" where pid = '"+p.pid+"'");
            //rows = stmt.executeUpdate("insert into customer values("+c.cid+",'"+c.cname+"','"+c.gender+"',"+c.age+",'"+c.address+"',"+c.mnumber+")");
            System.out.println(rows1 + " rows effected.");
        } 
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        } 
    }
    public void displayc()
    {
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/vishesh","root","root");
            Statement stmt;
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from customer;");
            while(rs.next())
                System.out.println("  " + rs.getInt(1) + "  " + rs.getString(2)+"  " + rs.getString(3) + "  " + rs.getInt(4) + "  " +  rs.getString(5) + "  " + rs.getLong(6));  
        } 
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        } 
    }
    
    public void displayp()
    {
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/vishesh","root","root");
            Statement stmt;
            stmt = con.createStatement();
            ResultSet rs1= stmt.executeQuery("select * from product;");
              while(rs1.next())
                System.out.println("  " + rs1.getString(1) + "  " + rs1.getString(2)+"  " + rs1.getString(3) + "  " + rs1.getInt(4) + "  ");  
        } 
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        } 
    }
    public void displayb()
    {
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/vishesh","root","root");
            Statement stmt;
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from bill order by bnum;");
            while(rs.next())
                System.out.println("  " + rs.getString(1) + "  " + rs.getLong(2)+"  " + rs.getString(3) + "  " + rs.getInt(4) + "  ");  
        } 
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        } 
    }
    public int displayb1(int bnum)
    {
        //int billam;
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/vishesh","root","root");
            Statement stmt;
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select sum(rate*quantity) from product,bill where product.pid=bill.pid and bill.bnum = "+bnum+" group by bnum;");
            rs.next();
            billam =rs.getInt(1);
                //System.out.println("  " + rs.getInt(1)+ "  ");  
        } 
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        } 
        return billam;
    }
    
}
