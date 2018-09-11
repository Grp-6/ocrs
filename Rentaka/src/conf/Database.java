/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online_car_rental_syatem.dao;

/**
 *
 * @author ashim
 */

import java.sql.*;

public class Database
{
    static DatabaseConnection dbconn = new DatabaseConnection();
    static Connection conn = dbconn.setConnection();
    public static boolean validate_user(String useremail, String userpassword) throws SQLException
    {
        PreparedStatement stmt=conn.prepareStatement("select COUNT * from client where email=? && password=?");  
        stmt.setString(1, useremail);
        stmt.setString(2, userpassword);
        ResultSet rs = stmt.executeQuery(); 
        int count=0;
        if (rs.next())
            count = rs.getInt(1);
         if(count == 0)
            return false;
         return true;
    }

    public static void add_customer(String email, String password, String first_name, String last_name, long mobile_no, String license_no, long aadhar_number, String address) throws SQLException
    {
        PreparedStatement stmt=conn.prepareStatement("insert into CLIENT(email,password,first_name,last_name,mobile_no,license_no,aadhar_number,address) values (?,?,?,?,?,?,?,?)");  
        stmt.setString(1, email);
        stmt.setString(2, password);
        stmt.setString(3, first_name);
        stmt.setString(4, last_name);
        stmt.setLong(5, mobile_no);
        stmt.setString(6, license_no);
        stmt.setLong(7, aadhar_number);
        stmt.setString(8, address);
        stmt.executeUpdate();
    }

}
