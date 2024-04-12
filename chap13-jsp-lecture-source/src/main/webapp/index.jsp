<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<%-- JAVA SERVER PAGE = JSP
JSP =>

JSP는 Servlet의 단점을 극복하기 위해 만들어짐
Servlet의 단점은 뭔가를 새로 만들면 서버를 계속 다시 만들어줘야 했는데
JSP 같은 경우는 변경된 점을 체크를 하고 플래그 신호를 터트린 뒤 translation을 함 --%>
<head>
  <title>JSP</title>
</head>
<body>
  <h1>JSP</h1>
  <ul>
    <li><a href="jsp/1_simpleJspStates.jsp">jsp 기본 문법</a></li>
    <li><a href="jsp/2_pageDirective.jsp">page 지시자 태그</a></li>
    <li><a href="jsp/3_includeDirective.jsp">include 지시자 태그</a></li>
    <li><a href="jsp/4_request.jsp">jsp를 이용한 응답처리(forward)</a></li>
    <li><a href="jsp/5_response.jsp">jsp를 이용한 응답처리(forward)</a></li>
  </ul>
</body>
</html>