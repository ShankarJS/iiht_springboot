package com.core.SpringCoreDemo.ReferenceInjectionTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/SpringCoreDemo/ReferenceInjectionTest/RefInjTest.xml");
		StudentDetails studentTemp = (StudentDetails)context.getBean("studentDetails");
		System.out.println("Student Details:");
		
		System.out.println(studentTemp.getStudentName());
		System.out.println(studentTemp.getStudentAge());
		System.out.println(studentTemp.getStudentCity());
		System.out.println(studentTemp.getStudentClass());
		
		System.out.println("Subject Details:");
		
		System.out.println(studentTemp.getStudentSubjects().getSubject1());
		System.out.println(studentTemp.getStudentSubjects().getSubject2());
		System.out.println(studentTemp.getStudentSubjects().getSubject3());
		System.out.println(studentTemp.getStudentSubjects().getSubject4());
		
		
	}

}
