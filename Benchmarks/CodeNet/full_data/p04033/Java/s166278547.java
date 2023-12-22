import java.util.Scanner;

public class Main {
	private static Scanner stdIn;
	
	public static void main(String[] args) {
		stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if(a > 0) 
			System.out.println("Positive");
		else if(a == 0 || b >= 0)
			System.out.println("Zero");
		else {
			if((b - a) % 2 == 1)
				System.out.println("Positive");
			else
				System.out.println("Negative");
		}
	}
}
