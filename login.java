/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Dao.LoginDao;
import java.io.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chaks
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {
    
    public static void main(String [] args)
    {
        System.out.println("hello hello helllo");

    }

  /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        
        String email = request.getParameter("email");
        String pwd = request.getParameter("pass");
        
       PrintWriter out = response.getWriter();
        
        
        
        if(LoginDao.validate(email, pwd)){  
        //RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
        //rd.forward(request,response);  
        //out.println("alert('Hurray!! Login successful');");
        out.println("SUCCESS");
    }  
    else{  
        out.print("Sorry username or password error");  
        RequestDispatcher rd=request.getRequestDispatcher("index.html");  
        rd.include(request,response);  
    } 
        
    
    
    
    
    }

    private void alert(String login_Successful) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    
