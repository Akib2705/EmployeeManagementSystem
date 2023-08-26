package com.projectWithJdbc;
public class BeanClass {

	private int id;
	private String name;
	private int age;
	private int salary;
	private long phoneNo;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "BeanClass [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", phoneNo=" + phoneNo
				+ "]";
	}
	
	
	


}
