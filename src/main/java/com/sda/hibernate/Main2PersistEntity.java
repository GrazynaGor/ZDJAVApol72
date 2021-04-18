package com.sda.hibernate;

import com.sda.hibernate.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main2PersistEntity {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(new Dog("Burek", 5, "mieszaniec"));
        session.persist(new Dog("Ares", 2, "samoyed"));
        session.persist(new Dog("Thor", 4, "dog niemiecki"));
        session.persist(new Dog("Loki", 1, "buldog francuski"));
        session.persist(new Dog("Reksio", 8, "mieszaniec"));

        transaction.commit();
        session.close();
    }
}
