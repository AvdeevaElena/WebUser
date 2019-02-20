
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<h1>Registration</h1>

<form action="AddUser" method="post">

    Login: <input type="text" name="user" size="10"><br>

    Passworld: <input type="password" name="password" size="10"><br>

    Email: <input type="text" name="email"><br>
    <p>
    <table>
        <tr>
            <th><small>
                <input type="submit" name="save" value="Сохранить">
            </small>
            <th><small>
                <input type="submit" name="cancel" value="Выйти">
            </small>
    </table>
</form>
</body>
</html>