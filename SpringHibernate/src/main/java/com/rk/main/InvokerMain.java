package com.rk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rk.dao.AddressDAOImpl;

public class InvokerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InvokerMain invoker = new InvokerMain();
		
		invoker.testHibernate();
		
	}
	
	public void testHibernate() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AddressDAOImpl add1 = (AddressDAOImpl) context.getBean("addressDao");
		
		add1.create();
		add1.read();
	}

}
