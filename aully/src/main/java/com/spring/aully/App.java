package com.spring.aully;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
        Student student1=(Student)con.getBean("stud1");
       
        
        System.out.println(student1);
        Student student2=(Student)con.getBean("stud2");
        System.out.println(student2);
        
    }
}
