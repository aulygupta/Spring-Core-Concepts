package com.springcore.standalone.collections;

import java.util.*;

public class Person {
	
	private List<String> friends;
	private Map<String,String> courses;
	private Properties proper;
	



	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getProper() {
		return proper;
	}

	public void setProper(Properties proper) {
		this.proper = proper;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courses=" + courses + ", proper=" + proper + "]";
	}
	

}
