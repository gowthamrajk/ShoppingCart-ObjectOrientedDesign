package com.gowthamrajk.shoppingcart;

public class Seller {
	
	private int sellerId;
	private String sellerName;
	private long mobile;
	private String email;
	
	public Seller(int sellerId, String sellerName, long mobile, String email) {
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.mobile = mobile;
		this.email = email;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		
		return "\nSeller Details => ID :" + sellerId + ", Name : " + sellerName + ", mobile : " +
		        mobile + ", email : " + email + "\n";
	}
}