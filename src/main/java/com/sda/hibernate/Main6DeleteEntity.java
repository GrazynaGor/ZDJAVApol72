package com.sda.hibernate;

import com.sda.hibernate.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.OptimisticLockException;

public class Main6DeleteEntity {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //delete id=1
       try {
           Dog dog = new Dog();
           dog.setId(1L);
           session.delete(dog);
           transaction.commit();


       }catch (OptimisticLockException e){
           System.out.println("Rekord nie istnieje w bazie danych o tym ID");
           transaction.rollback();
       }




        session.close();
    }
}
