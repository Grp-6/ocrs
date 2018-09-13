
package Dao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import servlet.Register;


public class RegisterDao {
    
  //static int ID=1;
    
    public static boolean insert(String first_name,String last_name,String address,String email,String contact,String aadhar,String dl,String password) //throws ClassNotFoundException, SQLException
    {
  boolean status = false;
  int rs;
  
    
    try
  {
Class.forName("org.apache.derby.jdbc.ClientDriver");  
Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Rentaka","rentaka","rentaka");



  
  
  //String query = "insert into USER_DATA1 values(?,?,?,?,?,?,?,?,?)";

    PreparedStatement ps = con.prepareStatement("insert into USER_DATA1 (FNAME, LNAME, ADDRESS, EMAIL, CONTACT, AADHAR, DL, PASSWORD) values (?,?,?,?,?,?,?,?) "); // generates sql query

  // ps.setInt(1, ID);
    ps.setString(1,first_name);
    ps.setString(2, last_name);
    ps.setString(3, address);
    //ps.setInt(5, Integer.parseInt(age));
    ps.setString(4, email);
    ps.setString(5, contact);
    ps.setString(6, aadhar);
    ps.setString(7, dl);
    ps.setString(8, password);

    //rs = ps.executeUpdate(); // 
   rs=ps.executeUpdate(); 
   if(rs>0)
   {
   status= true;
   
   }
   
   }
    
    catch (ClassNotFoundException ex) { 
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
   //RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
   //rd.forward(request, response);

return status;
    }
}