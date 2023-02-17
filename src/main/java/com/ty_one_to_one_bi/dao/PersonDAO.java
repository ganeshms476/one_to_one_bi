package com.ty_one_to_one_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty_one_to_one_bi.dto.AadharCard;
import com.ty_one_to_one_bi.dto.Person;

public class PersonDAO {
	public EntityManager gentityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();
	}

	public void insertPerson(Person person) {
		EntityManager entityManager = gentityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	
	public void updatePerson(Person person) {
		EntityManager entityManager = gentityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person2=entityManager.find(Person.class, person.getId());
		person2.setId(person.getId());
		person2.setName(person.getName());
		entityTransaction.begin();
		entityManager.merge(person2);
		entityTransaction.commit();
	}
	
	public void removePerson(Person person) {
		EntityManager entityManager = gentityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person2=entityManager.find(Person.class, person.getId());
		person2.setId(person.getId());
		entityTransaction.begin();
		entityManager.remove(person2);
		entityTransaction.commit();
	}
	
	public void getPersonById(Person person) {
		EntityManager entityManager = gentityManager();
		Person person2=entityManager.find(Person.class, person.getId());
		person2.setId(person.getId());
		AadharCard card = person.getCard();
		System.out.println(person2);
		System.out.println(card);
	}

}










