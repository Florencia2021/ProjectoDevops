package Servlet.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final String USERNAME = "user";
    private static final String PASSWORD = "pass";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            response.sendRedirect("welcome.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
