package com.gowthamrajk.simpleprogram;

import java.util.Scanner;

class Operation
{
	public void doAddition(int num1, int num2)
	{
		System.out.println("Addition Result : " + (num1 + num2));
	}
	
	public void doAddition(int num1, int num2, int num3)
	{
		System.out.println("Addition Result : " + (num1 + num2 + num3));
	}
	
	public void doMultiplication(int num1, int num2)
	{
		System.out.println("Multiplication Result : " + (num1 * num2));
	}
	
	public void doMultiplication(int num1, int num2, int num3)
	{
		System.out.println("Multiplication Result : " + (num1 * num2 * num3));
	}
	
	public void findMaximum(int num1, int num2)
	{
		System.out.println("Maximum is  : " + Math.max(num1, num2));
	}
	
	public void findMaximum(int num1, int num2, int num3)
	{
		System.out.println("Maximum is  : " + Math.max(num1, Math.max(num2, num3)));
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		Operation operation = new Operation();
		
		operation.doAddition(num1, num2);
		operation.doAddition(num1, num2, num3);
		operation.doMultiplication(num1, num2);
		operation.doMultiplication(num1, num2, num3);
		operation.findMaximum(num1, num2);
		operation.findMaximum(num1, num2, num3);
		
		scanner.close();
	}

}
