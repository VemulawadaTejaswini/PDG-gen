

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		long min = a * (n - 1) + b;
		long max = b * (n - 1) + a;

		long ans = 0;

		if (a == b || n == 2) {
			ans = 1;
		} else if (a < b || n == 1) {
		} else {
			ans = max - min + 1;
		}
		System.out.println(ans);

	}

}
