package com.loban.servlet04.dao;

import com.loban.servlet04.connection.HibernateUtil;
import com.loban.servlet04.model.Manufacturer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ManufacturerDAO {

    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static Session session = null;

    public ManufacturerDAO() {
    }

    public static void create(Manufacturer manufacturer){
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(manufacturer);
        transaction.commit();
        session.close();
    }

    public static void update(Manufacturer manufacturer){
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(manufacturer);
        transaction.commit();
        session.close();
    }

    public static void delete(int id){
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Manufacturer manufacturer = (Manufacturer) session.get(Manufacturer.class, id);
        session.delete(manufacturer);
        transaction.commit();
        session.close();
    }

    public static Manufacturer readById(int id){
        session = sessionFactory.openSession();
        Manufacturer manufacturer = (Manufacturer) session.get(Manufacturer.class, id);
        session.close();
        return manufacturer;
    }

    public static List<Manufacturer> findAll(){
        List<Manufacturer> list = null;
        session = sessionFactory.openSession();
        list = session.createQuery("from Manufacturer").list();
        session.close();

        return list;
    }


}
