package com.loban.servlet04.controller;



import com.loban.servlet04.dao.ManufacturerDAO;
import com.loban.servlet04.dao.ProductDAO;
import com.loban.servlet04.model.Manufacturer;
import com.loban.servlet04.model.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductController {

    public static void createProduct(String name, BigDecimal price, int idManufact){
        Product product = new Product();
        product.setNameProduct(name);
        product.setPrice(price);
        Manufacturer manufacturer = ManufacturerDAO.readById(idManufact);
        product.setManufacturer(manufacturer);
        ProductDAO.create(product);
    }

    public static void updateProduct(String name, BigDecimal price, int id){
        Product product = ProductDAO.readById(id);
        if (product!=null) {
            product.setNameProduct(name);
            product.setPrice(price);
            Manufacturer manufacturer = ManufacturerDAO.readById(id);
            product.setManufacturer(manufacturer);
            ProductDAO.update(product);
        }else{
            createProduct(name, price, id);
        }
    }

    public static void deleteProduct(int id){
        Product product = ProductDAO.readById(id);
        if (product!=null) {
            ProductDAO.delete(product.getId());
        }
    }

    public static void readById(int id){
        Product product = ProductDAO.readById(id);
        if (product!=null){
            System.out.println(product);
        }else{
            System.out.println("empty");
        }
    }

    public static void findAllProducts(){
        List<Product> list = ProductDAO.findAll();
        if(list!=null)
        for (Product p: list){
            System.out.println(p);
        }
    }
}
