<%-- 
    Document   : login
    Created on : 11 Sep, 2018, 10:08:51 PM
    Author     : chaks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
        height: 490px;
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
    
    .login-div {
        position: absolute;
        left: 25%;
        top: 20%;
        background-color: transparent;
        width: 50%;
        height: 50%;
        /*border-radius: 10px;*/
/*        -webkit-backdrop-filter: blur(10px);
        -moz-backdrop-filter: blur(10px);
        -o-backdrop-filter: blur(10px);*/
        /*backdrop-filter: blur(10px);*/
        -webkit-backdrop-filter: blur(10);
    }
    .login-form-txt {
        width: 120%;
        padding-left: 10px;
        padding-right: 10px;
        padding-top: 5px;
        padding-bottom: 5px;
        margin-top: 10px;
        margin-bottom: 10px;
        margin-left: -20px;
        background-color: #eee;
        border: none;
        border-radius: 5px;
        /*box-shadow: 0px 0px 500px 0px #333;*/
        transition: 0.5s;
    }
    .login-form-txt:focus {
        background-color: #fff;
    }
    .login-btn {
        position: relative;
        top: 180px;
        left: 35%;
        width: 30%;
        padding: 5px;
        height: auto;
        border: none;
        border-radius: 5px;
        box-shadow: 0px 0px 50px 0px #333;
    }
    .register-container {
        position: absolute;
        left: 0%;
        top: 80%;
        width: 100%;
        color: white;
        text-align: center;
    }
    .register-a {
        color: white;        
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
        <div id="myCarousel"></div>
        <div class="login-div">
            <form action="login" method="post">
                <div class="login-div">
                    <input type="text" name="email" placeholder="Username or Email" class="login-form-txt username"><br>
                    <input type="password" name="pass" placeholder="Password" class="login-form-txt password"><br>
                </div>
            <input type="submit" name="submit" value="LOG IN" class="login-btn"> 
            </form>
            <div class="register-container">
            Not Registered yet? <a href="Register.jsp" class="register-a">
                <span class="glyphicon glyphicon-user"></span> <b>Register</b></a>
            </div>
        </div>
<footer class="container-fluid text-center">
  <p> Created with <span class="glyphicon glyphicon-heart"></span> by AJAC</p>
</footer>
        </body>
</html>
