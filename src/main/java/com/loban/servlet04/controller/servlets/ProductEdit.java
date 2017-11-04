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

public class ProductEdit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("product", ProductDAO.readById(Integer.parseInt(req.getParameter("product_id"))));
//        req.setAttribute("nameM", ProductDAO.readById(Integer.parseInt(req.getParameter("product_id"))).getManufacturer().getName());
        req.setAttribute("listOfProducts", ProductDAO.findAll());
        req.setAttribute("listOfManufacturers", ManufacturerDAO.findAll());

        req.getRequestDispatcher("/jsp/productEdit.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
//            resp.getWriter().println("id = "+id+" , name = "+ name);

            Product product = ProductDAO.readById(id);
            product.setNameProduct(name);

//            resp.getWriter().println("1 <br/>");
//
//            resp.getWriter().println(product.getNameProduct());
//            resp.getWriter().println(product.getPrice());
//            resp.getWriter().println(product.getManufacturer());
//            resp.getWriter().println("<br/>");

            BigDecimal price = BigDecimal.valueOf(Long.parseLong(req.getParameter("price")));
            product.setPrice(price);

            int manufacturerId = Integer.parseInt(req.getParameter("manufact"));

//            resp.getWriter().println(manufacturerId);

            Manufacturer manufacturer = ManufacturerDAO.readById(manufacturerId);

//            resp.getWriter().println(manufacturer);

            product.setManufacturer(manufacturer);

//            resp.getWriter().println("2 <br/>");
//            resp.getWriter().println(product.getNameProduct());
//            resp.getWriter().println(product.getPrice());
//            resp.getWriter().println(product.getManufacturer());

            ProductDAO.update(product);
            resp.getWriter().println(product.getNameProduct()+", "+product.getManufacturer());
            resp.getWriter().println("<br/>");
            resp.getWriter().println("Product succesfull updated");

        }catch (Exception e){
//            resp.getWriter().println(product.getNameProduct()+", "+product.getManufacturer());
//            resp.getWriter().println("<br/>");
            resp.getWriter().println("Error updating Product");
        }
        resp.getWriter().println("<br>");
        resp.getWriter().println("<a href =\"/module05/listProducts\"> List of Products</a>");

    }
}
