
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>В системе</title>
</head>
<body>
<h1>Регистрация посетителя успешно завершена</h1>
<jsp:useBean id="user" class="beans.User" scope="application"/>
Пользователь: <%= user.getUser()%><br>
Email: <%= user.getEmail()%><br>
Зарегистрирован.<br><br>
<a href="login.jsp">Войти в систему</a>
</body>
</html>