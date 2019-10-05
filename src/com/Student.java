package com;

public class Student extends Person {
	private int rollNo;
	private String department;
   	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo =rollNo;
	}
	
	public Student(String name, char gender, String state) {
		super(name,gender,state);
	}
}

