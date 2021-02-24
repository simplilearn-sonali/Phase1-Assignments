package example2;

public class StringToPrimitiveDemo {

	public static void main(String[] args) {
		
		//Important Note : String is not data type in java, String is a class and in below line s is a object
		String s="900";
		
		int x=Integer.parseInt(s);
		System.out.println("x = "+x);
		
		//Similarly for Float you will do Float.parseFloat
		s="88.79";
		float f=Float.parseFloat(s);
		System.out.println("f = "+f);
		
		//Continue to try the same for byte, short, long, double.
		s="1249";
		short m=Short.parseShort(s);
		System.out.println("m="+m);
		

		s="42.21";
		double d=Double.parseDouble(s);
		System.out.println("d="+d);
		
		s="9458747";
		long l=Long.parseLong(s);
		System.out.println("l="+l);
		

	}

}
