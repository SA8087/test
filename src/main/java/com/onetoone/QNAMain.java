package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class QNAMain {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration ();
		cfg.configure();
		cfg.addAnnotatedClass(Question.class);
		cfg.addAnnotatedClass(Answer.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Question q1 = new Question ("What is hibernate ");
		Answer a1 = new Answer  (234,"Hibernate is ORM Tool");
		
		
		tx.commit();
		session.close();
		System.out.println("Done....");
	}

}
