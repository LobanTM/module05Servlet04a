package com.loban.servlet04.controller.servlets;

import com.loban.servlet04.dao.ManufacturerDAO;
import com.loban.servlet04.dao.ProductDAO;
import com.loban.servlet04.model.Manufacturer;
import com.loban.servlet04.model.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

public class ProductAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/productAdd.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        try {
            Product product = new Product();
            String name = req.getParameter("name");
            product.setNameProduct(name);

//            BigDecimal price = req.getParameter("price").toString();
            product.setPrice(BigDecimal.valueOf(100));

//            String manufacturerStr = req.getParameter("");
//            int manufacturerId = req.getParameter("");
            Manufacturer manufacturer = ManufacturerDAO.readById(5);
            product.setManufacturer(manufacturer);

            ProductDAO.create(product);
            resp.getWriter().println(product.getNameProduct()+", "+product.getManufacturer());
            resp.getWriter().println("<br/>");
            resp.getWriter().println("Product succesfull added");

        }catch (Exception e){
            resp.getWriter().println("Error adding Product");
        }
        resp.getWriter().println("<br>");
        resp.getWriter().println("<a href =\"/module05/listProducts\"> List of Products</a>");
    }
}
