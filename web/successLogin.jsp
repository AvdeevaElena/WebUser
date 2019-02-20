
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Страница успешного входа в систему</title>
</head>
<body>
<br>
<h1>Вход посетителя в систему прошел успешно</h1>


<jsp:useBean id="user" class="beans.User" scope="application"/>
Пользователь: <%= user.getUser()%><br>
Email: <%= user.getEmail()%><br>


<jsp:useBean id="zones" class="beans.JsonDTO" scope="application"/>
JSON: <%= zones.zones%><br>

</body>
</html>
