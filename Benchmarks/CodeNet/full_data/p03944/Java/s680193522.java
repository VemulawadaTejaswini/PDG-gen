import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the 3 digits");
		int a,b,c;
	   a = input.nextInt(); b = input.nextInt(); c  = input.nextInt();
	   
	  
	   if (a+b == c || c+a == b || b+c==a) {
		   System.out.println("Yes");
	   }
	   else {
		   System.out.println("No");
	   }
		   
	  
	}

}
