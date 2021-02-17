/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import domain.AccountService;
import domain.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rcgam
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(request.getParameter("logout")!=null){
            session.invalidate();
            session = request.getSession();
            request.setAttribute("message", "You have sucessfully logged out.");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        else

            if(session.getAttribute("user") != null)
                response.sendRedirect("home");
            else
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        

        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        request.setAttribute("username", username);
        if( username.length() == 0 || password.length() == 0){
            request.setAttribute("message", "Please fill out both fields.");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        AccountService a = new AccountService();
        User u = a.login(username, password);
        if(u != null){
            HttpSession session = request.getSession();
            session.setAttribute("user", u);
            response.sendRedirect("home");
        }
        else{
        request.setAttribute("message", "Incorrect username or password");
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);}
    }


}