

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String A = "1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51";

		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		System.out.println(A.substring(2 * (K - 1), 2 * (K - 1) + 1));
	}

}
