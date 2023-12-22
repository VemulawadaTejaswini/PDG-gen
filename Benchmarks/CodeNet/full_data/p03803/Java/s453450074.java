import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == b) {
			System.out.println("Draw");
		} else if ((b < a || a == 1) && b != 1) {
			System.out.println("Alice");
		} else {
			System.out.println("Bob");
		}


		sc.close();

	}

}