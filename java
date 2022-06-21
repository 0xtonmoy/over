package basicjava;
class B{
	
	void condition() {
		
		int x=21,y=20;
		if (x>y) 
			
			System.out.println("X is large");
		else 
			System.out.println("Y is large");	
	}	
}

class A{
	
		 int x;
		 void sum(int a) {
		 x=a;
		 x=x+5;
		 System.out.println("The value of x is - "+x);
		 }	 
}

public class Lab01 {

	public static void main(String[] args) {
		
		B obj2=new B();
		obj2.condition();
		
	A obj1=new A();
	obj1.sum(150);

	}
}
