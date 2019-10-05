package com;

public class Person {
	private String name;
	private char gender;
	private String state;
	
	public Person(String name, char gender, String state) {
		super();
		this.name = name;
		this.gender = gender;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
