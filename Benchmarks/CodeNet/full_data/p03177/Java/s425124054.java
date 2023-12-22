import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[][] a = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextLong();
			}
		}
		sc.close();

		int mod = 1000000007;
		long[][] b = matrixPow(a, k, mod);

		long ans = 0;
		for (int j = 0; j < n; j++) {
			for (int j2 = 0; j2 < n; j2++) {
				ans += b[j][j2];
			}
		}
		ans %= mod;
		System.out.println(ans);
	}

	static long[][] matrixPow(long[][] a, long k, int m) {
		if (k == 1) {
			return a;
		}
		long[][] ret = matrixPow(a, k / 2, m);
		ret = matrixMul(ret, ret, m);
		if (k % 2 == 1) {
			ret = matrixMul(ret, a, m);
		}
		return ret;
	}

	static long[][] matrixMul(long[][] a, long[][] b, int m) {
		int n = a.length;
		long[][] c = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int x = 0; x < n; x++) {
					c[i][j] += a[i][x] * b[x][j];
					c[i][j] %= m;
				}
			}
		}
		return c;
	}
}
