
package com.trainingbasket.employee.services;

import java.util.ArrayList;

import com.trainingbasket.employee.beans.Employee;
import com.trainingbasket.employee.utils.ReadUtil;

public class EmployeeServices {
	//public static void main(String[] args)
		ReadUtil readUtil = null;
		ArrayList employees=new ArrayList();

	public EmployeeServices() {
		readUtil = new ReadUtil();
		while (true) {
			this.generateMenu();
			this.processMenu();
		}
	}
	
	
	public void processMenu() {
	int userOption=readUtil.readInt("please enter choice from above menu", "error");
	switch (userOption) {
	case 1:
		this.addEmployee();
		break;
	case 2:
		this.showAllEmployee();
		break;
	default:
		System.out.println("invalid choice");
		break;
	}
		
		
	}

	public void showAllEmployee() {
		if(	employees.size()!=0) {
			for (Object object : employees) {
				System.out.println(object);
				
			}
		}
		
		
	}

	public void addEmployee() {
		Employee employee=new Employee();
		employee.setContactNumber(readUtil.readString("please enter contact no", "error"));
		employee.setDepartment(readUtil.readString("please enter department", "error"));
		employee.setDob(readUtil.readDate("please enter valid date", "error"));
		employee.setDoj(readUtil.readDate("please enter date of joining", "error"));
		employee.setName(readUtil.readString("please enter name", "error"));
		employees.add(employee);
	}

	public void generateMenu() {

		System.out.println("==Main Menu==");
		System.out.println("1 Add Employee");
		System.out.println("2 show All Employee");
		System.out.println("3 exit");

	}

}
