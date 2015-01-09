package controller;

/**
 * Created by Pulkit.singh on 1/7/2015.
 */

import java.io.IOException;

import javax.servlet.http.*;
import javax.servlet.*;
import model.*;

public class LoginController extends HttpServlet {

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        RequestDispatcher rd = null;

        Authenticator authenticator = new Authenticator();
        boolean result = false;
        try {
            result = authenticator.authenticate(username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result) {
            rd = request.getRequestDispatcher("/welcome.jsp");
            User user = new User(username, password);
            request.setAttribute("user", user);
        }
        else
        {
            rd = request.getRequestDispatcher("/Error.jsp");
        }
        rd.forward(request, response);
    }

}