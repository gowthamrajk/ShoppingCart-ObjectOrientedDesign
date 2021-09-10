package com.gowthamrajk.shoppingcart;

import java.util.List;

public class ShoppingCart {
	
	private int cartId;
	private Item items;
	private double payableAmount;
	private ShippingAddress shippingAddress;
	
	public ShoppingCart() { }
	
	public ShoppingCart(int cartId, Item items, double payableAmount, ShippingAddress shippingAddress) {
		this.cartId = cartId;
		this.items = items;
		this.payableAmount = payableAmount;
		this.shippingAddress = shippingAddress;
	}
	
	public int getCartId() {
		return cartId;
	}
	
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	
	public Item getItems() {
		return items;
	}
	public void setItems(Item items) {
		this.items = items;
	}
	
	public double getPayableAmount() {
		return payableAmount;
	}
	
	public void setPayableAmount(double payableAmount) {
		this.payableAmount = payableAmount;
	}
	
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public void addToCart(Item item)
	{
		this.items = item;
	}
	
    public double getCartAmount() {
		
		return this.payableAmount;
	}
    
    public void printCartItems(List<Item> cartItems) {
    	int counter = 1; 
    	for(Item itemObj : cartItems) {
    		System.out.println("\nProduct " + counter + " Information : \n");
			System.out.println(itemObj);
			counter++;
		}
    }

	@Override
	public String toString() {
		
		return "\nHere is your ShoppingCart Details : \n\nCart ID : " + cartId + ", payableAmount : " + getCartAmount()
				+ shippingAddress + "\n";
	}
}
