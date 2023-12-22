
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			long lcm = totalLcm(a);
			long tmp = 0;
			for (int i : a) {
				tmp += lcm / i;
			}
			BigDecimal result = new BigDecimal(lcm);
			result = result.divide(new BigDecimal(tmp), 5, BigDecimal.ROUND_HALF_UP);
			System.out.println(result);
		}
	}

	private static long totalLcm(int[] nums) {
		long result = 1;
		for (int i : nums) {
			result = lcm(result, i);
		}
		return result;
	}

	private static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

	private static long gcd(long m, long n) {
		if (m < n) {
			return gcd(n, m);
		}
		if (n == 0) {
			return m;
		}
		return gcd(n, m % n);
	}
}
