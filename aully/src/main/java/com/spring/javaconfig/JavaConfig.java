package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.spring.javaconfig")
public class JavaConfig {
	@Bean
	public Samosa getSamosa() {
		Samosa sam=new Samosa();
		return sam;
	}
	@Bean(name = {"auly","studen"})
	public Student getStudent() {
		Student student=new Student(getSamosa());
		return student;
	}

}
