package Ritvik_java;

public class StaticDemo {
//static -> class - N , method - Y , variable  -Y
	public static void main(String[] args) {
		TestStatic t = new TestStatic();
		t.num = 1000;
		t.n= 200;
		System.out.println(t.num);//1000
		System.out.println(t.n);//200
		
		TestStatic t1 = new TestStatic();
		t1.num =2000;
		System.out.println(t1.num);//2000
		System.out.println(t.num);//1000
		System.out.println(t1.n);//0
		System.out.println("-------------------");
		t.print();
		
	}
	
}

class TestStatic{
	static int num ; // only 1 copy
	int n; // objets -> copies 
	
	static void print() {
		num = 10; //class 
		int n=100;// local 
		System.out.println( num );
		System.out.println(n);
	}
}


