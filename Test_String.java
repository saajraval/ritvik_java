package Ritvik_java;

//equals -> will compare the string considering its case -> true /  false  
//equalsIgnoreCase -> 
//toLowerCase
//toUpperCase

//compareTo =  r s 
import java.util.Scanner;
class Test_String{

	public static void main(String[] args){
		String s = "saaj";	
		String s1="saaj";
		String s2="Ratan";
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		str1=sc.next();

		
		//boolean ans;
		//s1=s1.toLowerCase();
		//Saaj Raval 
		//s=s.concat(" Raval");

		System.out.println("S :"+s);
		System.out.println("S1 :"+s1);

		//ans=s.equals(s1);
		//System.out.println(s.equals(s2));
		//System.out.println(s.equals(s1));

		//System.out.println(s.equalsIgnoreCase(s1));

		//System.out.println(ans);

		System.out.println(s.compareTo(s1));
		System.out.println(s1.compareTo(s));

		System.out.println(s==s1); //true / false

		String str="SR"+7;
		System.out.println(str.concat("7"));

		char ch= s.charAt(0);
		System.out.println(ch);
	}//end of main
}//end of class