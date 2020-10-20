package com.luv2code.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aop.demo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//read config class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
			
		//get bean
		
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
	
		//call business method
		theAccountDAO.addAccount();
		System.out.println("\none more time");
		theAccountDAO.addAccount();
		//close contect
		context.close();
	}

}
