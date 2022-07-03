package Ritvik_java;
// a[5][2] -> 1 2 3 4 5
import java.util.Scanner;
public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r= sc.nextInt();
		int a[][] = new int [r][];
		for(int i=0;i<r;i++) {//a[i][]
			System.out.println("Enter the number of fields you want in "+(i+1)+"row");
			int x =sc.nextInt();
			a[i] = new int[x]; //a[0] 
		}//end of scanning for data req.
		
		//scanning of data
		System.out.println("Enter the data");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(" a["+i+"]["+j+"]: ");
				a[i][j]= sc.nextInt();
			}
		}//end of scanning
		System.out.println("\nThe array is : \n");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}//end of main
}//end of class

//*
//**
//****
//*****
//****
//**
//*
