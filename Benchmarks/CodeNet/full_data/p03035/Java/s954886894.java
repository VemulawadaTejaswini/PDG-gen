

import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = B;
		if (A >= 13) {
			X = B;
		} else if (6 <= A && A <= 12) {
			X = B / 2;
		} else if (A <= 5) {
			X = 0;
		}

		System.out.println(X);

	}
}
