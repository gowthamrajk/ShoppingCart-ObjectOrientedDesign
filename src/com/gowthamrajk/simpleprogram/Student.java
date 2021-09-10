package com.gowthamrajk.simpleprogram;

public class Student 
{
	private String name;
	private int rollNumber;
	private String department;
	private String yearOfPassing;
	private Double cgpa;
	
	public Student(String name, int rollNumber, String department, String yearOfPassing, Double cgpa) 
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.department = department;
		this.yearOfPassing = yearOfPassing;
		this.cgpa = cgpa;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getRollNumber() 
	{
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) 
	{
		this.rollNumber = rollNumber;
	}

	public String getDepartment() 
	{
		return department;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public String getYearOfPassing() 
	{
		return yearOfPassing;
	}

	public void setYearOfPassing(String yearOfPassing) 
	{
		this.yearOfPassing = yearOfPassing;
	}

	public Double getCgpa() 
	{
		return cgpa;
	}

	public void setCgpa(Double cgpa) 
	{
		this.cgpa = cgpa;
	}
	
	@Override
	public String toString()
	{
		return "Name : "+getName()+", Roll Number : "+getRollNumber()+", Department : "+getDepartment()+", Year of Passing : "+getYearOfPassing()+", CGPA : "+getCgpa()+"\n";
	}
}
