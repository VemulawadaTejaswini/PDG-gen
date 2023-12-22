import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		sc.close();

		// Cで割り切れる数
		long divideC = (B / C) - ((A - 1) / C);
		// Dで割り切れる数
		long divideD = (B / D) - ((A - 1) / D);
		// CとDの最小公倍数で割り切れる数
		long lcm = calcLcm(C, D);
		long divideLcm = (B / lcm) - ((A - 1) / lcm);
		System.out.println((B - (A - 1)) - (divideC + divideD - divideLcm));
	}

	// 最大公約数を求める。
	public static long calcGcd(long m, long n) {
		if (m < n) {
			long tmp = m;
			m = n;
			n = tmp;
		}
		long remainder = 0;
		while ((remainder = m % n) != 0) {
			m = n;
			n = remainder;
		}
		return n;
	}

	// 最小公倍数を求める。
	public static long calcLcm(long m, long n) {
		return m * n / calcGcd(m, n);
	}
}
