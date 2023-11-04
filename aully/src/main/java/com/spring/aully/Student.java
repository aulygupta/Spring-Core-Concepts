package com.spring.aully;

public class Student {
	private int studentId;
	private String studentName;
	private String stuAddress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Setting Id");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting Name");
		this.studentName = studentName;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		System.out.println("Setting address");
		this.stuAddress = stuAddress;
	}
	public Student(int studentId, String studentName, String stuAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.stuAddress = stuAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", stuAddress=" + stuAddress + "]";
	}
	

}
