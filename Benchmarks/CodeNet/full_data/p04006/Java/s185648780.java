

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		b = a.clone();

		long ans = Long.MAX_VALUE;

		for (int k = 0; k < n; k++) {

			long xk = x * k;
			long sum = 0;

			for (int i = 0; i < n; i++) {
				b[i] = Math.min(b[i], a[(i - k + n) % n]);
				sum += b[i];
			}

			ans = Math.min(ans, sum + xk);

		}

		System.out.println(ans);

	}

}
