package com;

public class Faculty extends Person {
	private String qualification;
	private double experience;
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	
	public Faculty(String name, char gender, String state, String qualification, double experience) {
		super(name,gender,state);
		this.qualification = qualification;
		this.experience = experience;
	}
}
