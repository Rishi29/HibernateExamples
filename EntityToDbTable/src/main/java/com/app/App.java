package com.app;

import java.util.Date;

import org.hibernate.Session;

import com.model.Student;
import com.util.HibernateUtil;

public class App {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Student st = new Student("Rishi", "Mandal", 24, new Date());
		System.out.println("hi " + st.toString());

		session.save(st);
		session.getTransaction().commit();
	}

}
