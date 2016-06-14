package com.kushal.beans;

public class Employee1 {
	
	private String name;
	private Address address;
	
	public Employee1() {
		// TODO Auto-generated constructor stub
		this.setName("Kushal");
		address = new Address();
	}
	
	public void displayAddress() {
		address.display();
	}
	
	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.displayAddress();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
