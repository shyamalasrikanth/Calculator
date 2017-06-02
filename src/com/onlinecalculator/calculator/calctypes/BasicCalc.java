
package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

 public class BasicCalc
{
	public int a,b,c,res;
	public int ch;
	
	
	public  BasicCalc()
        {
		a=0;
		b=0;
		c=0;
		ch=0;
		res=0;
		
	}
	
	public int menu()
        {
      
    	System.out.println("1.addition");
    	System.out.println("2.subtraction");
    	System.out.println("3.multiply");

        System.out.println("4.divisin");
        System.out.println("*****select option******");
 Scanner s=new Scanner(System.in);
      ch=s.nextInt();
    	
    	return 0 ;
    	
	}
	
    public void userInputs()
    {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first  number");
    	a=s.nextInt();
    	System.out.println("Enter second number");
    	b=s.nextInt();
    }

    public void performOperation()
{
    	switch(ch)
    	{
    	case 1:
          
            res=add();
            System.out.println("res"+res);
            break;
            
    	case 2:
            
            res=subtract();
            System.out.println("res"+res);
            break;
            
    	case 3:
            
            res=multiply();
            System.out.println("res"+res);
            break;
            
    	case 4:
            
            res=divide();
            System.out.println("res"+res);
            break;
            
            
    	}
    	}
	int add()
	{
		c=a+b;
		return c;
	}
	
	int subtract()
	{
		c=a-b;
		return c;
	}
	
	int multiply()
	{
		c=a*b;
		return c;
		
	}
	
	int divide()
	{
		c=a/b;
		return c;
		
	}
	

 
public static void main(String arg[])
{
 BasicCalc calc=new BasicCalc();
 calc.menu();
 calc.userInputs();
 calc.performOperation();
}
}
 