package com.loban.servlet04.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "manufacturers")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nameMan")
    private String name;

    //один производитель - много продуктов
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "manufacturer") //.LAZY
    private Set<Product> products;

    public Manufacturer() {
    }

    public Manufacturer(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
//        String pStr = "";
//        for(Product p: products) pStr += p.getNameProduct();

        return name
//               + '\'' + ", products=" + pStr +
//                '}'
                ;
    }
}
