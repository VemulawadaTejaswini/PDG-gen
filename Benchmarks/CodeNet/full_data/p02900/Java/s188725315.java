import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		//		int[] x = new int[n];
		//
		//		for (int i = 0; i < n; i++) {
		//			x[i] = Integer.parseInt(sc.next());
		//		}

		long gcd = gcd(a, b);
		//		long foo = gcd;
		int cnt = 1;

		boolean watta2 = false;
		while (gcd % 2 == 0) {
			gcd /= 2;
			watta2 = true;
		}
		if (watta2) {
			cnt++;
		}

		for (long i = 3; i <= gcd; i += 2) {
			boolean watta = false;
			while (gcd % i == 0) {
				gcd /= i;
				watta = true;
			}
			if (watta) {
				cnt++;
			}
		}

		System.out.println(cnt);
		sc.close();
	}

	public static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}
}