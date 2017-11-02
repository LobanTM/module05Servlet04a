package com.loban.servlet04.dao;

import com.loban.servlet04.connection.HibernateUtil;
import com.loban.servlet04.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDAO {

    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static Session session = null;

    public ProductDAO() {
    }

    public static void create(Product product){
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(product);
        transaction.commit();
        session.close();
    }

    public static void update(Product product){
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(product);
        transaction.commit();
        session.close();
    }

    public static void delete(int id){
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Product product = (Product) session.get(Product.class, id);
        session.delete(product);
        transaction.commit();
        session.close();
    }

    public static Product readById(int id){
        session = sessionFactory.openSession();
        Product product = (Product) session.get(Product.class, id);
        session.close();
        return product;
    }

    public static List<Product> findAll(){
        List<Product> list = null;
        session = sessionFactory.openSession();
        list = session.createQuery("from Product").list();
        session.close();

        return list;
    }
}
