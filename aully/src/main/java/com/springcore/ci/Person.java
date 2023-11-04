package com.springcore.ci;

public class Person {
	private String name;
	private int id;
	private Certi certificate;
	public Person(String name, int id, Certi certificate) {
		super();
		this.name = name;
		this.id = id;
		this.certificate=certificate;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "certificate="+ certificate+" ]";
	}
	

}
