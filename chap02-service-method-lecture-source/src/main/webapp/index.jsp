<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Service Method</title>
</head>
<body>
    <h1>service 메소드의 역할</h1>
    <h3>GET 방식의 요청</h3>
    <h4>a 태그의 href 속성 값 요청</h4>
    <a href="request-service">서비스 메소드 요청하기</a>

    <h4> form 태그의 method 속성을 get으로 설정 (생략 가능)</h4>
<%--    다른건 써야하지만 get은 안써줘도 알아서 get으로 됨--%>
    <form action="request-service" method="get">
        <input type ="submit" value="GET 방식 요청 전송">
    </form>

    <h3>POST 방식의 요청</h3>
    <h4> form 태그의 method 속성을 post로 설정 </h4>
    <form action="request-service" method="get">
        <input type ="submit" value="GET 방식 요청 전송">
    </form>

</body>
</html>