package com.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//How many ways to inject Dependency Injection in spring boot

//1.By Setter Injection	 2.By Constructor Injection 	3.FeildLevel Injection (Autowired)

@Component
public class A { // Class A Depending on Class B
	B b;
	
	/*
	 * A(B b){ // By Using Constructor this.b=b ; }
	 */
	
	
	
	public void m1() {
		System.out.println("m1 from class A");
		b.m2();
	}

	/*
	 * public void setB(B b) { // By Using Setter Method this.b = b; }
	 */
	
	@Autowired
	public void setB(B b) { // By Using Autowired
		this.b = b;
	}
}
