package com.rk.bean;

import java.util.Date;
import java.util.List;

public class OrderDetails {
	
	String orderID;
	Date orderDate;
	List<ProductBean> productList;
	UserDetails userDetails;
	String orderStatus;
	String paymentDetails;
	
	
	
	public OrderDetails() {
		System.out.println("Order Details Constructor");
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public List<ProductBean> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductBean> productList) {
		this.productList = productList;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	
	
	@Override
	public String toString() {
		return "OrderDetails [orderID=" + orderID + ", orderDate=" + orderDate + ", productList=" + productList
				+ ", userDetails=" + userDetails + ", orderStatus=" + orderStatus + ", paymentDetails=" + paymentDetails
				+ "]";
	}


	public OrderDetails(String orderID, Date orderDate, List<ProductBean> productList, UserDetails userDetails,
			String orderStatus, String paymentDetails) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.productList = productList;
		this.userDetails = userDetails;
		this.orderStatus = orderStatus;
		this.paymentDetails = paymentDetails;
	}


public void init() {
	System.out.println("Init Method");
}
	

}
