package com.collectionproject;

public class Employee 
{
	private String name;
	private double salary;

	Employee(String name,double salary)
	{
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Salary of "+name+" is "+salary+" LPA";
	}
	


}
