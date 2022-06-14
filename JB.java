package Ritvik_java;
import java.util.Scanner;
public class JB {

		public static void main(String[] args) {
			User x = new User();
			x.signup();
			int tempQty;
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("1 Dabeli");
				System.out.println("2 Pizza");
				System.out.println("3 Pasta");
				System.out.println("4 Bill");
				System.out.println("5 Exit");
				System.out.println("Enter your chpoice");
				int choice = sc.nextInt();
				// 30 
				switch(choice) {
				case 1: System.out.println("How much Debeli/s ?");
					tempQty = sc.nextInt();
					if((tempQty + x.qty_d+x.qty_piz+x.qty_pas)<=30) {
					if(tempQty+ x.qty_d >10) {
						System.out.println("You are left with  "+(10-(x.qty_d))+" Dabelis ");
					}
					else {
						x.qty_d += tempQty;// 10
					}
					}
					else {
						System.out.println("You are left with "+(30-(x.qty_d+x.qty_pas+x.qty_piz))+" items");
					}
					break;
				case 2: System.out.println("How much Pizzas ?");
					tempQty = sc.nextInt();
					if((tempQty + x.qty_d+x.qty_piz+x.qty_pas)<=30) {
						if(tempQty+ x.qty_piz >10) {
							System.out.println("You are left with  "+(10-(x.qty_piz))+" Pizzas ");
						}
						else {
							x.qty_piz += tempQty;// 10
						}
					}
					else {
						System.out.println("You are left with "+(30-(x.qty_d+x.qty_pas+x.qty_piz))+" items");
					}
					break;
				case 3: System.out.println("How much Pastas ?");
					tempQty = sc.nextInt();
					if((tempQty + x.qty_d+x.qty_piz+x.qty_pas)<=30) {
						if(tempQty+ x.qty_pas >10) {
							System.out.println("You are left with  "+(10-(x.qty_pas))+" Pastas ");
						}
						else {
							x.qty_pas += tempQty;// 10
						}
					}
					else {
						System.out.println("You are left with "+(30-(x.qty_d+x.qty_pas+x.qty_piz))+" items");
					}
					break;
				case 4: x.bill();
						break;
				case 5: System.exit(0);
				}//end of choice
			}//end of while
		}//end of main
}//end of class

class User{
	
		Scanner sc  =new Scanner(System.in);
		int qty_d,qty_piz,qty_pas,total,mobNum;
		String name;
		void signup(){
			System.out.println("Enter your name :");
			name = sc.nextLine();
			System.out.println("Enter your mobile numebr ");
			mobNum = sc.nextInt();
		}
		void bill() {
			total = (qty_d*25) + (qty_piz*100)+ (qty_pas *120);
			System.out.println("Total bill "+ (total *1.1));
		}
}//end of class user
