/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online_car_rental_syatem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class DatabaseConnection
{
    private Connection conn;
    private Statement stmt;
    private ResultSet res;
    public Connection setConnection()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver]");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/online_car_rental_system", "ashima", "ashima");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
    public ResultSet getResult(String sql, Connection conn)
    {
        this.conn=conn;
        try
        {
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
        }
        catch (Exception e)
        {
            System.out.println("I found error here");
        }
        return res;
    }
}
