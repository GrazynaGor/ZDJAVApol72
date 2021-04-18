package com.sda.hibernate;

import com.sda.hibernate.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main3PersistExample {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Dog dog = new Dog("Pimpek", 4, "Jamnik");

        System.out.println("----> Id: "+ dog.getId());
        session.persist(dog);
        System.out.println("----> Id: " + dog.getId());

        dog.setRace("Kundel");

        session.evict(dog);

        dog.setAge(7);

        transaction.commit();
        session.close();

    }
}
