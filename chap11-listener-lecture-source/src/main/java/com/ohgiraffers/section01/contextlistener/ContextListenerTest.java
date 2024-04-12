package com.ohgiraffers.section01.contextlistener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListenerTest implements ServletContextListener, ServletContextAttributeListener {
    /* 1. context ( -> 톰캣 컨테이너 자체에 리스너 연결 )
    * - ServletContextListener : 웹 어플리케이션의 시작/종료에 대한 이벤트 리스터
    * - ServletContextAttributeListener : context에 attribute 추가/수정/삭제에 대한 이벤트 리스너   */
    public ContextListenerTest() {
        System.out.println("context listener 인스턴스 생성");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("context init!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context destroy!");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("context attribute 추가");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("context attribute 제거");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("context attribute 수정");
    }
}
