package com.ty_one_to_one_bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private String address;
	private long phone;
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone 
				+ "]";
	}

	@OneToOne(cascade = CascadeType.PERSIST)
//	@JoinColumn
	private AadharCard card;

	public int getId() {
		return id;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public AadharCard getCard() {
		return card;
	}

	public void setCard(AadharCard card) {
		this.card = card;
	}
}	
