package Ritvik_java;

class Values{
	boolean b;

	char c;

   	byte bb;
 	short s;
   	int i;
   	long l;

   	float f;
   	double d;
	void display()
	{
		System.out.println("char:"+c);
		System.out.println("byte:"+bb);
		System.out.println("short:"+s);
		System.out.println("int:"+i);
		System.out.println("long:"+l);
		System.out.println("float:"+f);
		System.out.println("double:"+d);
	}//end of void display
	public static void main(String args[])
	{
		Values v=new Values();
		System.out.println("The default values are:");
		System.out.println("boolean:"+v.b);// like this 
		v.display();
	}//end of main
}

// To print Default values we need to declare the values to class and the default values is given to the class (as it is its property) so there will be compliation error 
// if we do it in main method. also we can access through class object  