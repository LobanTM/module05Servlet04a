package com.loban.servlet04.controller.servlets;

import com.loban.servlet04.dao.ProductDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductEdit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("product", ProductDAO.readById(Integer.parseInt(req.getParameter("product_id"))));
//        req.getAttribute("listProduct", ProductDAO.findAll());
        req.getRequestDispatcher("/jsp/productEdit.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
