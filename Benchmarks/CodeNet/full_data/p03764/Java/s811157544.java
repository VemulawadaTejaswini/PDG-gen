import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long mod = 1_000_000_007L;
		long x[] = new long[n];
		long y[] = new long[m];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			y[i] = sc.nextInt();
		}
		long X = 0;
		for (int i = 0; i < n - 1; i++) {
			X = add(X, mult(mult(i + 1, n - i - 1, mod), x[i+1] -x[i], mod), mod);
		}
		long ans = 0;
		for (int i = 0; i < m - 1; i++) {
			ans = add(ans, mult(mult(mult(i+1, m-i-1, mod), y[i+1]-y[i], mod), X, mod), mod);
		}
		System.out.println(ans);
	}
	static long add(long x, long y, long mod) {
		return (x + y) % mod;
	}
	static long mult(long x, long y, long mod) {
		return (x * y) % mod;
	}
}
