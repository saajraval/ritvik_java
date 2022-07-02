package Ritvik_java;
import java.util.Scanner;

public class Sort2Darray {
	
	public static void main(String[] args) {
		System.out.println("Enter  the rows and cols :");
//		Sort2Darray s = new Sort2Darray();
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int a[][]= new int [r][c];
		for(int i =0 ;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("a["+i+"]["+j+"]:"); //a[0][0]:
				a[i][j]=sc.nextInt();
			}
		}//end of scann
		System.out.println("Array Before sorting : ");
		for(int i =0 ;i<r;i++) {
			for(int j =0;j<c;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
		}
		
		/*
		 1 2 3 
		 4 5 6
		 7 8 9
		 
		 */
		
		int b[] = new int[r*c];
		int k=0;
		for(int i=0;i<r;i++) {
			for(int j=0 ;j<c;j++) {
				b[k] = a[i][j];
				k++;//  
			}
		}//end of convertion
		//sorting of one D  -> bubble sort 
		// 9 8 7 6 5 4 3 2 1
		// 8 9 7 6 5 4 3 2 1 
		// 8 7 9 6 5 4 3 2 1
		//....
		// 8 7 6 5 4 3 2 1 9
		int temp;
		for(int i=0;i<k;i++) // 1 
		{
			for(int j=0;j<k-1;j++)//8  
			{
				if(b[j]>b[j+1]) {
					temp = b[j];
					b[j]=b[j+1];
					b[j+1]= temp;
				}
			}
		}//end of sorting 
		//1D to 2D
		k=0;
		for(int i=0 ; i<r;i++) {
			for(int j =0;j<c;j++) {
				a[i][j]= b[k];
				k++;
			}
		}
		System.out.println("Array After sorting : ");
		for(int i =0 ;i<r;i++) {
			for(int j =0;j<c;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
		}
	}
	
}
