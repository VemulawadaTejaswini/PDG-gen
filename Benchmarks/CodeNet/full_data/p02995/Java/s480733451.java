
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();

			long resultC = b / c - a / c;
			if (a % c == 0) {
				resultC++;
			}
			long resultD = b / d - a / d;
			if (a % d == 0) {
				resultD++;
			}
			long lcm = lcm(c, d);
			long resultMix = b / lcm - a / lcm;
			if (a % lcm == 0) {
				resultMix++;
			}



			System.out.println(b - a + 1 - resultC - resultD + resultMix);
		}
	}

	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
