package com.gowthamrajk.practice;

public class Account {
	
	private String customerName;
	private int accountNumber;
	private int withdrawalAmount;
	private int depositedAmount;
	private int activeBalance;
	
	public Account(String customerName, int accountNumber, int withdrawalAmount, int depositedAmount, 
			int activeBalance) {
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.withdrawalAmount = withdrawalAmount;
		this.depositedAmount = depositedAmount;
		this.activeBalance = activeBalance;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getWithdrawalAmount() {
		return withdrawalAmount;
	}
	
	public void setWithdrawalAmount(int withdrawalAmount) {
		if(withdrawalAmount <= 0) {
    		System.out.println("Please enter proper amount value !!!");
    	}
		this.withdrawalAmount = withdrawalAmount;
	}
	
	public int getDepositedAmount() {
		return depositedAmount;
	}
	
	public void setDepositedAmount(int depositedAmount) {
		if(depositedAmount <= 0)
    	{
    		System.out.println("Please enter proper amount value !!!");
    	}
		this.depositedAmount = depositedAmount;
	}
	
	public int getActiveBalance() {
		return activeBalance;
	}
	
	public void setActiveBalance(int activeBalance) {
		this.activeBalance = activeBalance;
	}

	@Override
	public String toString() {
		return "CustomerName : " + customerName + "\n AccountNumber : " + accountNumber + "\n WithdrawalAmount : "+ withdrawalAmount + "\n DepositedAmount : " + depositedAmount + "\n ActiveBalance :" + activeBalance + "\n";
	}
}