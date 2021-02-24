package eg1;

public class Calculator {
	
	private int x;
	private int y;
	
	/*
	 * Calculator(){}
	 * default no parameterized empty constructor is created by by java compiler
	 * "this" constructor will be taken off by the compiler whenever the 
	 * programmer creates one of his own.
	 */
	
	public Calculator(String name) {
		System.out.println("hello from constructor name is "+name);
	}
	//public Calculator(int a,int b){
	// x=a;    // 18,19,20 before using this
	// y=b;
	public Calculator(int x,int y) {
		this.x=x;  //this refers to global value line 5,6. this helps to assign loc value to global value
		this.y=y;
	}
	
	
	public int add() {
		return x+y;
	}

}
