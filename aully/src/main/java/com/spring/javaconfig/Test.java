package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student stu=con.getBean("auly",Student.class);
		System.out.println(stu);
		stu.study();
		con.close();
		

	}

}
