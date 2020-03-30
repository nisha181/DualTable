package com.cognizant.model;

public class Student {
    public Student(String id) {
		super();
		this.id = id;
	}
	public Student(String id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Student() {
		super();
	}
	public Student(String id, String name, String course, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.address = address;
	}
	private String id;
    private String name;
    private String  course;
    private Address address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", address=" + address + "]";
	}
}
