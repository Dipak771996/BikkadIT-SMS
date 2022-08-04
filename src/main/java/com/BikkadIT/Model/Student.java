package com.BikkadIT.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_DTLS")
public class Student {

	@Id
	@Column(name = "STUDENT_ID")
	private int id;
	@Column(name = "STUDENT_NAME")
	private String name;
	@Column(name = "STUDENT_EMAIL")
	private String email;
	@Column(name = "STUDENT_AGE")
	private int age;

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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
