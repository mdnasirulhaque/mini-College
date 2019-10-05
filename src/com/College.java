package com;
import java.util.ArrayList;

public class College {
	private String cName;
	private String cCity;
	private ArrayList<Department> cDepts;
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcCity() {
		return cCity;
	}
	public void setcCity(String cCity) {
		this.cCity = cCity;
	}
	public ArrayList<Department> getcDepts() {
		return cDepts;
	}
	public void setcDepts(ArrayList<Department> cDepts) {
		this.cDepts = cDepts;
	}
	
	public College(String cName, String cCity) {
		super();
		this.cName = cName;
		this.cCity = cCity;
		cDepts = new ArrayList<Department>();
	}
	
	int addDepartment(String dName, int dCapacity, Faculty faculty)
	{
		Department d=new Department(dName, dCapacity, faculty);
		cDepts.add(d);
		return 1;
	}
	
	int addStudent(String dName, Student student)
	{
		for(Department d:cDepts)
			if(d.getdName()==dName)
				d.setdStudents(student,dName,(d.getdStudents().size()>0)?d.getdStudents().get((d.getdStudents().size())-1).getRollNo():0);
		return 1;
	}
	boolean upgradeFaculty(String dName, Faculty faculty)
	{
		for(Department d:cDepts)
			if(d.getdName()==dName)
			{
				if(d.getdFaculty().getQualification()==faculty.getQualification() && d.getdFaculty().getExperience()<faculty.getExperience())
				{
					d.setdFaculty(faculty);
					return true;
				}
			}
		return false;
	}
	int getStudentCountFromState(String state)
	{
		int count=0;
		for(Department d:cDepts)
			for(Student s:d.getdStudents())
				if(s.getState()==state)
					count++;
		return count;
	}
}
