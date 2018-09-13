/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import java.io.PrintWriter;
import java.sql.*; 

/**
 *
 * @author chaks
 */
public class LoginDao {
    

public static void main(String [] args)
{
    System.out.println("Database Class");
}
 
public static boolean validate(String EMAIL ,String PASSWORD){  
boolean status=false;  
try{  
     
  System.out.println("DATABASE CLASS");
Class.forName("org.apache.derby.jdbc.ClientDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:derby://localhost:1527/RENTAKA","rentaka","rentaka");  
      
PreparedStatement ps=con.prepareStatement(  
"select * from USER_DATA1 where EMAIL=? and PASSWORD=?");  
ps.setString(1,EMAIL);  
ps.setString(2,PASSWORD);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  

