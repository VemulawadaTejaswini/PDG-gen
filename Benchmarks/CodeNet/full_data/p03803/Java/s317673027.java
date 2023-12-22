
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a==b) {
			System.out.println("Draw");
		}
		if (a==1) {
			System.out.println("Alice");
		}
		if (b==1) {
			System.out.println("Bob");
		}
		if (a>=2 && b>= 2 && a>b) {
			System.out.println("Alice");
		}
		if (a>=2 && b>= 2 && a<b) {
			System.out.println("Bob");
		}
	}
}
