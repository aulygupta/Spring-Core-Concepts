package com.springcore.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/bean/scope/beansconfig.xml");
		Student stu=con.getBean("stud",Student.class);
		System.out.println(stu.hashCode());
		Student stu1=con.getBean("stud",Student.class);
		System.out.println(stu1.hashCode());
		System.out.println("____________________________________");
		Teacher t=con.getBean("teacher",Teacher.class);
		System.out.println(t.hashCode());
		Teacher t1=con.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());

	}

}
