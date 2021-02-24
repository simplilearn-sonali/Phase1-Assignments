package eg1;

public class CalciMain {

	public static void main(String[] args) {
		int a=100;  // doesnt matter a,b or x,y a will assign as x and vice cersa this is called as pass by value
		int b=777;
		
		Calculator c1=new Calculator();
		int res=c1.sum(a,  b); //call by value or pass by value
		System.out.println("res="+res);
		
		Calculator.sum(1229, b, a);
		
		System.out.println("res of sum(float,float):"+c1.sum(12.33f, 333.45f));
	
	String firstName="Soanli"; //string is object so address is what gets communicated 
	String lastName="Kastoori";
	//call by or pass by referrence 
	System.out.println("FullName is "+c1.getFullName(firstName, lastName)); 
	int n=22;
	if(c1.isEven(n)) {
		System.out.println("YES "+n+" is even");
		
	}else {
		System.out.println("NO "+n+" is odd");
		
	}
	
	}
}
