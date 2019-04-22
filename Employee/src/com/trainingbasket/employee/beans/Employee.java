package com.trainingbasket.employee.beans;

import java.util.Date;

public class Employee {
	int id;
	String name;
	Date dob;
	Date doj;
	String ContactNumber;
	String Department;
	Boolean isSingle;
	static int tempid=0;
	public Employee() {
		this.id=++tempid;
	}
	
	@Override
	public String toString() {
	return "The ID : "+this.id
			+ "\nThe Name :"+this.name
			+ "\nThe Dob :"+this.dob
		
			+ "\nThe Doj :"+this.doj
			+ "\nThe ContactNumber :"+this.ContactNumber
			+ "\nThe Department :"+this.Department
			+ "\nThe isSingle :"+this.isSingle;
	}
	public int getId() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public Boolean getIsSingle() {
		return isSingle;
	}
	public void setIsSingle(Boolean isSingle) {
		this.isSingle = isSingle;
	}
	

}
