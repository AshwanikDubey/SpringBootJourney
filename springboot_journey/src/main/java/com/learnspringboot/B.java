package com.learnspringboot;

import org.springframework.stereotype.Component;

// @Component is used to auto config
@Component
public class B {
	public void m2() {
		System.out.println("m2 from class B");
	}
}
