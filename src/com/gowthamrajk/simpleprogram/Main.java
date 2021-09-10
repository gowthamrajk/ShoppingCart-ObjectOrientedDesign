package com.gowthamrajk.simpleprogram;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)
	{
	    Scanner scanner = new Scanner(System.in);
	    List<Student> studentsList = new ArrayList<>();
	    
	    System.out.println("Welcome to Gowthamraj K's Student Management Console :) \n");
	    System.out.println("Enter Number of students in the class");
	    int count = scanner.nextInt();
	    int counter = 1;
	    for(int index = 1; index <= count; index++)
	    {
	    	scanner.nextLine();
	    	System.out.println("Enter Student " + index + " Name : ");
	    	String name = scanner.nextLine();
	    	System.out.println("Enter Roll Number : ");
	    	int rollNumber = scanner.nextInt();
	    	System.out.println("Enter Department : ");
	    	String department = scanner.next();
	    	System.out.println("Enter Year of Passing : ");
	    	String section = scanner.next();
	    	System.out.println("Enter CGPA : ");
	    	double cgpa = scanner.nextDouble();
	    	studentsList.add(new Student(name, rollNumber, department, section, cgpa));
	    	System.out.println();
	    }
	    
	    System.out.println("\nStudents Details are Listed Below : \n");
	    for(Student studentObj : studentsList)
	    {
	    	System.out.println("Student "+counter+" Details : ");
	    	System.out.println(studentObj);
	    	counter++;
	    }
	    scanner.close();
	}
}
