package com.sda.hibernate;

import com.sda.hibernate.entity.Employee;
import com.sda.hibernate.entity.Gender;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class Main7Annotation {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee("Jan", "strongPassword", "123456789", 20, new Date(), Gender.MALE, "description");
        session.persist(employee);


        transaction.commit();
        session.close();
    }
}
