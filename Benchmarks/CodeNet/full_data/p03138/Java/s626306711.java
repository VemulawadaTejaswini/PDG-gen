import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();

		int m = 45;
		int[] cnt = new int[m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				cnt[j] += a[i] >> j & 1;
			}
		}

		long[] dp0 = new long[m];
		long[] dp1 = new long[m];
		for (int j = m - 2; j >= 0; j--) {
			int bit = 0;
			int c = cnt[j];
			if (n - cnt[j] > cnt[j]) {
				bit = 1;
				c = n - cnt[j];
			}
			long b = 1L << j;
			if (b > k) {
				dp0[j] = dp0[j + 1] + cnt[j] * b;
			} else {
				if ((k & b) == 1) {
					if (bit == 0) {
						dp1[j] = Math.max(dp0[j + 1], dp1[j + 1]) + c * b;
					} else {
						dp1[j] = Math.max(dp0[j + 1] + cnt[j] * b, dp1[j + 1] + c * b);
						dp0[j] = dp0[j + 1] + (n - cnt[j]) * b;
					}
				} else {
					dp1[j] = dp1[j + 1] + c * b;
					if (bit == 0) {
						dp0[j] = dp0[j + 1] + c * b;
					}
				}
			}
		}
		System.out.println(Math.max(dp0[0], dp1[0]));
	}
}
