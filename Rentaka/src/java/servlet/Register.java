
package servlet;


import Dao.RegisterDao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chaks
 */
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    PrintWriter out = response.getWriter();
 String first_name = request.getParameter("fname");
            String last_name = request.getParameter("lname");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
           // int contact = Integer.parseInt(request.getParameter("contact"));
           String contact = request.getParameter("contact");
           
            String aadhar = request.getParameter("aadhar");
            String dl = request.getParameter("dl");
            String password = request.getParameter("password");
            
        
        
            if(RegisterDao.insert(first_name,last_name,address,email,contact,aadhar,dl,password))
            {
                //RequestDispatcher rd=request.getRequestDispatcher("servlet2");
                //rd.forward(request,response);
                //out.println("alert('Hurray!! Login successful');");
                out.println("Registration SUCCESS");
               response.sendRedirect("Home.jsp");
            }
            else{
                out.print("Registration Failed");
                // RequestDispatcher rd=request.getRequestDispatcher("index.html");
                //rd.include(request,response);
            }
    }
}
