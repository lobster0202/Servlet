package com.ohgiraffers.section01.queryString;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
@WebServlet("/querystring")
public class QueryStringTestServlet extends HttpServlet {

    /* 톰캣 서블릿 컨테이너가 요청 url로 매핑 된 Servlet 클래스의 인스턴스를 생성하여,
    * service 메소드를 호출하고 HttpServlet을 상속 받아
    * 오버라이딩 한 현재 클래스의 doGet 메소드가 동적 바인딩에 의해 호출된다. */
    @Override
    // (석현) 대부분 hashMap으로 돼있기 때문에 넘겨줘야함
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        System.out.println("이름 : " + name);

        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println("나이 : "+ age);

        java.sql.Date birthday = java.sql.Date.valueOf(request.getParameter("birthday"));
        System.out.println("생일 : " + birthday);

        String gender = request.getParameter("gender");
        System.out.println("성별 : " + gender);

        String national = request.getParameter("national");
        System.out.println("국적 : " + national);

        String[] hobbies = request.getParameterValues("hobbies");
        System.out.print("취미 : ");
        for (String hobby : hobbies) {
            System.out.print(hobby + " ");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
