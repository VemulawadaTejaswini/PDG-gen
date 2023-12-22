
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int cake = 4;
		final int donuts = 7;

		int a = n % cake;
		int b = n % donuts;
		if (a == 0 || b == 0) {
			System.out.println("Yes");
			return;
		}
		if (n < (donuts - 1)) {
			System.out.println("No");
			return;
		}

		if (a % donuts == 0 || b % cake == 0) {
			System.out.println("Yes");
			return;
		}

		System.out.println("No");
	}

}
