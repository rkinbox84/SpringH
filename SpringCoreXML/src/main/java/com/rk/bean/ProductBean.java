package com.rk.bean;

public class ProductBean {
	
	String productID;
	String productName;
	String sellerName;
	String price;
	String productDesc;
	
	
	public ProductBean() {
	  System.out.println("Product Constructor");
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	@Override
	public String toString() {
		return "ProductBean [productID=" + productID + ", productName=" + productName + ", sellerName=" + sellerName
				+ ", price=" + price + ", productDesc=" + productDesc + "]";
	}
	public ProductBean(String productID, String productName, String sellerName, String price, String productDesc) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.sellerName = sellerName;
		this.price = price;
		this.productDesc = productDesc;
	}

	
	

}
