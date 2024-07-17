package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.operation.Book;

public class PersonMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration ();
		cfg.configure();
		cfg.addAnnotatedClass(Person.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		//Person p1 =  new Person (1,"ABC");
		Person p2 =  new Person (2,"PQR");
		session.save(p2);
		tx.commit();
	}
}
