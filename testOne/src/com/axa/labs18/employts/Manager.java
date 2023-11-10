package com.axa.labs18.employts;

import java.util.ArrayList;

public class Manager extends Employee {
	private ArrayList<Employee> employees;

	public Manager(String name, String jobTitle, ArrayList<Employee> employees) {
		super(name, jobTitle);
		this.employees = employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public String getInfo() {
		String info = super.getInfo();
		for (Employee emp : employees) {
			info += emp.getInfo();
		}
		return info;
	}

}
