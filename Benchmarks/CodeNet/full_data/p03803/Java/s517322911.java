import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a==1) {
			System.out.println("Alice");
		}
		if (b==1) {
			System.out.println("Bob");
		}
		if (a==b) {
			System.out.println("Draw");
		}
		if (a>b) {
			System.out.println("Alice");
		}
		if (b>a) {
			System.out.println("Bob");
		}
	}
}
