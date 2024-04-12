package com.ohgiraffers.section03.requestlistener;

import com.ohgiraffers.section02.sessionlistener.UserDTO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
@WebServlet("/request")
public class RequestListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("username","panda");
        request.setAttribute("age",20);
        request.setAttribute("job","teacher");

        request.setAttribute("username", "Panda");

        request.removeAttribute("age");

    }
}
