package com.HQL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetoone.Answer;
import com.onetoone.Question;

public class HQLMain {

	public static void main(String[] args) {
		
 		Configuration cfg = new Configuration ();
		cfg.configure();
		cfg.addAnnotatedClass(Person.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Person p1 = new Person(111,"Rohit",34000,"Pune");
		Person p2 = new Person(231,"pranav",45345,"Mumbai");
		Person p3 = new Person(432,"Soham",99000,"Nashik");
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tx.commit();
		session.close();
		System.out.println("Process Done......");

	}

}
