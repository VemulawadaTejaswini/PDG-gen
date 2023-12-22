package abc154;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		StringBuilder sb = new StringBuilder();

		for (long i = 0; i < n; i++) {
			String input = scan.next();
			if (sb.toString().indexOf(input + ",") < sb.length()) {
				System.out.println("NO");
				scan.close();
				return;
			}
			sb.append(input + ",");
		}

		scan.close();
		System.out.println("YES");
	}

}
