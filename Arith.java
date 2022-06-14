package Ritvik_java;

import java.util.Scanner;

class Arith{
	//static int a=10,b=20;
	
	public static void main(String[] args)
	{
		int choice;
		Calc obj =new Calc();
		Scanner sc=new Scanner(System.in);
		obj.getData();
		System.out.println("1-Addition");
		System.out.println("2-Subtraction");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:obj.add(); 
				break;
			case 2:obj.sub();
				break;
		}//end of switch
			
	}
}

class Calc{
	int a,b,c;
	void getData()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void add()
	{
		c=a+b;
		System.out.println("Sum : "+c);		
	}
	void sub()
	{
		c=a-b;
		System.out.println("Difference : "+c);		
	}
}