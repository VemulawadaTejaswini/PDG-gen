import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long c = stdIn.nextLong();
		
		
		
		
		if(a+b+2*(long)Math.sqrt(a*b) < c) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}



	}

}
