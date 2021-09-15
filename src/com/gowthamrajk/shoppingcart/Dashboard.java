package com.gowthamrajk.shoppingcart;

import java.util.Scanner;

public class Dashboard {
	
	public static void main(String[] args) {
		
	  try (Scanner scanner = new Scanner(System.in)) {
		  
		ShoppingCart cart = new ShoppingCart();
		cart.setCartId(101);
		System.out.println("Welcome to Gowthamraj K's Shopping Cart :)");
		
		while(true) {
			
		    System.out.println("choose the option : \n1) Add Item \n2) Show Cart \n3) Exit");
		    int option = scanner.nextInt();
		    scanner.nextLine();
		    switch(option) {
		    
		        case 1:
		        {
		    	    System.out.println("\nWelcome to add Item Menu. Please enter following details...");	
		    	
		    	    System.out.println("\nEnter the Billing Address as doornumber, street, city, district, state : ");
				    String[] billingAddress = scanner.nextLine().split(",");
				    BillingAddress billAddress = new BillingAddress(1001, billingAddress[0], billingAddress[1],
						                         billingAddress[2], billingAddress[3], billingAddress[4]);
				
		    	    System.out.println("\nEnter the Your Infomation as name, mobile, email.");
				    String[] customerInformation = scanner.nextLine().split(",");
				    Customer customer = new Customer(11, customerInformation[0], Long.parseLong(customerInformation[1]),
						                customerInformation[2], billAddress);
				
				    System.out.println("\nEnter the Seller Infomation as name, mobile, email.");
				    String[] sellerInformation = scanner.nextLine().split(",");
				    Seller seller = new Seller(12, sellerInformation[0], Long.parseLong(sellerInformation[1]),
						            sellerInformation[2]);
				
				    System.out.println("\nEnter the product's Infomation as name, quantity, description, price : ");
				    String[] newItem = scanner.nextLine().split(",");
				    Item item = new Item(1, newItem[0], Integer.parseInt(newItem[1]), newItem[2],
						        Double.parseDouble(newItem[3]), seller, customer);
				    
				    cart.addToCart(item);
				    System.out.println("\nYour Item is added to the cart successfully !!!\n");
			        break;
		        }
		        case 2:
		        {
		        	if(cart.getItems().isEmpty()) {
		        		System.out.println("\nYour Cart is Empty !!!\n");
		        	}
		        	else {
		        		System.out.println("\nWelcome to Shopping Cart Menu !!!");
			        	System.out.println("\nEnter your Shipping Address as doornumber, street, city, district, state : ");
			    		String[] shippingAddress = scanner.nextLine().split(",");
			    		cart.setShippingAddress(new ShippingAddress(101, shippingAddress[0], shippingAddress[1], 
			    				                shippingAddress[2], shippingAddress[3], shippingAddress[4]));
			    		
			    		double totalCartAmount = 0;
			    		for(Item itemsObj : cart.getItems()) {
			    			totalCartAmount += itemsObj.getItemPrice();
			    		}
			    		cart.setPayableAmount(totalCartAmount);
			    		
			    		System.out.println(cart);
			    		cart.printCartItems();
		        	}
			        break;
		        }
		        case 3:
		        {
		    	    System.out.println("\nThankyou for using the Cart, visit again !!!");
		    	    return;
		        }
		        default:
		        {
		        	System.out.println("Invalid Option, try again !!!");
		        }
		    }
		}
	  }
	  catch(Exception exception) {
		  System.out.println(exception);
	  }
	}
}
