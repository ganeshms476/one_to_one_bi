package com.ty_one_to_one_bi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty_one_to_one_bi.dao.AadharDAO;
import com.ty_one_to_one_bi.dao.PersonDAO;
import com.ty_one_to_one_bi.dto.AadharCard;
import com.ty_one_to_one_bi.dto.Person;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.setId(6);
		person.setName("GANI");
		person.setAddress("KKP");
		person.setPhone(2134567);

		AadharCard aadharCard = new AadharCard();
		aadharCard.setId(6);
		aadharCard.setName("SOurabh");
		aadharCard.setAddress("KKP");

		person.setCard(aadharCard);
		aadharCard.setPerson(person);

		PersonDAO dao = new PersonDAO();
		AadharDAO dao2 = new AadharDAO();

		dao.insertPerson(person);
		dao2.insertAadhar(aadharCard);
		
		

//		dao.getPersonById(person);
//		dao2.getAadharById(aadharCard);

	}
}
