import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long nu = b - a + 1;
		long nc = (a % c == 0) ? 1 + (b - a) / c : ((c - a % c) + a > b) ? 0 : 1 + (b - a - (c - a % c)) / c;
		long nd = (a % d == 0) ? 1 + (b - a) / d : ((d - a % d) + a > b) ? 0 : 1 + (b - a - (d - a % d)) / d;
		long cd = (c * d) / gcd(c, d);
		long ncd = (a % cd == 0) ? 1 + (b - a) / cd : ((cd - a % cd) + a > b) ? 0 : 1 + (b - a - (cd - a % cd)) / cd;

		System.out.println(nu - nc - nd + ncd);
	}

	private static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
}
