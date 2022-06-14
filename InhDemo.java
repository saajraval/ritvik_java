package Ritvik_java;

public class InhDemo {
	public static void main(String [] args){
		SciCalc sc = new SciCalc();
		sc.access();
	} 
}

//single inh 

class BasicCalc {

	void add(){
		System.out.println("BasicCalc::add()");		
	}

	void sub(){
		System.out.println(" BasicCalc::sub()");		
	}	

}//end of class BasicCalc

class SciCalc extends BasicCalc{
	
	void sqrt(){
		
	}

	void access(){
		this.sub(); 
		super.sub();
	}

	//overriding
	void sub(){
		System.out.println("SciCalc::sub()");
	}
}