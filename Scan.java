package Ritvik_java;

import java.util.Scanner;

class Scan
{	
	//static int i;
	//static String name1,name2;
	
	public static void main(String[] args)
	{
		int i;
		String name1,name2;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the integer :");
		i=obj.nextInt();//to read the integer 	
		System.out.println("Enter one word:");
		name1=obj.next();//to read a word 
		obj.nextLine();
		System.out.println("Enter one sentence:");
		name2=obj.nextLine();//to read the string 
		System.out.println("Integer: "+i);
		System.out.println("Word: "+name1);
		System.out.println("Sentence: "+name2);
	}//end of main
}//end of Scan