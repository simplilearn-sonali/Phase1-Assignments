package eg1;

public class Calculator {

		
public int sum(int x, int y) {
	return x+y;
	
	}
 public static void sum(int a,int b,int c) { //method overloadind same name(int) diff arguments (a,b,C)
	 //return a+b+c; //line 6 changed in 10
	 System.out.println("Res of sum(int,int,int) : "+(a+b+c));
 }
 
 public float sum(float a, float b) {  //same name diff parameters methoad overloading
	 return a+b;
 }
 
 public String getFullName(String fName, String lName) {
	 return fName+" "+lName;
	 
	 
 }
public boolean isEven(int n) {
	return (n%2==0);
}
}
