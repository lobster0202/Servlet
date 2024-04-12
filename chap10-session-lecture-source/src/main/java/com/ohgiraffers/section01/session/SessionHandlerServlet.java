package com.ohgiraffers.section01.session;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
@WebServlet("/session")
public class SessionHandlerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        HttpSession session = request.getSession();

        // getMaxInactiveInterval :세션의 최대 유효 시간(초 단위)을 설정하는 데 사용
        // HttpSession은 인터페이스라서 직접 생성할 수 없고 request에 있는 getSession메소드를 이용해 리턴 받는다.
        System.out.println("session id : " + session.getId());

        // 기본 유지시간 : 30분
        System.out.println("session default 유지 시간 : " + session.getMaxInactiveInterval());

        session.setMaxInactiveInterval(60 * 10);        // 10분으로 변경
        System.out.println("변경 후 유지 시간 : " + session.getMaxInactiveInterval());

        session.setAttribute("firstName" , firstName);
        session.setAttribute("lastName" , lastName);

        response.sendRedirect("redirect");
    }
}
