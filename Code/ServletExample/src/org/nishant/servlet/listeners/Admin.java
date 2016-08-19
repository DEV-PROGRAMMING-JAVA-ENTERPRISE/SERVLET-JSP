package org.nishant.servlet.listeners;

import java.io.Serializable;

public class Admin implements Serializable {

	private static final long serialVersionUID = 8676198534089096414L;

	private String name;
	private int age;
	private String mail;
	private String gender;

	public Admin(String name, int age, String mail, String gender) {
		this.name = name;
		this.age = age;
		this.mail = mail;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getMail() {
		return mail;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", age=" + age + ", mail=" + mail
				+ ", gender=" + gender + "]";
	}
}