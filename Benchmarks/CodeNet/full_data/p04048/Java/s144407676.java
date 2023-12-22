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
		return solve(n - x, x) - (n - x * 2) + n + x;
	}
}
