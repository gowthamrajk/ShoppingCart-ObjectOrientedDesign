package com.gowthamrajk.shoppingcart;

public class Item {
	
	private int itemId;
	private String itemName;
	private int itemQuantity;
	private String itemDescription;
	private double itemPrice;
	private Seller seller;
	private Customer customer;
	
	public Item(int itemId, String itemName, int itemQuantity, String itemDescription, double itemPrice,
			Seller seller, Customer customer) {
		
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.seller = seller;
		this.customer = customer;
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public int getItemQuantity() {
		return itemQuantity;
	}
	
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getItemPrice() {
		return itemPrice;
	}
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		
		return "Item information => ID : " + itemId + ", Name : " + itemName + ", Quantity : " + itemQuantity
				+ ", Description : " + itemDescription + ", Price : " + itemPrice + "\n" + seller 
				+ customer;
	}
}
