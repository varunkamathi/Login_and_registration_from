package com.example;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.Dao.UserDao;
import com.example.Dao.UserDaoImpl;

public class servelt extends HttpServlet {
 

    private UserDao userDao = new UserDaoImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
         String password = request.getParameter("password");

         if (userDao.isValidUser(username, password)) {
             HttpSession session = request.getSession();
             session.setAttribute("username", username);
             response.sendRedirect("welcome.jsp");
             //System.out.println("Hi - "+username);
         } else {
             response.sendRedirect("login.jsp?error=1");
             System.out.println("Error A gya");
         }
}
}


