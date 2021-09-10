package com.gowthamrajk.practice;

import java.util.Scanner;

public class Wateroperation {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Total Capacity of Water Bottle in ml : ");
		int totalCapacity = scanner.nextInt();
		Bottle bottle = new Bottle(totalCapacity, 0);
		
		System.out.println("Want to Fill the Bottle ? (Y/N)");
		char fillOption = scanner.next().charAt(0);
		if(Character.toLowerCase(fillOption) == 'y') {
			System.out.println("Enter filling quantity in ml : ");
			int fillingQuantity = scanner.nextInt();
			if(fillingQuantity > bottle.getTotalCapacity())
				System.out.println("Bottle capacity is " + bottle.getTotalCapacity() + " L and  it might overflow with " + (fillingQuantity - bottle.getTotalCapacity()) + "ml \n");
			else {
				bottle.setCurrentCapacity(bottle.getCurrentCapacity() + fillingQuantity);
				System.out.println("Bottle filled with " + fillingQuantity + "ml of water and the current capacity is " + bottle.getCurrentCapacity() + " ml\n");
			}
		}
		
		System.out.println("Want to have a drink ? (Y/N)");
		char sippingOption = scanner.next().charAt(0);
		if(Character.toLowerCase(sippingOption) == 'y') {
			if(bottle.getCurrentCapacity() == 0)
				System.out.println("Bottle is Already Empty, Please fill some water and have a drink !!!");
			else {
				System.out.println("Enter sipping quantity in ml : ");
				int sippingQuantity = scanner.nextInt();
			    bottle.sipBottle(sippingQuantity);
				System.out.println("You drank " + sippingQuantity + "ml of water and the current capacity is " + bottle.getCurrentCapacity() + " ml\n");
			}
		}
		
		System.out.println("Want to Empty the Bottle ? (Y/N)");
		char emptyOption = scanner.next().charAt(0);
		if(Character.toLowerCase(emptyOption) == 'y') {
			if(bottle.getCurrentCapacity() == 0)
				System.out.println("Bottle is Already Empty, Please fill some water !!!");
			else {
			    bottle.emptyBottle();
			    System.out.println("Now the bottle is Empty !!!");
			}
		}
		scanner.close();
	}
}