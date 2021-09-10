package com.gowthamrajk.practice;

import java.util.Scanner;

public class Light {
	
	public static void main(String args[]) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			
			Bulb bulb = new Bulb();
			while(true) {	
			    System.out.println("Hello, I am GowthamRaj. Choose Options to Switch ON/OFF the Bulb !!! "
			    		           + "\n 1) ON \n 2) OFF \n 3) EXIT \n");
			    
			    int choice = scanner.nextInt();
			    switch(choice)  {
			    
			        case 1: {
			        	
				        if(!bulb.getStatus()) {
				            bulb.turnOn();
				            System.out.println("Bulb Turned ON !!!\n");
				        }
				        else {
					        System.out.println("Bulb is already glowing !!!\n");
					        
				        }
				        break;
			        }
			        case 2: {
			        	
			        	if(bulb.getStatus()) {
				            bulb.turnOff();
				            System.out.println("Bulb Turned OFF !!!\n");
				        }
				        else {
					        System.out.println("Bulb is already in OFF state !!!\n");
				        }
				        break;
			        }
			        default: {
			        	bulb.turnOff();
			        	System.out.println("Thankyou :)");
			        	return;
			        }
			    }
			}
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
	}
}