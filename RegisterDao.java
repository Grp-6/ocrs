
package Dao;
import java.sql.*;


public class RegisterDao {
    
    public static int insert(String first_name,String last_name,String address,String email,String contact,String aadhar,String dl,String password) throws ClassNotFoundException
    {
   int status =0;  
  //ResultSet rs;
    
    try
  {
Class.forName("org.apache.derby.jdbc.ClientDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:derby://localhost:1527/Rentaka","rentaka","rentaka");  
    
int ID=1;
  
  
  String query = "insert into USER_DATA1 values(?,?,?,?,?,?,?,?,?)";

    PreparedStatement ps = con.prepareStatement(query); // generates sql query

    ps.setInt(1, ID);
    ps.setString(2,first_name);
    ps.setString(3, last_name);
    ps.setString(4, address);
    //ps.setInt(5, Integer.parseInt(age));
    ps.setString(5, email);
    ps.setString(6, contact);
    ps.setString(7, aadhar);
    ps.setString(8, dl);
    ps.setString(9, password);

    //rs = ps.executeUpdate(); // execute it on test database
    
    status= ps.executeUpdate();  
  
 
   
   }
    catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
   //RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
   //rd.forward(request, response);
  
    
return status; 
    
    
    
    }
}