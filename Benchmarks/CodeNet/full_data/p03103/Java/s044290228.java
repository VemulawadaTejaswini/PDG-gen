

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		HashMap<Long, Long> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
		}

		long[] ac = a.clone();

		Arrays.sort(ac);

		long ans = 0;
		long sum = 0;

		out_of_loop:
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (ac[i] == a[j]) {
					if (sum + b[j] >= m) {
						ans += ac[i] * (m - sum);
						break out_of_loop;
					} else {
						ans += ac[i] * b[j];
						sum += b[j];
					}
				}
			}
		}
		System.out.println(ans);

	}

}
