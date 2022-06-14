package Ritvik_java;

class Test{
	static void add(int a,int b){
		System.out.println("The Sum is : "+(a+b));
	}
	
	static void add(int a,int b,int c){
		System.out.println("The Sum is : "+(a+b+c));
	}

}// end of class 

class Add {
		public static void main(String [] args){
			Test.add(10,20);
			Test.add(10,20,30);		
	}	

}