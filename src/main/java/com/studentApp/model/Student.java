package com.studentApp.model;

public class Student {
	
	private int id;
	private String name;
	private String department;
	private String mobileNum;
	private String college;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Student(int id, String name, String department, String mobileNum, String college) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.mobileNum = mobileNum;
		this.college = college;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", mobileNum=" + mobileNum
				+ ", college=" + college + "]";
	}
	
	
	
}
