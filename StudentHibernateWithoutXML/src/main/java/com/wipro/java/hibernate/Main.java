package com.wipro.java.hibernate;

//package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		Student student = new Student(996, "Sree");

		session.save(student);
		tx.commit();
		session.close();

		System.out.println("Student data inserted successfully! that is: "+ student.getName() +" , "+ student.getRollNumber());
	}
}
