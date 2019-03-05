package com.mvcAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
	//	Samsung s7 = new Samsung();
	// If dont want to create object like above then we can also inject dependency called as dependency injection.
		//s7.config();
		// TODO Auto-generated method stub
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		//ApplicationContext object give the object of Samsung.
		
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();
				
	}

}
