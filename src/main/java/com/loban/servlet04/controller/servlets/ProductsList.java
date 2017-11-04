package com.loban.servlet04.controller.servlets;

import com.loban.servlet04.dao.ProductDAO;
import com.loban.servlet04.model.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProductsList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/jsp/add_customer.jsp").forward(req, resp);
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");

        resp.getWriter().println("<a href=\"/module05/\">back</a>");

        List<Product> list = ProductDAO.findAll();
        resp.getWriter().println("<h3>List of Products</h3>");
        resp.getWriter().println("<br/>");
        resp.getWriter().println("<a href=\"/module05/addProduct\">NEW</a>");
        resp.getWriter().println("<br/>");
        for(Product product: list ){
            int productId = product.getId();
            String productName = product.getNameProduct()+", "+ product.getPrice().toString()
                    +", "+ product.getManufacturer();
            String link = "<a href=\"/module05/editProduct?product_id="+productId+" \">"+productName +"</a>";

            resp.getWriter().println(link);
            resp.getWriter().println("______________");
            resp.getWriter().println("<a href=\"/module05/deleteProduct?product_id="+
                    productId+"\">Delete</a>");

            resp.getWriter().println("<br/>");
        }

    }
}
