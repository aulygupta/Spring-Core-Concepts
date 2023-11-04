package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standalconfig.xml");
        Person p=con.getBean("person1",Person.class);
        System.out.println(p.getFriends().getClass().getName());
        System.out.println("_______________________________________");
        System.out.println(p.getCourses());
        System.out.println(p.getCourses().getClass().getName());
        System.out.println("_______________________________________");
        System.out.println(p.getProper());
        System.out.println(p.getProper().getClass().getName());
        
	}

}
