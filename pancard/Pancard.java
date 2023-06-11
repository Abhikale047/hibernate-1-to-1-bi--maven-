package com.jsp.person.pancard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String pancard_no;
	private String city;
	@OneToOne
	private Person person;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPancard_no() {
		return pancard_no;
	}
	public void setPancard_no(String pancard_no) {
		this.pancard_no = pancard_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

}
