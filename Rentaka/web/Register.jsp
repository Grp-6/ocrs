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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
      border-color: #333333;
      height: 52px;
      background-color: #333333;
    }
    .navbar .li{
        margin: 10px;;
    }
    #myCarousel{
        /*width: 100%;*/   
        width: 100%;    /*revert back to 100% if any issues*/
        height: 600px;
        text-align: center;
        padding-top: 210px;
        padding-bottom: 210px;
        background-image: url("img/Meter.jpg");
        filter: blur(15px);
        background-color: #999999;
        background-position: center; /* Center the image */
        background-repeat: no-repeat; /* Do not repeat the image */
        background-size: cover; /* Resize the background image to cover the entire container */
        border: solid 5px #000;
    }
   
    #reg{
        color: white;
        text-align: center;
    }
    
    .register-div{
        position: absolute;
        left: 25%;
        top: 12%;
        background-color: transparent;
        width: 50%;
        height: 50%;
 /*     color: white;*/
        /*border-radius: 10px;*/
/*        -webkit-backdrop-filter: blur(10px);
        -moz-backdrop-filter: blur(10px);
        -o-backdrop-filter: blur(10px);*/
        /*backdrop-filter: blur(10px);*/
        -webkit-backdrop-filter: blur(10);
    }
    
    .register-form-txt {
        width: 80%;
        padding-left: 10px;
        padding-right: 10px;
        padding-top: 5px;
        padding-bottom: 5px;
        margin-top: 10px;
        margin-bottom: 10px;
        margin-left: 75px;
        background-color: #eee;
        border: none;
        border-radius: 5px;
        /*box-shadow: 0px 0px 500px 0px #333;*/
        transition: 0.5s;
    }
    .register-form-txt:focus {
        background-color: #fff;
    }
    .register-btn {
        position: relative;
        top: 20px;
        left: 35%;
        width: 30%;
        padding: 5px;
        height: auto;
        border: none;
        border-radius: 5px;
        box-shadow: 0px 0px 50px 0px #333;
    }
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
        
      display: none; 
    }
  }
  </style>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
        <a class="navbar-brand" href="#"><img src="img\Rentaka.png" width="82" height="30" alt="" title="" /></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="Home.jsp"><span class="glyphicon glyphicon-home"></span> Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Cars & Tariffs</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-earphone"></span> Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="Register.jsp"><span class="glyphicon glyphicon-user"></span> Register</a></li>
      </ul>
    </div>
  </div>
</nav>
        <div id="myCarousel" class="container text-center"></div>
        <div class="register-div">
        <form action="Register" method="post">
            <div id="reg">  REGISTRATION<br></div>
            <input type="text" name="fname" placeholder="FIRST NAME" class="register-form-txt fname"><br>
        <input type="text" name="lname" placeholder="LAST NAME" class="register-form-txt lname"><br>
<!--        DOB: <input type="date" name="dob" value="" />-->
        <input type="text" name="address" placeholder="Address" class="register-form-txt address"><br>
        <input type="text" name="email" placeholder="E-mail" class="register-form-txt email"><br>
        <input type="text" name="contact" placeholder="Contact" class="register-form-txt contact"><br>
        <input type="text" name="aadhar" placeholder="Aadhar no." class="register-form-txt aadhar"><br>
        <input type="text" name="dl" placeholder="Driving license" class="register-form-txt dl"><br>
        <input type="password" name="password" placeholder="Password" class="register-form-txt password"><br>
        <input type="submit" name="submit" value="Register" class="register-btn">
        </form>
  </div>      
<footer class="container-fluid text-center">
  <p> Created with <span class="glyphicon glyphicon-heart"></span> by AJAC</p>
</footer>
    </body>
</html>
