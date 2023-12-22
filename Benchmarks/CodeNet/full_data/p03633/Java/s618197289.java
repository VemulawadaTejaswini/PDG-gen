import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] time = new long[N];
		for (int i = 0; i < N; i++) {
			time[i] = sc.nextLong();
		}
		// 最大公約数
		long gcd = time[0];
		// 最小公倍数
		long ans = 1;

		for (long i : time) {
			gcd = calcurateGcd(ans, i);
			ans = (ans * i / gcd);
		}
		System.out.print(ans);
	}

	// 2数の最大公約数
	private static long calcurateGcd(long gcd, long time) {
		long m = gcd;
		long n = time;
		while (!(m == 0 || n == 0)) {
			if (m > n) {
				m = m % n;
			} else {
				n = n % m;
			}
		}
		return Math.max(m, n);
	}

}
