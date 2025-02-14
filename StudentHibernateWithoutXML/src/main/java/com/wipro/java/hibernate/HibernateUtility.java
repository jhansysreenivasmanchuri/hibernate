package com.wipro.java.hibernate;

//package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	private static SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
