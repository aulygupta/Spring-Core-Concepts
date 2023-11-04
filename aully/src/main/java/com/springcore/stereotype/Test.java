package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student s=con.getBean("stu",Student.class);
		System.out.println(s.getState());
		System.out.println(s.getState().getClass().getName());
		System.out.println(s);

	}

}
