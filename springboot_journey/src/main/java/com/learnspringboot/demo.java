package com.learnspringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Spring Boot Container 
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		A a = context.getBean(A.class);
		
		a.m1();
	}

}
