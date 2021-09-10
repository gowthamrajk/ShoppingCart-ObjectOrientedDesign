package com.gowthamrajk.practice;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Customer {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Gowthamraj K's Account Management Console :)");
		int defaultAccountNumber = 101;
		List<Account> accountDetails = new ArrayList<>();
		try (Scanner scanner = new Scanner(System.in)) {
			
			while(true) {
				
				System.out.println("\nChoose options to perform your task \n 1) Create Account \n 2) Deposit \n 3) Withdraw \n 4) Transfer Funds \n 5) Check Balance \n");
				int option = scanner.nextInt();
				String choiceString = "Enter Account Number : ";
				switch(option) {
				
				    case 1: 
				    {				    	
				    	System.out.println("Enter your Name : ");
				    	String customerName = scanner.next();
				    	System.out.println("Your Account has been created Successfully !!!");
				    	Account account = new Account(customerName, defaultAccountNumber, 0, 0, 0);
				    	accountDetails.add(account);
				    	System.out.println("Customer Name : " + account.getCustomerName() + "\nAccount Number : " + account.getAccountNumber() + "\nActive Balance : " + account.getActiveBalance() + "\n");
				    	defaultAccountNumber++;
					    break;
				    }
				    case 2:
				    {
				    	System.out.println(choiceString);
				    	int accountNumber = scanner.nextInt();
				    	System.out.println("Enter Account to be Deposited :");
				    	int depositAmount = scanner.nextInt();				    	
				    	depositAmount(accountDetails, accountNumber, depositAmount);
				    	System.out.println("Ammount of Rs : " + depositAmount + " deposited in your Account Number " + accountNumber + "Successfully !!!");
				    	break;
				    }
				    case 3:
				    {
				    	System.out.println(choiceString);
				    	int accountNumber = scanner.nextInt();
				    	System.out.println("Enter Account to be Withdrawn :");
				    	int withdrawalAmount = scanner.nextInt();
				    	for(Account accountObj : accountDetails) {
				    		if(accountObj.getActiveBalance() <= withdrawalAmount) {
				    			System.out.println("Insufficient Balance !!!");
				    			break;
				    		}
				    	}
				    	withdrawAmount(accountDetails, accountNumber, withdrawalAmount);
				    	System.out.println("Ammount of Rs : " + withdrawalAmount + " withdrawn in your Account Number " + accountNumber + "Successfully !!!");
				    	break;
				    }
				    case 4:
				    {
				    	System.out.println("Enter Source Account Number : ");
				    	int sourceAccountNumber = scanner.nextInt();
				    	System.out.println("Enter Target Account Number : ");
				    	int targetAccountNumber = scanner.nextInt();
				    	System.out.println("Enter Account to be Transfered :");
				    	int transferAmount = scanner.nextInt();
				    	transferAmount(accountDetails, sourceAccountNumber, targetAccountNumber, transferAmount);
				    	break;
				    }
				    case 5:
				    {
				    	System.out.println(choiceString);
				    	int accountNumber = scanner.nextInt();
				    	getActiveBalance(accountDetails, accountNumber);
				    	break;
				    }
				    default:
				    {
				    	System.out.println("Thankyou for Using the Console !!!");
				    	return;
				    }
				}
			}
		}
		catch (Exception exception) {
			System.out.println(exception);
		}
	}
	
	public static void depositAmount(List<Account> accountDetails, int accountNumber, int depositAmount)
	{
		for(Account accountObj : accountDetails) {
			
			if(accountObj.getAccountNumber() == accountNumber) {
				accountObj.setDepositedAmount(depositAmount);
				accountObj.setActiveBalance(accountObj.getActiveBalance() + depositAmount);
				break;
			}
		}
	}
	
	public static void withdrawAmount(List<Account> accountDetails, int accountNumber, int withdrawalAmount)
	{
		for(Account accountObj : accountDetails) {
			
			if(accountObj.getAccountNumber() == accountNumber) {
				accountObj.setWithdrawalAmount(withdrawalAmount);
				accountObj.setActiveBalance(accountObj.getActiveBalance() - withdrawalAmount);
				break;
			}
		}
	}
	
	public static void getActiveBalance(List<Account> accountDetails, int accountNumber)
	{
		for(Account accountObj : accountDetails) {
			
			if(accountObj.getAccountNumber() == accountNumber) {
				System.out.println("Active Balance of your account with Ac.no : " + accountNumber + "is Rs: " + accountObj.getActiveBalance() + "\n");
				break;
			}
		}
	}
	
	public static void transferAmount(List<Account> accountDetails, int sourceAccountNumber, int targetAccountNumber, int transferAmount)
	{
		for(Account accountObj : accountDetails) {
			
			if(accountObj.getAccountNumber() == sourceAccountNumber) {
				accountObj.setActiveBalance(accountObj.getActiveBalance() - transferAmount);
				return;
			}
			else if(accountObj.getAccountNumber() == targetAccountNumber) {
				accountObj.setActiveBalance(accountObj.getActiveBalance() + transferAmount);
				return;
			}
		}
	}
}
