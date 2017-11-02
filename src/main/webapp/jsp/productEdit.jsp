<%@ page import="com.loban.servlet04.model.Manufacturer" %>
<%@ page import="java.util.List" %>
<%@ page import="com.loban.servlet04.dao.ManufacturerDAO" %>
<%@ page import="com.loban.servlet04.dao.ProductDAO" %>
<%@ page import="com.loban.servlet04.model.Product" %>
<%@ page import="static java.lang.System.out" %><%--
  Created by IntelliJ IDEA.
  User: tetya
  Date: 30.10.2017
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h2>Updating Product</h2>

<form action="editProduct" method="POST" accept-charset="utf-8">
                                    <%--передача аттрибутов--%>
    <% Product product = (Product) request.getAttribute("product"); %>

    <p>Name:  </p>

    <input type="text" name="name" value="<%= product.getNameProduct()%>"/>

    <p>Price: </p>
    <input type="text" name="price" value=""/>

    <%--<p><select size="<% out.println(list.size()); %>" multiple name="products[]">--%>
        <%--<option disabled>products</option>--%>

        <%--<% for (Manufacturer manufacturer : list){--%>
            <%--out.println("<option " );--%>
            <%--if (manufacturer.getName().equals(product.getManufacturer().getName()))--%>
                <%--out.println("selected");--%>
            <%--out.println(" value=\""+manufacturer.getName() +"\">"--%>
                    <%--+manufacturer.getName()+"</option>");--%>
        <%--}%>--%>
    <%--</select></p>--%>

    <br>
    <input type="submit" value="Update"/>
</form>
</body>
</html>
