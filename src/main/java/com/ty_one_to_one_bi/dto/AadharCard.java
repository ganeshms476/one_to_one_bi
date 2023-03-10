package com.ty_one_to_one_bi.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AadharCard {
	@Id
	private int id;
	private String name;
	private String address;

//	@OneToOne(mappedBy = "card")
	private Person person;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "AadharCard [id=" + id + ", name=" + name + ", address=" + address + ", person=" + person + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
