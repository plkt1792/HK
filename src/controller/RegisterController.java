package controller;

/**
 * Created by Pulkit.singh on 1/8/2015.
 */

import java.io.IOException;

import javax.servlet.http.*;
import javax.servlet.*;
import model.*;

public class RegisterController extends HttpServlet {

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        RequestDispatcher rd = null;

        Authenticator authenticator = new Authenticator();
        boolean result = authenticator.checkUsername(username);
        if (!result) {
            UserRegister ur = new UserRegister();
            ur.register(username,password);
            rd = request.getRequestDispatcher("/index.jsp");
        }
        else{
            rd = request.getRequestDispatcher("/Register.jsp");
        }
        rd.forward(request, response);
    }
}
