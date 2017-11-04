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
    <%--<% String m = (String) request.getAttribute("nameM");%>--%>
    <% List<Product> products = (List<Product>) request.getAttribute("listOfProducts"); %>
    <% List<Manufacturer> manufacturers = (List<Manufacturer>) request.getAttribute("listOfManufacturers"); %>

   <%--<%= m%>--%>

    <p>Name:  </p>

    <input type="text" hidden name="id" value="<%= product.getId()%>"/>
    <input type="text" name="name" value="<%= product.getNameProduct()%>"/>

    <p>Price: </p>
    <input type="text" name="price" value="<%= product.getPrice()%>"/>
    <% int size = 5;
        if (manufacturers.size()< size) size = manufacturers.size();
    %>

    <p><select size="<%= size %>"  name="manufact">
        <%--<option disabled>products</option>--%>
        <% for (Manufacturer manufacturer : manufacturers ){
            out.print("<option " );
            if(product.getManufacturer()!=null)
                if (manufacturer.getName().equals(product.getManufacturer().getName()))
                 out.print("selected");
            out.println(" value=\""+manufacturer.getId() +"\">"
                    +manufacturer.getName()+"</option>");
        }%>
    </select></p>

    <br>
    <input type="submit" value="Update"/>
</form>
</body>
</html>
