<%--
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
<h2>Adding new Manufacturer</h2>

<form action="addManufacturer" method="POST" accept-charset="utf-8">

    <p>Name: </p>
    <input type="text" name="name"/>

    <br>
    <input type="submit" value="Add"/>
</form>
</body>
</html>
