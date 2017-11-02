package com.loban.servlet04.controller.servlets;

import com.loban.servlet04.dao.ManufacturerDAO;
import com.loban.servlet04.model.Manufacturer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ManufacturerDel extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        String manufacturerIdStr = req.getParameter("manufact_id");
        int manufacturerId = Integer.parseInt(manufacturerIdStr);

        ManufacturerDAO.delete(manufacturerId);

        resp.getWriter().println("Manufacturer succesfull delete");

        resp.getWriter().println("<br>");
        resp.getWriter().println("<a href =\"/module05/listManufacturers\"> List of Manufacturers</a>");
    }
}
