package servlets;
import beans.User;
import beans.UserList;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// TEST 09.08 THis strin new

public class AddUser extends Dispatcher {

    public String getServletInfo(){

        return "Add user servlet";

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext ctx = getServletContext();
        if (request.getParameter("save")!=null){
            String user = request.getParameter("user");
            String password = request.getParameter("password");
            String email = request.getParameter("email");

            User newUser = new User();
            newUser.setUser(user);
            newUser.setPassword(password);
            newUser.setEmail(email);



            ctx.setAttribute("user", newUser);
            boolean res = UserList.addUser(newUser);

            if (res) {
                this.forward("/successRegistration.jsp", request, response);
            } else {
                this.forward("/errorRegistration.jsp", request, response);
            }
        } else if (request.getParameter("cancel")!=null){
            this.forward("/login.jsp", request, response);

        }
    }
}