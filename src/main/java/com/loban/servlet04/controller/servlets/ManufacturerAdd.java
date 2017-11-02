package com.loban.servlet04.controller.servlets;

import com.loban.servlet04.dao.ManufacturerDAO;
import com.loban.servlet04.model.Manufacturer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ManufacturerAdd extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/manufacturerAdd.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=utf-8");
        try {
            String name = req.getParameter("name");

            Manufacturer manufacturer = new Manufacturer(name);
            ManufacturerDAO.create(manufacturer);

            resp.getWriter().println("Manufacturer succesfull added");

        }catch (Exception e){
            resp.getWriter().println("Error adding Manufacturer");
        }
        resp.getWriter().println("<br>");
        resp.getWriter().println("<a href =\"/module05/listManufacturers\"> List of Manufacturers</a>");
    }
}
