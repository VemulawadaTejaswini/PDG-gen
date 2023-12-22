import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] x = new long[n], y = new long[n];
		boolean[] b = new boolean[n];//Wならtrue、Bならfalse
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextLong() % (2 * k);
			y[i] = sc.nextLong() % (2 * k);
			if (sc.next().equals("W")) {
				//nothing do
			} else {
				x[i] -= k;
				y[i] -= k;
				if (x[i] < 0) {
					x[i] += (2 * k);
				}
				if (y[i] < 0) {
					y[i] += (2 * k);
				}
			}
		}
		long ans = 0L;
		for (int i = 0; i <= k+1; i++) {
			for (int m = 0; m <= k+1; m++) {
				long count = 0L;
				for (int j = 0; j < n; j++) {
					if (x[j] >= i && x[j] <= i + k && y[j] >= m && y[j] <= m + k) {
						count++;
					}
				}
				ans = Math.max(ans, count);
			}
		}
		System.out.println(ans);
	}
}