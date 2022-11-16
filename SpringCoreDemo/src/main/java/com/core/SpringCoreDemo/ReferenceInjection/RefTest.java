package com.core.SpringCoreDemo.ReferenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/ReferenceInjection/RefConfig.xml");
		Object1 temp=(Object1) context.getBean("Object1");
		System.out.println(temp.getX());
		
		System.out.println(temp.getOb().getNo());
		

	}

}