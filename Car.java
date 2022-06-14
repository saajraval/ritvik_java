package Ritvik_java;

/* void add(){
	
	int  a, b;
}

Default 
Parameterized
*/


class Car{

	String name;
	Car(){
		System.out.println("Car is going fast .........!!");
	}

	Car(String n){
		name=n;
		System.out.println(" Name of the car is :"+name);
	}

	public static void main(String [] args){
		// 
		Car a = new Car();
		Car b= new Car("McLaren P1");
	}
}//end of class

