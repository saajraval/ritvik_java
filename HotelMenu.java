package Ritvik_java;


import java.util.Scanner;

public class HotelMenu
{
	public static void main(String[] args)
	{
		int choice,choice_starter,choice_soups,choice_italian,choice_punjabi,choice_south,choice_chinese,choice_cold;
		int qty_pchilly,qty_atikki,qty_srolls,qty_gbread,qty_id	,qty_tom,qty_hot,qty_piz,qty_pas,qty_nan,qty_pbm,qty_pal,qty_han,qty_man,qty_sp,qty_coke,qty_md;
		int t_pchilly=0,t_atikki=0,t_srolls=0,t_md=0,t_id=0,t_gbread=0,t_tom=0,t_hot=0,t_piz=0,t_pas=0,t_nan=0,t_pbm=0,t_pal=0,t_man=0,t_han=0,t_coke=0,t_sp=0;
		int sum=0;
		char ans;
		while(true){
		Scanner s =new Scanner(System.in);
		System.out.println("Welcome To THE SEVEN!!");
		System.out.println("----------------------");
		System.out.println("1-STARTERS");
		System.out.println("2-SOUPS");
		System.out.println("3-ITALIAN");
		System.out.println("4-PUNJABI");
		System.out.println("5-SOUTH INDIAN");
		System.out.println("6-CHINESE");
		System.out.println("7-COLD DRINKS");
		System.out.println("8-Bill And exit");
		System.out.println("Enter your choice");
		choice= s.nextInt();
		switch(choice)
		{
			case 1:System.out.println("You have selected STARTERS!!");
				System.out.println("1-PANNER CHILLY");
				System.out.println("2-ALLO TIKKI");
				System.out.println("3-SPRING ROLLS");
				System.out.println("4-GRALIC BREAD");
				System.out.println("Enter your choice in STARTERS!!");
				choice_starter=s.nextInt();
				switch(choice_starter)
				{
					case 1: System.out.println("How much quantity of PANNER CHILLY  you want ??");
						qty_pchilly=s.nextInt();
						t_pchilly=qty_pchilly*170;
						break;
					case 2: System.out.println("How much quantity of ALLO TIKKI  you want ??");
						qty_atikki=s.nextInt();
						t_atikki=qty_atikki*140;
						break;
					case 3: System.out.println("How much quantity of SPRING ROLLS you want ??");
						qty_srolls=s.nextInt();
						t_srolls=qty_srolls*120;
						break;
					case 4:  System.out.println("How much quantity of PANNER CHILLY  you want ??");
						qty_gbread=s.nextInt();
						t_gbread=qty_gbread*110;
						break;
				}//end of switch of choice of startter
				break;//end of case 1 of SATRTERS 
		
			case 2: System.out.println("You have selected SOUPS!!");
				System.out.println("1-Tomato");
				System.out.println("2-Hot and Sour");
				System.out.println("Enter you choice in SOUPS!!");
				choice_soups=s.nextInt();
				switch(choice_soups)
				{
					case 1: System.out.println("How much quantity of TOMATO SOUP you want ??");
						qty_tom=s.nextInt();
						t_tom=qty_tom*70;
						break;
					case 2: System.out.println("How much quantity of HOT & SOUR SOUP you want ??");
						qty_hot=s.nextInt();
						t_hot=qty_hot*90;
						break;
				}//end of switch of choice of SOUPS
				break;//end of case 2 of SOUPS

			case 3: System.out.println("You have selected ITALIAN!!");
				System.out.println("1-Pizza");
				System.out.println("2-Pasta");
				System.out.println("Enter your choice:");
				choice_italian=s.nextInt();
				switch(choice_italian)
				{
					case 1: System.out.println("How much Qyantity of PIZZA you want ??");
						qty_piz=s.nextInt();
						t_piz=qty_piz*200;
						break;
					case 2:  System.out.println("How much Qyantity of PASTA you want ??");
						qty_pas=s.nextInt();
						t_pas=qty_pas*180;
						break;
				}//end of switch of ITALIAN	
				break;//end of case 3 of ITALIAN

			case 4: System.out.println("You have selected PANJABI!!");
				System.out.println("1-Nan");
				System.out.println("2-Panner butter masala");
				System.out.println("3-Palak");
				System.out.println("Enter your choice in PUNJABI!!");
				choice_punjabi=s.nextInt();
				switch(choice_punjabi)
				{
					case 1: System.out.println("How much qyantity of NAN you want ??");
						qty_nan=s.nextInt();
						t_nan=qty_nan*30;
						break;
					case 2: System.out.println("How much qyantity of PANNER BUTTER MASALA you want ??");
						qty_pbm= s.nextInt();
						t_pbm=qty_pbm*220;
						break;
					case 3: System.out.println("How much qyantity of PALAK you want ??");
						qty_pal=s.nextInt();
						t_pal=qty_pal*200;
						break;
				}//end of switch of punjabi
				break;//end of case 4 of punjabi	

			case 5: System.out.println("You have selected SOUTH INDIAN!!");
				System.out.println("1-Masal Dosa");
				System.out.println("2-Idli");
				choice_south=s.nextInt();
				switch(choice_south)
				{
					case 1: System.out.println("How much qyantity of MASALA DOSA  you want ??");
						qty_md=s.nextInt();
						t_md=qty_md*140;
						break;
					case 2: System.out.println("How much qyantity of IDLI you want ???");
						qty_id=s.nextInt();
						t_id=qty_id*80;
						break;
				}//end of switch of south indian
				break;

			case 6: System.out.println("You have selected CHINESE!!");
				System.out.println("1-Manchuriyan");
				System.out.println("2-Hakka Noddels");
				System.out.println("Enter your choice in CHINESE!!");
				choice_chinese=s.nextInt();
				switch(choice_chinese)
				{
					case 1: System.out.println("How much qyantity of MANCHURIYAN you want ??");
						qty_man= s.nextInt();
						t_man=qty_man*180;
						break;
					case 2: System.out.println("How much qyantity of HAKKA NODDLES you want ??");
						qty_han= s.nextInt();
						t_han=qty_han*180;
						break;
				}//end of switch of CHINESE!!
				break;

			case 7: System.out.println("You have selected COLD DRINK!!");
				System.out.println("1-Coke");
				System.out.println("2-Sprite");	
				System.out.println("Enter your choice of COLD DIRNK!!");
				choice_cold=s.nextInt();
				switch(choice_cold)
				{
					case 1: System.out.println("How much quantity of COKE you want ??");
						qty_coke=s.nextInt();
						t_coke=qty_coke*50;
						break;
					case 2: System.out.println("How much quantity of SPRITE you want ??");
						qty_sp=s.nextInt();
						t_sp=qty_sp*50;
						break;
				}//end of switch of cold drink
			case 8: sum=t_pchilly+t_atikki+t_srolls+t_gbread+t_tom+t_hot+t_piz+t_pas+t_nan+t_pbm+t_pal+t_man+t_han+t_coke+t_sp;
				System.out.println("Your total bill is: "+sum);
				System.out.println("Thank you!! visit again...........");
				System.exit(0);
			default: System.out.println("Invalid choice!!");
		}//end of switch of choice
		}//end of while 
		
	}//end of main
}//end of class