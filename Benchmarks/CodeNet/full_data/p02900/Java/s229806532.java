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
		for (long i = 2; i <= gcd; i++) {
			boolean watta = false;
			if (i != 2 && i % 2 == 0) {
				continue;
			}
			//			for (int j = 2; j < i; j++) {
			//				if (i % j == 0) {
			//					isSosu = false;
			//					break;
			//				}
			//			}

			//			if (isSosu) {
			while (gcd % i == 0) {
				//					System.out.println(i + " " + gcd);
				gcd /= i;
				watta = true;
			}
			if (watta) {
				cnt++;
			}
			//			}
			//			isSosu = false;
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