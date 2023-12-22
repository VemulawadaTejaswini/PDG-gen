import java.util.*;

public class Main {

	private static final long MOD = 100_000_000_7;

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		long[] x = new long[N];
		long[] y = new long[M];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
		}

		for (int i = 0; i < M; i++) {
			y[i] = sc.nextLong();
		}
		//bruteForce(x, y);
		System.out.println(area(x, y, 0, x.length - 1, 0, y.length - 1));
		sc.close();
	}

	private long area(long[] x, long[] y, int left, int right, int bottom, int top) {
		final int w = right - left;
		final int h = top - bottom;
		final long width = x[right] - x[left];
		final long height = y[top] - y[bottom];
		final long areaBase = (height * width) % MOD;

		long totalArea = areaBase * (right - left) % MOD;
		totalArea = totalArea * (top - bottom) % MOD;

		if (w <= 2 && h <= 2) {
			return totalArea;
		} else if (w <= 2) {
			return (totalArea + area(x, y, left, right, bottom + 1, top - 1)) % MOD;
		} else if (h <= 2) {
			return (totalArea + area(x, y, left + 1, right - 1, bottom, top)) % MOD;
		} else {
			totalArea = (totalArea + area(x, y, left + 1, right - 1, bottom, top)) % MOD;
			totalArea = (totalArea + area(x, y, left, right, bottom + 1, top - 1)) % MOD;
			totalArea = (totalArea - area(x, y, left + 1, right - 1, bottom + 1, top - 1));
			return (totalArea >= 0) ? totalArea % MOD : (totalArea + MOD) % MOD;
		}
	}

	private void bruteForce(long[] x, long[] y) {
		int n = x.length;
		int m = y.length;
		long S = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = 0; k < m; k++) {
					for (int l = k + 1; l < m; l++) {
						S = (S + (x[j] - x[i]) * (y[l] - y[k])) % MOD;
					}
				}
			}
		}
		System.out.println(S);
	}
}