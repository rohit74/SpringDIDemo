package com.kushal.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kushal.beans.Employee;

public class Demo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("beans.xml");
		
		Employee e = (Employee) context.getBean("employee");
		e.displayAddress();
	}
}
