<%@ page import="com.loban.servlet04.model.Manufacturer" %><%--
  Created by IntelliJ IDEA.
  User: tetya
  Date: 30.10.2017
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manufacturer</title>
</head>
<body>
<h2>Updatting Manufacturer</h2>

<form action="editManufacturer" method="POST" accept-charset="utf-8">

    <p>Name: </p>
    <% Manufacturer manuf = (Manufacturer) request.getAttribute("manuf");%>

    <%--<% request.setAttribute("id");%>--%>

    <input type="text" hidden name="id" value="<%= manuf.getId()%>"/>
    <input type="text" name="name" value="<%= manuf.getName()%>"/>

    <br>
    <input type="submit" value="Update"/>
</form>
</body>
</html>
