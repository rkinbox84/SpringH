package com.rk.bean;

public class Address {
	
	String houseName;
	String landMark;
	String area;
	String city;
	String state;

	
	
	public Address() {
		System.out.println("Address Constructor Invoked");
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
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
		return "Address [houseName=" + houseName + ", landMark=" + landMark + ", area=" + area + ", city=" + city
				+ ", state=" + state + "]";
	}

	public Address(String houseName, String landMark, String area, String city, String state) {
		super();
		this.houseName = houseName;
		this.landMark = landMark;
		this.area = area;
		this.city = city;
		this.state = state;
	}


}
