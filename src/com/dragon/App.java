package com.dragon;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Contact;

public class App {

	private static final String PERSISTENCE_UNIT_NAME = "contacts";
	private static EntityManagerFactory factory;


	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		Contact c = new Contact();
		c.setAddress1("ABC");
		em.persist(c);
		em.getTransaction().commit();
		
		// read the existing entries and write to console
		Query q = em.createQuery("select c FROM contact c");
		List<Contact> contactList = q.getResultList();
	

		for (Contact contact : contactList) {
			System.out.println(contact);
		}
		System.out.println("Size: " + contactList.size());

	}

}
