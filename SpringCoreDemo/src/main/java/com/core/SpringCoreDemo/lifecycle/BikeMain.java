package com.core.SpringCoreDemo.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class BikeMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/lifecycle/config.xml");
		MotorBike motorBike = (MotorBike) context.getBean("motorbike1");
		System.out.println(motorBike);
		context.registerShutdownHook();
	}
}