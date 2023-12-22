import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong() - 1;
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		sc.close();
		long cMulti = B / C - A / C;
		long dMulti = B / D - A / D;
		long cd = C * D / gcd(C, D);
		long cdMulti = B / cd - A / cd;
		System.out.println(B - A - (cMulti + dMulti - cdMulti));
	}

	private static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}
}