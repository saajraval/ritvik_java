package Ritvik_java;

// s1 =" Sachin" s2 =" SACHIN" -> true false 
// equals() -> boolean true 
// compare -> int 

import java.util.Scanner;

public class Strings_kushal{

	public static void main(String[] args){
		String s1= "Sachin";  
		String s2="SACHIN";
		String s3="Sachin";
 		String s4="Qajan";
		
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.equals(s3));
		//System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4)); // q r s t 
		System.out.println(s4.compareTo(s1));
	}//end of main
}//end of class