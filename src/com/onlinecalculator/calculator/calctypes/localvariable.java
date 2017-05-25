package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class localvariable
{
static void  display ()
{
	int x=10;
	Scanner sc=new Scanner(System.in);
	System.out.println("local variablex=" +x);
	x=sc.nextInt();
}
		public static void main(String args[])
		{
			display();
		}
		
	}


