package com.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.operation.Book;

public class ClientCriteriaSelectColoum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration ();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		// select*from book
		Criteria c = session.createCriteria(Book.class);
//		c.add(Restrictions.gt("price", 200));
		System.out.println(c.list());
		Projection p1 = Projections.property("bname");
		Projection p2 = Projections.property("price");
		
		ProjectionList plist = Projections.projectionList();
		plist.add(p1);
		plist.add(p2);
		
		c.setProjection(p1);
		
		List<Object[]> list = c.list();
		
		
		
		//java.util.List<Book> list=c.list();
		
		for(Object[] s: list) {
		
		for(Object b : s) {
			System.out.println("hello");
			System.out.println(b.toString());
		}
		}
		
		
		}
			
	}


