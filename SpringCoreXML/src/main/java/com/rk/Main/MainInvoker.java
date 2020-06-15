package com.rk.Main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rk.bean.OrderDetails;

public class MainInvoker {

	public static void main(String args[]) {
		
		//applicationContext();
		
		beanFactory();
		
	}
	
	public static void beanFactory() {
		
		//Resource resource = new ClassPathResource("applicationContext.xml");
		Resource resource = new ClassPathResource("applicationContextAuto.xml");
		
		BeanFactory  factory = new XmlBeanFactory(resource);
		
		OrderDetails order = (OrderDetails) factory.getBean("OrderDetails");
		System.out.println(order);

	}
	
	public static void applicationContext() {
		//lazy-init="true" - to stop auto creation of instance
		//scope="prototype" - individual objects
		//scope="singleton" - one object for all the calls
		//scope="session" - one object for complete session
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		OrderDetails order = (OrderDetails) context.getBean("OrderDetails");
		System.out.println(order);
		
	}
}
