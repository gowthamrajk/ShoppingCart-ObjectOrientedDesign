package com.gowthamrajk.shoppingcart;

public class BillingAddress {
	
	private int billingId;
	private String doorNumber;
	private String street;
	private String city;
	private String district;
	private String state;
	
	public BillingAddress(int billingId, String doorNumber, String street, String city, String district, String state) {
		this.billingId = billingId;
		this.doorNumber = doorNumber;
		this.street = street;
		this.city = city;
		this.district = district;
		this.state = state;
	}

	public int getBillingId() {
		return billingId;
	}

	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		
		return "\nCustomer's BillingAddress : " + getDoorNumber() + ", " + getStreet() + ", " + getCity() + ", " +
		        getDistrict() + ", " + getState() + "\n";
	}	
}
