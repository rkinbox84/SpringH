package com.rk.bean;

public class Address {
	String empId;
	String area;
	String city;
	String state;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [empId=" + empId + ", area=" + area + ", city=" + city + ", state=" + state + "]";
	}

	public Address(String empId, String area, String city, String state) {
		super();
		this.empId = empId;
		this.area = area;
		this.city = city;
		this.state = state;
	}

	public Address() {
		System.out.println("Address default constructor");
	}


	
	

}
