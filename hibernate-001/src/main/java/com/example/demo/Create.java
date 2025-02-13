package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Create {
    public static void main(String[] args) {
        try {
            SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction t = session.beginTransaction();

            Employee emp = new Employee();
            emp.setEmpName("John"); // Don't set empId manually if using auto-generated ID


            t.commit();
            session.close();
            sessionFactory.close();

            System.out.println("Employee saved successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
