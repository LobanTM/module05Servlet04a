package com.loban.servlet04.controller;


import com.loban.servlet04.dao.ManufacturerDAO;
import com.loban.servlet04.model.Manufacturer;
import com.loban.servlet04.model.Product;

import java.util.List;

public class ManufacturerController {

    public static void createManufacturer (String name){
        Manufacturer manufacturer = new Manufacturer(name);
        ManufacturerDAO.create(manufacturer);
    }

    public static void updateManufacturer (Manufacturer manufacturer){
        ManufacturerDAO.update(manufacturer);
    }
    public static void deleteManufacturer (Manufacturer manufacturer){
        ManufacturerDAO.delete(manufacturer.getId());
    }

    public static Manufacturer readWithProductsById(int id){
        Manufacturer manufacturer = ManufacturerDAO.readById(id);
        return  manufacturer;
    }

    public static void findAllManufacturers(){
        List<Manufacturer> list = ManufacturerDAO.findAll();
        if (list!=null)
            for (Manufacturer m: list){
                System.out.println(m);
            }
    }

    public static void allManufacturersWithProducts(){
        List<Manufacturer> list = ManufacturerDAO.findAll();
        if (list!=null)
            for (Manufacturer m: list){
                System.out.print(m.getName()+": ");
                for (Product p: m.getProducts()){
                    System.out.print(p.getNameProduct()+", ");
                }
                System.out.println();
            }
    }
}
