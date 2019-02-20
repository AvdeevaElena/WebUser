<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2/19/2019
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Форма входа в систему</title>

</head>

<body>

<br>

<h1>Пожалуйста, введите свой логин и пароль</h1>

<form action="Registration" method="post">
    Login: <input type="text" name="user" size="10"><br>
    Password: <input type="password" name="password" size="10"><br>
    <p>
    <table>
        <tr>
            <th><small>
                <input type="submit" name="login" value="Войти в систему">
            </small>
            <th><small>
                <input type="submit" name="registration" value="Зарегистрироваться">
            </small>
    </table>
</form>
<br>
</body>
</html>