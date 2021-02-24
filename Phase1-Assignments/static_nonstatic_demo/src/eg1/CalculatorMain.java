package eg1;

public class CalculatorMain {

	public static void main(String[] args) {
		helloStatic();
   Calculator.helloStatic();  //classname.methodname since it is in the diff class and it is static. if diff package use import
	Calculator c=new Calculator(); //if non static then create an object
	c.helloNonStatic();
	
	CalculatorMain cm=new CalculatorMain();
	cm.helloNonStatic();
}

   public static void helloStatic() {
	System.out.println("Hello from helloStatic() from CalculatorMain");
}
   

public  void helloNonStatic() {
	
	System.out.println("Hello from helloNonStatic of CalculatorMain");

	{
		   final int x=100;
		   //x=99;  (you can access value but not initialize new final value
		 System.out.println("x="+x); 
		 
		 System.out.println("P="+Calculator.P); //classname.P bcoz it is static you can access it directly with class name no need of abject to access this
	// now lets see few predefined  static convention variables
		 
		 System.out.println("PI="+Math.PI);
		 System.out.println("Max Integer Value="+Integer.MAX_VALUE);
		 System.out.println("Max Long Value="+Long.MAX_VALUE);
	
	}
}
}


