package com.gowthamrajk.simpleprogram;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		  
	    try {
	      throw new ArithmeticException("This class throws an Arithmetic Exception");
	    }
	    catch (ArithmeticException e) {
	      System.out.println("Message is : " + e.getMessage());
	    }
	    finally {
	      System.out.println("Thankyou !!!");
	    }
	}
}