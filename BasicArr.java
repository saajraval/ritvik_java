package Ritvik_java;

import java.util.Scanner;

public class BasicArr{

	public static void main(String [] args){
	
		// 1 2 3 4 
		
		//int a[] = {1,2,3,44,55,4,2,12,132,213,33,33,34,55,21} ;
	
		Scanner sc = new Scanner(System.in);
		
		// int arr []
		System.out.println(" Enter the size of the array :");
		int n= sc.nextInt(); 

		int a[] = new int[n]; 

		for(int i=0 ; i< n ;i++){
			System.out.println( "Enter the element  a[" + i + " ] :");   // a[3]
			a[i] =sc.nextInt();
		}//end of scanning 
		
		System.out.println(" Elements of the array are : \n ");
		for(int i =0; i<a.length;i++){
			System.out.print(" \t "+ a[i]);
		}//end of printing

	}//end of main
}//end of class