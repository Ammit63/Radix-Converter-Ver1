import java.util.Scanner;

public class E15_DecToHexConverter {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//User input
		System.out.println("Please enter an Decimal number: ");
		int num = sc.nextInt(); 
		int num2 = num;// to allow the final printout to have the original number we entered and not the number 0 which is the final calculated num.
		sc.close();
	
		// Create a variable for storing remainder 
		int a;
		// Create a variable for storing result
		String s = "";
		 // Create an array for converting digits in hexadecimal number system
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		// The conversion engine 
		while (num > 0){
		 a = num %16; //modulus 16
		 s = hex[a] + s;
		 num = num / 16;// Divide the resulted number by 16 and repeat the process until num = 0, and while loop ends.

	}
		 System.out.println("The Hexadecimal equivelent of the Decimal number: "+num2+ " is: "+s);
	}
}
