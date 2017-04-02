package com.mrinal.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author mrinal utkarsh
 *
 */
public class HibernateTest {



	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		/* USE BELOW OR ADD <mapping class="com.mrinal.hibernate.Customer"/> */
		/*configuration.addClass(com.mrinal.hibernate.Customer.class)
		// Read mappings as a application resourceName
		 // addResource is for add hbml.xml files in case of declarative approach
		configuration.addResource("myFile.hbm.xml");  // not hibernateAnnotations.cfg.xml*/		
		
		Customer cust = new Customer("Mrinal","mrinalutkarsh@gmail.com", 1234, "Bangalore", 250000.0);
		session.save(cust);
		session.getTransaction().commit();
		session.close();
		System.out.println("Record inserted");

	}

}
