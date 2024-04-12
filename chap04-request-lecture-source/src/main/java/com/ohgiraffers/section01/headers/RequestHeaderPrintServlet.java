package com.ohgiraffers.section01.headers;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/headers")
public class RequestHeaderPrintServlet extends HttpServlet {
    // (석현) xml에서 a태그 href 방식으로 하는 것은 get 방식이다.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /* [헤더의 종류]
        * 1. General header : 요청 및 응답 모두에 적용되지만 최종적으로는 body에 전송되는 것과 관련 없는 헤더
        * 2. Request header : Fetch될 리소스나 클라이언트 자체에 대한 상세 정보를 포함하는 헤더
        * 3. Response header : 위치나 서버 자체와 같은 응답에 대한 부가적인 정보를 갖는 헤더
        * 4. Entity header : 컨텐츠 길이나 MIME 타입과 같은 엔티티 body에 대한 상세 정보를 포함하는 헤더
        *                   (요청, 응답 모두 사양되며, 메시지 바디의 컨텐츠를 나타내므로 GET요청은 해당 X)    */

        Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            System.out.println(headerNames.nextElement());
        }

        /*
         * host : 서버의 도메인 네임과 서버가 현재 Listening 중인 TCP포트 지정
         * connection : HTTP 통신이 완료된 후 네트워크 접속을 유지할지 결정
         * sec-ch-ua : 브라우저와 관련된 각 브랜드의 이름 및 주요 버전
         * sec-ch-ua-mobile
         * sec-ch-ua-platform
         * upgrade-insecure-requests
         * user-agent : 현재 사용자가 어떤 클라이언트(OS, browser 포함)을 이용해 보낸 요청인지 명시
         * accept : 요청을 보낼 때 서버에게 요청할 응답 타입 명시
         * sec-fetch-site : 출처(origin)와 요청된 resource 사이의 관계
         * sec-fetch-mode : 요청 모드
         * sec-fetch-user : 사용자가 시작한 요청일 때만 보내짐 (항상 ?1 값 가짐)
         * sec-fetch-dest : 요청 대상
         * referer : 이 페이지 이전에 대한 주소
         * accept-encoding : 응답 시 원하는 인코딩 방식
         * accept-language : 응답 시 원하는 언어
         * cookie
         * */

        /* (GPT)
           host: 클라이언트가 요청하는 서버의 도메인 네임과 포트 번호를 지정합니다.
           connection: 클라이언트가 요청을 완료한 후 네트워크 연결을 유지할지 여부를 지정합니다.
           sec-ch-ua: 브라우저와 관련된 사용자 에이전트의 이름과 주요 버전을 포함합니다.
           sec-ch-ua-mobile: 브라우저가 모바일 디바이스에서 실행 중인지를 나타냅니다.
           sec-ch-ua-platform: 브라우저가 실행 중인 플랫폼을 나타냅니다.
           upgrade-insecure-requests: HTTP 요청을 HTTPS로 업그레이드할 것을 서버에게 알립니다.
           user-agent: 현재 사용자가 요청을 보낼 때 사용하는 클라이언트 소프트웨어의 식별자입니다.
           accept: 클라이언트가 서버로부터 받기를 원하는 미디어 타입을 나타냅니다.
           sec-fetch-site: 요청된 리소스와 출처 사이의 관계를 나타냅니다.
           sec-fetch-mode: 요청의 모드를 지정합니다.
           sec-fetch-user: 요청이 사용자 직접적으로 시작된 것인지 여부를 나타냅니다.
           sec-fetch-dest: 요청 대상의 종류를 지정합니다.
           referer: 현재 요청이 이전 페이지에서 시작된 경우 이전 페이지의 URL을 포함합니다.
           accept-encoding: 서버가 보낼 응답의 인코딩 방식을 지정합니다.
           accept-language: 클라이언트가 선호하는 언어를 나타냅니다.
           cookie: 클라이언트가 서버로 전송하는 쿠키를 포함합니다.*/

        System.out.println("host : " + request.getHeader("host"));
        System.out.println("connection : " + request.getHeader("connection"));
        System.out.println("sec-ch-ua : " + request.getHeader("sec-ch-ua"));
        System.out.println("sec-ch-ua-mobile : " + request.getHeader("sec-ch-ua-mobile"));
        System.out.println("sec-ch-ua-platform : " + request.getHeader("sec-ch-ua-platform"));
        System.out.println("upgrade-insecure-requests : " + request.getHeader("upgrade-insecure-requests"));
        System.out.println("user-agent : " + request.getHeader("user-agent"));
        System.out.println("accept : " + request.getHeader("accept"));
        System.out.println("sec-fetch-site : " + request.getHeader("sec-fetch-site"));
        System.out.println("sec-fetch-mode : " + request.getHeader("sec-fetch-mode"));
        System.out.println("sec-fetch-user : " + request.getHeader("sec-fetch-user"));
        System.out.println("sec-fetch-dest : " + request.getHeader("sec-fetch-dest"));
        System.out.println("referer : " + request.getHeader("referer"));
        System.out.println("accept-encoding : " + request.getHeader("accept-encoding"));
        System.out.println("accept-language : " + request.getHeader("accept-language"));
        System.out.println("cookie : " + request.getHeader("cookie"));

    }

}
