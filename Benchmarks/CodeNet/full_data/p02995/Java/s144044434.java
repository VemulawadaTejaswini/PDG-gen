import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = lcm(c, d);

		long all = b - a + 1;
		long first = b / c - (a % c == 0 ? a / c : a / c + 1) + 1;
		long second = b / d - (a % d == 0 ? a / d : a / d + 1) + 1;
		long third = b / e - (a % e == 0 ? a / e : a / e + 1) + 1;

		System.out.println(all - first - second + third);

		sc.close();

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
