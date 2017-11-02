package com.loban.servlet04.controller.servlets;

import com.loban.servlet04.dao.ProductDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductDel extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String productIdStr = req.getParameter("product_id");
        int productId = Integer.parseInt(productIdStr);

        ProductDAO.delete(productId);

        resp.getWriter().println("Product succesfull delete");

        resp.getWriter().println("<br>");
        resp.getWriter().println("<a href =\"/module05/listProducts\"> List of Products</a>");
    }
}
