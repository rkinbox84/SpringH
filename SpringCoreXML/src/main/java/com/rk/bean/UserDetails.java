package com.rk.bean;

import java.util.List;

public class UserDetails {
	
	String userName;
	List<Address> addressList;
	
	
	
	public UserDetails() {
		System.out.println("User Details Constructor");
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	@Override
	public String toString() {
		return "UserDetails [userName=" + userName + ", addressList=" + addressList + "]";
	}
	public UserDetails(String userName, List<Address> addressList) {
		super();
		this.userName = userName;
		this.addressList = addressList;
	}


}
