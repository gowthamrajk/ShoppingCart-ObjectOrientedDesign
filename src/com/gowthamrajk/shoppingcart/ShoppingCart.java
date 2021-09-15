package com.gowthamrajk.shoppingcart;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
	
	private int cartId;
	private List<Item> items = new ArrayList<>();
	private double payableAmount;
	private ShippingAddress shippingAddress;
	
	public ShoppingCart() { }
	
	public ShoppingCart(int cartId, List<Item> items, double payableAmount, ShippingAddress shippingAddress) {
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
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
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
		this.items.add(item);
	}
	
    public double getCartAmount() {
		
		return this.payableAmount;
	}
    
    public void printCartItems() {
    	int counter = 1; 
    	for(Item itemObj : this.items) {
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
