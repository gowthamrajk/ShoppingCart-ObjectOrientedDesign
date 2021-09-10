package com.gowthamrajk.simpleprogram;

class Employee
{
	private int grossSalary = 35000;
	
	public int getGrossSalary()
	{
		return grossSalary;
	}
}
class Developer extends Employee
{
	private int developerBonus = 10000;
	
	public int getDeveloperBonus()
	{
		return developerBonus;
	}
}
class Tester extends Employee
{
	private int testerBonus = 4000;
	
	public int getTesterBonus()
	{
		return testerBonus;
	}
}
public class EmployeeDetails 
{
	public static void main(String[] args)
	{
		Developer developer = new Developer();
		Tester tester = new Tester();
		System.out.println("Actual Salary for Developing Team : "+(developer.getDeveloperBonus() + developer.getGrossSalary()));
		System.out.println("Actual Salary for Testing Team : "+(tester.getTesterBonus() + tester.getGrossSalary()));
	}
}
