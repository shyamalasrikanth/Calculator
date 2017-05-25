package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

  class mno
{
	void display()
	{
		int x=50;
		Scanner sc=new Scanner(System.in);
		System.out.println("local variable x="+x);
		x=sc.nextInt();
	}
	}
public class localoject



{
	public static void main(String args[])
	{

	mno s=new mno();
	s.display();
}	
}

