package com.servlets.practice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*; 
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet { 
     public void doPost(HttpServletRequest request,HttpServletResponse res)throws ServletException,IOException{
         System.out.println("sucees.....");
         res.setContentType("text/html"); 
          PrintWriter out=res.getWriter();
          out.println("<he>Welcome to Register Servlet </h2>"); 
          String name=request.getParameter("user_name"); 
          String password=request.getParameter("user_password");
          String email=request.getParameter("user_email");
          String gender=request.getParameter("user_gender");
          String cource=request.getParameter("user_cource"); 
          
          String cond=request.getParameter("condition"); 
          
          if(cond!=null){
          if(cond.equals("checked")){ 
                 out.println("<h2>Name: "+name+"</h2>");
                 out.println("<h2>Password: "+password+"</h2>");
                 out.println("<h2>Email: "+email+"</h2>"); 
                 out.println("<h2>Gender: "+gender+"</h2>"); 
                 out.println("<h2>Cource "+cource+"</h2>");  
                 //jdbc
          } 
          
          else{
              out.println("<h2>You have not accepted terms and conditions </h2>");
          }  
          }
           else{
              out.println("<h2>You have not accepted terms and conditions </h2>");
          }
                 
     }
    
}
