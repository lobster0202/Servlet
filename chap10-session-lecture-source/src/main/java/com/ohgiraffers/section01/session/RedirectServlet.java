package com.ohgiraffers.section01.session;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println("redirect session id : " + session.getId());

        /* 세션에 담긴 모든 Attribute 키 목록을 반환 받을 수 있다. */
        Enumeration<String> sessionNames = session.getAttributeNames();
        while (sessionNames.hasMoreElements()) {
            System.out.println(sessionNames.nextElement());
        }

        /* setAttribute한 값을 getAttribute로 꺼낼 수 있다.*/
        String firstName = (String) session.getAttribute("firstName");
        String lastName = (String) session.getAttribute("lastName");

        StringBuilder responseBuilder = new StringBuilder();
        responseBuilder.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1>Your first name is ")
                .append(firstName)
                .append(" and last name is ")
                .append(lastName)
                .append("</h1>\n")
                .append("</body>\n")
                .append("</html>");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.print(responseBuilder.toString());
        out.close();
    }
}
