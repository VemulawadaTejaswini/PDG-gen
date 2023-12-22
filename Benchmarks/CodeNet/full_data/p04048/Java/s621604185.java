import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long N = sc.nextLong();
		long X = sc.nextLong();
		System.out.println(solve(N, X));
	}

	static long solve(long n, long x) {
		if (x * 2 == n) {
			return x * 3;
		}
		if (x * 2 > n) {
			return solve(n, n - x);
		}
		if ((n - x) % x == 0) {
			return n + (n - x) / x * 2 * x - x;
		}
		long ans = n + ((n - x) / x - 1) * 2 * x + x;
		long size = (n - x) % x + x;
		return ans + solve(size, x) - (n - x) % x;
	}
}
