package com.gowthamrajk.shoppingcart;

public class Customer {
	
	private int customerId;
	private String customerName;
	private long mobile;
	private String email;
	private BillingAddress billingAddress;
	
	public Customer(int customerId, String customerName, long mobile, String email, BillingAddress billingAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobile = mobile;
		this.email = email;
		this.billingAddress = billingAddress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	@Override
	public String toString() {
		
		return "\nCustomer Details => ID : " + customerId + ", Name : " + customerName + ", mobile : " + mobile
				+ ", email : " + email + "\n" + billingAddress;
	}
	
	
}