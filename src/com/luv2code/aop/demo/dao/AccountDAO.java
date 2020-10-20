package com.luv2code.aop.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	public void addAccount() {
		System.out.println(getClass() + "Doing my work adding an account");
	}
}
