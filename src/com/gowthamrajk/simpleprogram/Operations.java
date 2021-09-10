package com.gowthamrajk.simpleprogram;

import java.util.Scanner;

interface FirstOperation
{
    abstract void add(int num1, int num2);
}

interface SecondOperation
{
    abstract void multiply(int num1, int num2);
}

class multiplication implements FirstOperation, SecondOperation
{
    @Override
    public void add(int num1, int num2)
    {
        System.out.println("Addition result = " + (num1 + num2));
    }
    
    @Override
    public void multiply(int num1, int num2)
    {
        System.out.println("Multiplication result = " + (num1 * num2));
    }
}

class Subtraction extends multiplication
{
    public void subtract(int num1,int num2)
    {
        System.out.println("Subtraction result = " + Math.abs(num1 - num2));
    }
}

public class Operations 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        Subtraction operation = new Subtraction();
        operation.add(num1, num2);
        operation.subtract(num1, num2);
        operation.multiply(num1, num2);
        
        scanner.close();
    }
}