package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Deployment Success</title></head>");
        out.println("<body style='font-family: Arial; text-align:center; background-color:#f4f4f4; padding-top:100px;'>");
        out.println("<div style='display:inline-block; background:white; padding:40px; border-radius:10px; box-shadow:0 0 10px gray;'>");
        out.println("<h1 style='color:green;'>Deployment Successful</h1>");
        out.println("<p style='font-size:20px;'>GitHub -> Jenkins -> Docker -> Tomcat11</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
