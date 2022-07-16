package Ritvik_java.StaticW;

public class StaticDemo {
	public static void main(String[] args) {
		Astatic obj =new Astatic();
		obj.num = 123;
		obj.x=200;
		System.out.println(obj.num);//123
		System.out.println(obj.x);//200
		
		Astatic obj1 = new Astatic();
		
		System.out.println(obj1.num);//123  //0
		System.out.println(obj1.x);// 200
		
		
		// instance var . ->  for each new object will take a diff memory space 
		Astatic obj2 = new Astatic();
		obj2.x= 500;
		System.out.println(obj2.x);
		System.out.println(obj1.x);
		
		System.out.println("-----------------");
		
		obj.printStatic();
		obj2.printStatic();
	}
}
//var method
class Astatic{
	int num;
	static int x;
	
	void print() {
		 num = 200;
		 x = 2000;
		 System.out.println(num);
		 System.out.println(x);
	}
	
	static void printStatic() {
		x=1000;
		int y = 12;//local 
		System.out.println(x);
		System.out.println(y);
//		System.out.println(num);
	}
}
