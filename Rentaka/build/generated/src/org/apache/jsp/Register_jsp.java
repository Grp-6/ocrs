package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("    /* Remove the navbar's default margin-bottom and rounded borders */ \n");
      out.write("    .navbar {\n");
      out.write("      margin-bottom: 0;\n");
      out.write("      border-radius: 0;\n");
      out.write("      border-color: #333333;\n");
      out.write("      height: 52px;\n");
      out.write("      background-color: #333333;\n");
      out.write("    }\n");
      out.write("    .navbar .li{\n");
      out.write("        margin: 10px;;\n");
      out.write("    }\n");
      out.write("    #myCarousel{\n");
      out.write("        /*width: 100%;*/   \n");
      out.write("        width: 100%;    /*revert back to 100% if any issues*/\n");
      out.write("        height: 600px;\n");
      out.write("        text-align: center;\n");
      out.write("        padding-top: 210px;\n");
      out.write("        padding-bottom: 210px;\n");
      out.write("        background-image: url(\"img/Meter.jpg\");\n");
      out.write("        filter: blur(15px);\n");
      out.write("        background-color: #999999;\n");
      out.write("        background-position: center; /* Center the image */\n");
      out.write("        background-repeat: no-repeat; /* Do not repeat the image */\n");
      out.write("        background-size: cover; /* Resize the background image to cover the entire container */\n");
      out.write("        border: solid 5px #000;\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("    #reg{\n");
      out.write("        color: white;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .register-div{\n");
      out.write("        position: absolute;\n");
      out.write("        left: 25%;\n");
      out.write("        top: 12%;\n");
      out.write("        background-color: transparent;\n");
      out.write("        width: 50%;\n");
      out.write("        height: 50%;\n");
      out.write(" /*     color: white;*/\n");
      out.write("        /*border-radius: 10px;*/\n");
      out.write("/*        -webkit-backdrop-filter: blur(10px);\n");
      out.write("        -moz-backdrop-filter: blur(10px);\n");
      out.write("        -o-backdrop-filter: blur(10px);*/\n");
      out.write("        /*backdrop-filter: blur(10px);*/\n");
      out.write("        -webkit-backdrop-filter: blur(10);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .register-form-txt {\n");
      out.write("        width: 80%;\n");
      out.write("        padding-left: 10px;\n");
      out.write("        padding-right: 10px;\n");
      out.write("        padding-top: 5px;\n");
      out.write("        padding-bottom: 5px;\n");
      out.write("        margin-top: 10px;\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("        margin-left: 75px;\n");
      out.write("        background-color: #eee;\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        /*box-shadow: 0px 0px 500px 0px #333;*/\n");
      out.write("        transition: 0.5s;\n");
      out.write("    }\n");
      out.write("    .register-form-txt:focus {\n");
      out.write("        background-color: #fff;\n");
      out.write("    }\n");
      out.write("    .register-btn {\n");
      out.write("        position: relative;\n");
      out.write("        top: 20px;\n");
      out.write("        left: 35%;\n");
      out.write("        width: 30%;\n");
      out.write("        padding: 5px;\n");
      out.write("        height: auto;\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        box-shadow: 0px 0px 50px 0px #333;\n");
      out.write("    }\n");
      out.write("    /* Add a gray background color and some padding to the footer */\n");
      out.write("    footer {\n");
      out.write("      background-color: #f2f2f2;\n");
      out.write("      padding: 25px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("  /* Hide the carousel text when the screen is less than 600 pixels wide */\n");
      out.write("  @media (max-width: 600px) {\n");
      out.write("    .carousel-caption {\n");
      out.write("        \n");
      out.write("      display: none; \n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\"><img src=\"img\\Rentaka.png\" width=\"82\" height=\"30\" alt=\"\" title=\"\" /></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"Home.jsp\"><span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\n");
      out.write("        <li><a href=\"#\">About</a></li>\n");
      out.write("        <li><a href=\"#\">Cars & Tariffs</a></li>\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-earphone\"></span> Contact</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("        <li><a href=\"Register.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Register</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        <div id=\"myCarousel\" class=\"container text-center\"></div>\n");
      out.write("        <div class=\"register-div\">\n");
      out.write("        <form action=\"Register\" method=\"post\">\n");
      out.write("            <div id=\"reg\">  REGISTRATION<br></div>\n");
      out.write("            <input type=\"text\" name=\"fname\" placeholder=\"FIRST NAME\" class=\"register-form-txt fname\"><br>\n");
      out.write("        <input type=\"text\" name=\"lname\" placeholder=\"LAST NAME\" class=\"register-form-txt lname\"><br>\n");
      out.write("<!--        DOB: <input type=\"date\" name=\"dob\" value=\"\" />-->\n");
      out.write("        <input type=\"text\" name=\"address\" placeholder=\"Address\" class=\"register-form-txt address\"><br>\n");
      out.write("        <input type=\"text\" name=\"email\" placeholder=\"E-mail\" class=\"register-form-txt email\"><br>\n");
      out.write("        <input type=\"text\" name=\"contact\" placeholder=\"Contact\" class=\"register-form-txt contact\"><br>\n");
      out.write("        <input type=\"text\" name=\"aadhar\" placeholder=\"Aadhar no.\" class=\"register-form-txt aadhar\"><br>\n");
      out.write("        <input type=\"text\" name=\"dl\" placeholder=\"Driving license\" class=\"register-form-txt dl\"><br>\n");
      out.write("        <input type=\"password\" name=\"password\" placeholder=\"Password\" class=\"register-form-txt password\"><br>\n");
      out.write("        <input type=\"submit\" name=\"submit\" value=\"Register\" class=\"register-btn\">\n");
      out.write("        </form>\n");
      out.write("  </div>      \n");
      out.write("<footer class=\"container-fluid text-center\">\n");
      out.write("  <p> Created with <span class=\"glyphicon glyphicon-heart\"></span> by AJAC</p>\n");
      out.write("</footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
