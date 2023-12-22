import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextLong(), b = scan.nextLong(), c = scan.nextLong();
		
		if(c - a - b > 0 && 4 * a * b < (c - a - b) * (c - a - b)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
}