package eg1;

public class MobileNumberValidation {

	public static void main(String[] args) {
		/*String s = "+1-9087654329";
		if (s.matches("\\+1-[0-9]{10}")) {
			System.out.println("Valid mobile number");
		} else {
			System.out.println("Invalid Mobile Number"); */
			
			
			 String s1 = "H-2719601";
			if (s1.matches("[A-Z]-[0-9]{7}")) {
				System.out.println("Valid passport number");
		} else {
			System.out.println("Invalid passport Number");
		}

	}

}

