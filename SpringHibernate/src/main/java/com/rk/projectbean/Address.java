package com.rk.projectbean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="addressTbl")
public class Address implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	String empId;
	
	String area;
	String city;
	String state;

	@Id
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Address(String empId, String area, String city, String state) {
		super();
		this.empId = empId;
		this.area = area;
		this.city = city;
		this.state = state;
	}


	
	Address(){
		System.out.println("Address Constructor invoked!!!");
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
	
	public void init() {
		System.out.println("Address Init methos invoked");
	}
	
	
	
	
}
