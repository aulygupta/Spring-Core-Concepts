package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String []args) {
	
	ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/reference/refconfig.xml");
	Student stud=(Student)con.getBean("stud1");
	System.out.println(stud);
	}
	


}
