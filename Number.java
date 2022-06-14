package Ritvik_java;

// if else
//if(condition)
//{
//	statements;
//} 

//WAP to check whether the given number by user is positive,negative or zero


import java.util.Scanner;

class Number
{
	 static int num;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("The number "+num+" is positive.");
		}
		else if(num<0)
		{
			System.out.println("The number "+num+" is negative.");
		}
		else
		{
			System.out.println("The number "+num+" is zero.");
		}
	}//end of main	
}//end of class


//WAP to take a number from user (That should be between 1-7) and give the corresponding day of the week 
//for eg i/p - 1 then day should be monday
//	 i/p - 2 then day should be tuesday .....and so on


//WAP to check whether the given number by user is even or odd  	

//WAP to check whether the year entered by the user is a leap year or not?

//WAP to check wheter the character entered by the user is vowel or not ?

//WAP to check whether the number entered by the user is between 1-5 or 6-10 