package com.gowthamrajk.practice;

import java.util.Scanner;

public class Driver {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter initial Speed of the Car in KMPH : ");
		int initialSpeed = scanner.nextInt();
		Car car = new Car(initialSpeed);
		System.out.println("Want to Increase Acceleration ? (Y/N)");
		char option = scanner.next().charAt(0);
		if(Character.toLowerCase(option) == 'y') {
			car.increaseAcceleration();
			System.out.println("Car is Accelerated and running at a high speed. \n" + car + " KMPH");
		}
		else
			System.out.println("Actual "+ car + " KMPH");
		
		scanner.close();
	}
}