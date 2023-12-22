import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			long a = scan.nextLong();
			long b = scan.nextLong();
			long c = scan.nextLong();


			long ans = (c-a-b)*(c-a-b)-4*a*b;

			if(ans>0) System.out.println("Yes");
			else System.out.println("No");


		}


	}


}
