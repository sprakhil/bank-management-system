package bankmanagementsystem;

import java.sql.*;  

public class Connec{
    Connection c;
    Statement s;
    public Connec(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","mysql_password");    
            s =c.createStatement();   
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
