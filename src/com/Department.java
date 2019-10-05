package com;
import java.util.ArrayList;

public class Department {
	private String dName;
	private int dCapacity;
	private Faculty dFaculty;
	private ArrayList<Student> dStudents;
	
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public int getdCapacity() {
		return dCapacity;
	}
	public void setdCapacity(int dCapacity) {
		this.dCapacity = dCapacity;
	}
	public Faculty getdFaculty() {
		return dFaculty;
	}
	public void setdFaculty(Faculty dFaculty) {
		this.dFaculty = dFaculty;
	}
	public ArrayList<Student> getdStudents() {
		return dStudents;
	}
	public void setdStudents(Student dStudents,String dName,int rollNo) {
		dStudents.setDepartment(dName);
		dStudents.setRollNo(rollNo+1);
		this.dStudents.add(dStudents);
	}
	
	public Department(String dName, int dCapacity, Faculty dFaculty) {
		super();
		this.dName = dName;
		this.dCapacity = dCapacity;
		this.dFaculty = dFaculty;
		dStudents=new ArrayList<Student>();
	}
}
