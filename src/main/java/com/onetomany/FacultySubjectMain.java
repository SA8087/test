package com.onetomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.operation.Book;

public class FacultySubjectMain {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration ();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		faculty f1 = new faculty("Santosh");
		FacultySubject s1 = new FacultySubject("Java");
		FacultySubject s2 = new FacultySubject("Python");
		FacultySubject s3 = new FacultySubject("Mern");
		FacultySubject s4 = new FacultySubject("Mean");
		
		
		
		 ArrayList<FacultySubject> slist = new ArrayList<FacultySubject>();
		 slist.add(s1);
		 slist.add(s2);
		 slist.add(s3);
		 slist.add(s4);
		 f1.setFsubject(slist);
		 
		 
		 session.save(f1);
		 session.save(s1);
		 session.save(s2);
		 session.save(s3);
		 session.save(s4);
		 
		 
		 tx.commit();
		 session.close();
		 System.out.println("process done........");
		 
		}

} 
