import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		long[] b = new long[n + 1];
		long[] c = new long[n + 2];
		b[0] = 0;
		c[0] = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (i == 0) {
				b[i + 1] = a[i];
				c[i + 1] = Math.max(a[i], 0);
			} else {
				b[i + 1] = b[i] + a[i];
				c[i + 1] = c[i] + Math.max(a[i], 0);
			}
		}
		c[n + 1] = c[n];
		long sum, ans = 0;
		for (int i = k; i <= n; i++) {
			sum = c[i - k];
			sum += c[n + 1] - c[i];
			ans = Math.max(ans, sum);
			sum += b[i] - b[i - k];
			ans = Math.max(ans, sum);
		}

		System.out.println(ans);
	}
}