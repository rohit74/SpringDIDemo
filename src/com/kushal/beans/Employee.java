package com.kushal.beans;

public class Employee {
	
	private Address address;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("no args employee constructor");
	}
	
	public Employee(Address address, String name) {	//injected the dependency to the bean
		// TODO Auto-generated constructor stub
		System.out.println("inside employee contructor");
		this.name = name;
		this.address = address;
	}*/
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("injecting address");
		this.address = address;
	}

	public void displayAddress() {
		System.out.println(this.name);
		address.display();
	}

}
