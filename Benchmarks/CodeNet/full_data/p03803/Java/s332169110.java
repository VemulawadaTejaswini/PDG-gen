import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == b) {
			System.out.println("Draw");
		}
		else if(a == 1) {
			System.out.println("Alice");
		}
		else if(b == 1) {
			System.out.println("Bob");
		}
		else
			System.out.println(a > b ? "Alice" : "Bob");

		sc.close();

	}
}

