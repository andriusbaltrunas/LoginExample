package com.our.system.servlet;

import com.our.system.exception.WrongUserCredentialsException;
import com.our.system.service.LoginService;
import com.our.system.vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by andriusbaltrunas on 10/20/2017.
 */

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        LoginService loginService = new LoginService();

        try {
            User user = loginService.login(userName, password);
            if (user != null) {
                req.getSession().setAttribute("user", user);
                req.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(req, resp);
            } else {
                req.setAttribute("errorMsg", "Tokio vartotojo nera!");
                req.getRequestDispatcher("/WEB-INF/loginForm.jsp").forward(req, resp);
            }
        } catch (WrongUserCredentialsException e) {
            req.setAttribute("errorMsg", "Blogai uzpildyti duomenys");
            req.getRequestDispatcher("/WEB-INF/loginForm.jsp").forward(req, resp);
        }
    }
}
