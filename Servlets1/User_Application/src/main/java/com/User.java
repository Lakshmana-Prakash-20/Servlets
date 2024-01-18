package com;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {

	
	
	private String name;
	private String email;
	private String password;
	private String gender;
	
	
	@EmbeddedId
	 private User_Primary a;
	
	public User_Primary getA() {
		return a;
	}
	public void setA(User_Primary a) {
		this.a = a;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", phone=" +"]";
	}
	
	
}
