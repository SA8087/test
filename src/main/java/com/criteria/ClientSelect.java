package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.operation.*;

public class ClientSelect {

	public static void main(String[] args) {
		
	Configuration cfg = new Configuration ();
	cfg.configure();
	cfg.addAnnotatedClass(Book.class);
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
    Criteria c = session.createCriteria(Book.class); 
	List<Book> list = c.list();
	
	for(Book b:list) {
		System.out.println(b);
	}
	}
}
		
