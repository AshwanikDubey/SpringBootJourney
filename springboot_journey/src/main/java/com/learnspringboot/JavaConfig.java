package com.learnspringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * //@Configuration public class JavaConfig {
 * 
 * @Bean public B b() {
 * 
 * return new B(); }
 * 
 * @Bean public A a(B b) {
 * 
 * 
 * return new A(b);// By Using Constructor
 * 
 * 
 * A a = new A(); // By Using Setter Injection a.setB(b); return a;
 * 
 * }
 * 
 * }
 */

@Configuration
@ComponentScan(basePackages ="com.learnspringboot")
public class JavaConfig {
	


}
