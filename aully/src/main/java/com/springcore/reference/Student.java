package com.springcore.reference;

public class Student {
	private String studentName;
	private Address adsress;
	private String studentid;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getAdsress() {
		return adsress;
	}
	public void setAdsress(Address adsress) {
		this.adsress = adsress;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public Student(String studentName, Address adsress, String studentid) {
		super();
		this.studentName = studentName;
		this.adsress = adsress;
		this.studentid = studentid;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", adsress=" + adsress + ", studentid=" + studentid + "]";
	}
	

}
