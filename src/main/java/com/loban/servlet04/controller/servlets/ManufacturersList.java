package com.loban.servlet04.controller.servlets;

import com.loban.servlet04.dao.ManufacturerDAO;
import com.loban.servlet04.model.Manufacturer;
import com.loban.servlet04.model.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ManufacturersList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");

        resp.getWriter().println("<a href=\"/module05/\">back</a>");

        List<Manufacturer> list = ManufacturerDAO.findAll();
        resp.getWriter().println("<h3>List of Manufacturers</h3>");
        resp.getWriter().println("<br/>");
        resp.getWriter().println("<a href=\"/module05/addManufacturer\">NEW</a>");
        resp.getWriter().println("<br/>");
        for(Manufacturer manufacturer: list ){
            int manufactId = manufacturer.getId();
            String manufactName = manufacturer.getName()+": ";

            for(Product product: manufacturer.getProducts()){
                manufactName+= product.getNameProduct()+ ", ";
            }

            String link = "<a href=\"/module05/editManufacturer?manufact_id="+manufactId+" \">"+manufactName +"</a>";

            resp.getWriter().println(link);
            resp.getWriter().println("______________");
            resp.getWriter().println("<a href=\"/module05/deleteManufacturer?manufact_id="+
                    manufactId+"\">Delete</a>");

            resp.getWriter().println("<br/>");
        }
    }
}
