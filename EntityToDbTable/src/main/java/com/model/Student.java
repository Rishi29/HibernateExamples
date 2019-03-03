package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="student")
public class Student {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String firstName;
	private String lastname;
	private int age;
	
	@Temporal(TemporalType.DATE) // Temporal.date  store as date. if left unspecified it will be stored as timestamp. 
	private Date GraduationDate;
	
	@Transient //it will not persisted in to table
	private String petName;
	
	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public Student() {
		
	}
	
	public Student( String firstName, String lastname, int age, Date graduationDate) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.age = age;
		GraduationDate = graduationDate;
	}
	 
	public int getId() {
		return Id;
	}
	private void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Date getGraduationDate() {
		return GraduationDate;
	}

	public void setGraduationDate(Date graduationDate) {
		GraduationDate = graduationDate;
	}

}
