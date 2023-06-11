package com.jsp.person.pancard;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestController {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mac");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("tanny");
		person.setEmail("tanny@gmail.com");
		
		Pancard pancard=new Pancard();
		pancard.setPancard_no("12346789");
		pancard.setCity("mankhurd");
		
		pancard.setPerson(person);
		person.setPancard(pancard);
		
		entityTransaction.begin();
		entityManager.persist(pancard);
		entityManager.persist(person);
		entityTransaction.commit();
	}
}
