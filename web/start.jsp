
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="dto" class="beans.DataTransferObject" scope="session" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="utf-8">
    <title>JSP Page</title>
</head>
<body>
<form name="firstform" action="ShowJson" method="POST">
    <c:if test="${not empty dto.listOfJsonZones}">
        <ul id="demozones" type="I">
            <c:forEach var="zones" items="${dto.listOfJsonZones}">
            зоны <li>${zones.zones}<li>
            </c:forEach>
        </ul>
    </c:if>
    <c:if test="${not empty error}">
        <li>${error}</li>
        <c:remove scope="session" var="error"/>
    </c:if>
</form>
</body>
</html>