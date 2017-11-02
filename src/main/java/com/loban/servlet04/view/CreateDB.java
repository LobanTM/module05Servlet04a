package com.loban.servlet04.view;

import com.loban.servlet04.controller.ManufacturerController;
import com.loban.servlet04.controller.ProductController;

import java.math.BigDecimal;

public class CreateDB {

    public void createFullDB() {
//        createDB();

        ProductController.findAllProducts();

        System.out.println("+++++++++++++++++++++++++++++");
        ManufacturerController.allManufacturersWithProducts();

        ProductController.createProduct("books", BigDecimal.valueOf(200), 5);
        ProductController.findAllProducts();
    }

    private  void createDB(){
        ManufacturerController.createManufacturer("Apple");
        ManufacturerController.createManufacturer("Ariston");
        ManufacturerController.createManufacturer("Wella");
        ManufacturerController.createManufacturer("ABB");
        ManufacturerController.createManufacturer("IBM");
        ManufacturerController.createManufacturer("lenovo");
        ManufacturerController.createManufacturer("Dell");
        ManufacturerController.createManufacturer("Dex");
        ProductController.createProduct("Plane", BigDecimal.valueOf(100), 1);
        ProductController.createProduct("bus", BigDecimal.valueOf(100), 1);
        ProductController.createProduct("Phone", BigDecimal.valueOf(100), 7);
        ProductController.createProduct("Big house", BigDecimal.valueOf(100), 6);
        ProductController.createProduct("Small house", BigDecimal.valueOf(100), 3);
        ProductController.createProduct("flat", BigDecimal.valueOf(100), 4);
        ProductController.createProduct("car", BigDecimal.valueOf(100), 1);
        ProductController.createProduct("phone", BigDecimal.valueOf(100), 2);
        ProductController.createProduct("book", BigDecimal.valueOf(100), 2);
        ProductController.createProduct("Plane", BigDecimal.valueOf(200), 7);
        ProductController.createProduct("bus", BigDecimal.valueOf(100), 6);
        ProductController.createProduct("Phone", BigDecimal.valueOf(100), 5);
        ProductController.createProduct("Big house", BigDecimal.valueOf(100), 4);
        ProductController.createProduct("Small house", BigDecimal.valueOf(100), 3);
        ProductController.createProduct("flat", BigDecimal.valueOf(100), 3);
        ProductController.createProduct("car", BigDecimal.valueOf(100), 4);
        ProductController.createProduct("phone", BigDecimal.valueOf(100), 5);
        ProductController.createProduct("book", BigDecimal.valueOf(100), 6);
        ProductController.createProduct("notebook", BigDecimal.valueOf(100), 7);
    }


}
