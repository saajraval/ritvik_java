package Ritvik_java;

import java.util.Scanner;
public class Prime{

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to check ");
		int num = sc.nextInt();
		int cnt = 0;
		// 3 
		for(int i=1 ; i <= num; i++){ // 1 
			if(num % i == 0 ){
				cnt++ ;
			}
		}

		if(cnt == 2){
			System.out.println(" The number is Prime ");
		}
		else{
			System.out.println(" The number is Composite!!");
		}
	}//end of main
};