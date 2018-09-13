<%-- 
    Document   : DisplayCars
    Created on : 12 Sep, 2018, 1:35:26 PM
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
      *{
          border: solid black;
      }
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
        width: 100%;      
    }
    .card{
        border-color: black;
        border: solid 2px #000;
        border-radius: 10px;
        background-color: graytext;
        
    }
    
    .card-layout{
        padding-left: 20px;
        padding-right: 20px;
        padding-top: 5px;
        padding-bottom: 5px;
    }
    
    .details{
        padding: 0 20px;
        flex-grow: 20;
        display: flex;
        justify-content: space-around;
        align-items: flex-start;
        flex-direction: column;
    }
    
    .bac-btn{
        position: absolute;
        top: 50%;
        left: 35%;
        width: 30%;
        padding: 5px;
        padding-top: 10px;
        padding-bottom: 10px;
        height: auto;
        border: none;
        border-radius: 5px;
/*        color: white;*/
        background-color: white;
        box-shadow: 0px 0px 50px 0px #333;
    }
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      position: left;
      min-height:200px;
      filter: blur(5px);
      background-image: cross-fade;
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
        
      display: none; 
    }
    *{
        border:solid #333333 2px;
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
        <li><a href="DisplayCars.jsp">Cars & Tariffs</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-earphone"></span> Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="Register.jsp"><span class="glyphicon glyphicon-user"></span> Register</a></li>
      </ul>
    </div>
  </div>
</nav>
        <div class="card-layout" >
            <div class="card container-fluid" id="card1" onclick="fn()">
                <div class="col-sm-3">
                        <img class="card-img-left" src="img/car.jpg" width="250" height="250" alt="Card image cap">
                </div>
                <div class="details col-sm-7">
                    <table height="250">
                        <tr>
                            <th>Ford</th>
                        </tr>
                        <tr>
                            <td class="col-sm-4">5 seater</td>
                            <td class="col-sm-4">Petrol</td>
                        </tr>
                        <tr>
                            <td>Available</td>
                        </tr>
                    </table>
                </div>
                <div class="details col-sm-2">
                    <table height="250">
                        
                    </table>
                </div>
                
            </div>
        </div>
     <footer class="container-fluid text-center">
  <p> Created with <span class="glyphicon glyphicon-heart"></span> by AJAC</p>
</footer>   
    </body>
</html>

<script>
function fn(){
//    var size=3;
//    var i=size;
//    while(i>size){
        var div = document.getElementById('card1'),
        clone = div.cloneNode(true); // true means clone all childNodes and all event handlers
        clone.id = "card2";
        document.body.appendChild(clone);
//        i++;
//    }
}
</script>