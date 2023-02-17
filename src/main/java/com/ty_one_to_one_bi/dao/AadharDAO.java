package com.ty_one_to_one_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty_one_to_one_bi.dto.AadharCard;
import com.ty_one_to_one_bi.dto.Person;

public class AadharDAO {
	public EntityManager gentityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();
	}
	
	public void insertAadhar(AadharCard card) {
		EntityManager entityManager = gentityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(card);
		entityTransaction.commit();
		
	}
	
	public void updateAadhar(AadharCard card) {
		EntityManager entityManager = gentityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		AadharCard card1=entityManager.find(AadharCard.class, card.getId());
		card1.setId(card.getId());
		card1.setName(card.getName());
		entityTransaction.begin();
		entityManager.merge(card1);
		entityTransaction.commit();
	}
	
	public void removeAadhar(AadharCard card) {
		EntityManager entityManager = gentityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		AadharCard card1=entityManager.find(AadharCard.class, card.getId());
		card1.setId(card.getId());
		entityTransaction.begin();
		entityManager.remove(card1);
		entityTransaction.commit();
	}
	
	public void getAadharById(AadharCard card) {
		EntityManager entityManager = gentityManager();
		AadharCard card1=entityManager.find(AadharCard.class, card.getId());
		card1.setId(card.getId());
		System.out.println(card1);
	}
}










