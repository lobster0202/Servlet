<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- HTML 주석은 소스 코드로 보기로 봤을 때 보이고 -->
    <%-- JSP 주석은 소스 코드 보기로 봤을 때 보이지 않아서 클라이언트한테 노출이 안됨 --%>

    <!-- 선언 태그 -->
    <%!
        private String name;
        private int age;
    %>

    <!-- scriptlet 태그 -->
    <%
        // 주석(자바 주석과 동일하다)
        name = "판다";
        age = 20;
        System.out.println("name : " + name);
        System.out.println("age : " + age);

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    %>
    <!-- expression 태그 -->
    <!-- PrintWriter를 이용하여 브라우저에 값을 내보내 브라우저에서 보여지게 한다. -->
    <%-- 여기서 세미콜론을 붙이게 되면 _1_005fsimpleJspStates_jsp에서
         out.print(name;);이 되는거라 세미콜론을 붙이면 안됨           --%>
    name : <%= name %> <br>
    age : <%= age %> <br>

</head>
<body>

</body>
</html>
