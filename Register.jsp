<%-- 
    Document   : Register
    Created on : 11 Sep, 2018, 2:03:38 PM
    Author     : chaks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Register" method="post">
        REGISTRATION
        FIRST NAME: <input type="text" name="fname"><br>
        LAST NAME: <input type="text" name="lname"><br>
<!--        DOB: <input type="date" name="dob" value="" />-->
        Address: <input type="text" name="address" value="" /><br>
        E-mail: <input type="text" name="email" value="" /><br>
        Contact: <input type="text" name="contact" value="" /><br>
        Aadhar: <input type="text" name="aadhar" value="" /><br>
        Driving License: <input type="text" name="dl" value="" /><br>
        Password: <input type="password" name="password" value="" /><br>
        <input type="submit" name="submit" value="register">
        </form>
    </body>
</html>
