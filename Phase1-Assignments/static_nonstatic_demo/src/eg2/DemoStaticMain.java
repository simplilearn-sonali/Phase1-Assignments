package eg2;

public class DemoStaticMain {
	
	int x;  //global instance (object) level variable
	int y;
	static int z;  //global class level variable (means you donr need an object to access it)
	

	public static void main(String[] args) {  //static method are termed to be as object level access
		DemoStaticMain d1=new  DemoStaticMain();
		d1.x=100;
		d1.y=88;
		//d1.z=12; we can access z like this also but see error since it is static we dont need object we can access direct
		z=1000;
		System.out.println("printind d1");
		d1.printXYZ();

		DemoStaticMain d2=new DemoStaticMain();
		System.out.println("\nprintind d2"); //static valuea remains common
		d2.printXYZ();
		z=1; // if you dont change value above ones will print
		
		System.out.println("\nprintind d2 again"); 
		d2.printXYZ();
		
		System.out.println("\nprintind d1 again"); 
		d1.printXYZ();
		
		
	}
    public void printXYZ() { //non static method are termed to be as class access
	    System.out.println("x="+x);  //note: if it is non static you can access all the static and non static variables but if it is static you can access only the static variables. Only when you create a abject in static you can access non static 
	    System.out.println("y="+y);
	    System.out.println("z="+z);
	
}
}
