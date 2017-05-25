
package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

 class Calc1
{
	Float a,b,c,res;
	int d;
	
	
	public void Calc1()
        {
		
		
	}
	
	public void menu()
        {
      
    	System.out.println("1.addition");
    	System.out.println("2.subtraction");
    	System.out.println("3.multiply");

        System.out.println("4.divisin");
        System.out.println("*****select option******");

            
            
    	
  Scanner s=new Scanner(System.in);
      d=s.nextInt();
    	
    	
    	
	}
	
    public void userInputs()
    {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first  number");
    	a=s.nextFloat();
    	System.out.println("Enter second number");
    	b=s.nextFloat();
    }

    public void performOperation()
{
    	switch(d)
    	{
    	case 1:
            System.out.println("addition");
            res=add();
            System.out.println("res" +res);
            break;
            
    	case 2:
            System.out.println("subtraction");
            res=subtract();
            System.out.println("res"+res);
            break;
            
    	case 3:
            System.out.println("mutiply");
            res=multiply();
            System.out.println("res"+res);
            break;
            
    	case 4:
            System.out.println("divide");
            res=divide();
            System.out.println("res"+res);
            break;
            
            
    	}
    	}
	Float add()
	{
		c=a+b;
		return c;
	}
	
	Float subtract()
	{
		c=a-b;
		return c;
	}
	
	Float multiply()
	{
		c=a*b;
		return c;
		
	}
	
	Float divide()
	{
		c=a/b;
		return c;
		
	}
	
} 
 
 public class BasicCalc
 {
	 public static void main(String args[])
	 
	 {
		 Calc1 c=new Calc1();
		 c.menu();
		 c.userInputs();
		 c.performOperation();
	 }
 }
 
 
 
 
 
 