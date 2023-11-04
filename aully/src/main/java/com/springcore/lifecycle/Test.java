package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");
//		Samosa s=(Samosa)con.getBean("sam");
//		System.out.println(s);
//		
//		Pepsi p1=(Pepsi)con.getBean("pep");
//		System.out.println(p1);
		con.registerShutdownHook();
		
		Example e1=(Example)con.getBean("ex");
		System.out.println(e1);

	}

}
