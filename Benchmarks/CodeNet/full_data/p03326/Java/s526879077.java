import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[][] sum = new long[8][n];
		for (int i = 0; i < n; i++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			long z = sc.nextLong();
			for (int j = 0; j < 8; j++) {
				long a = 0;
				if ((j >> 0) % 2 == 1) {
					a += x;
				} else {
					a -= x;
				}
				if ((j >> 1) % 2 == 1) {
					a += y;
				} else {
					a -= y;
				}
				if ((j >> 2) % 2 == 1) {
					a += z;
				} else {
					a -= z;
				}
				sum[j][i] = a;
			}
		}
		sc.close();

		for (int j = 0; j < 8; j++) {
			Arrays.parallelSort(sum[j]);
		}

		long ans = 0;
		for (int j = 0; j < 8; j++) {
			long a = 0;
			for (int i = n - m; i < n; i++) {
				a += sum[j][i];
			}
			ans = Math.max(ans, a);
		}
		System.out.println(ans);
	}
}
