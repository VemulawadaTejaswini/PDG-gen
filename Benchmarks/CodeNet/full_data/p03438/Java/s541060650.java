import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no2();
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long[] a = new long[N];
			long[] b = new long[N];

			long[] d = new long[N];
			long[] dc = new long[N];

			long asum = 0;
			long bsum = 0;

			long plus1 = 0;
			long plus2 = 0;
			long minus = 0;

			for (int i = 0; i < N; i++) {
				a[i] = sc.nextLong();
				asum += a[i];
			}

			for (int i = 0; i < N; i++) {
				b[i] = sc.nextLong();
				bsum += b[i];

				long t = b[i] - a[i];
				if (t <= 0) {
					minus -= t;
				} else {
					if (t % 2 == 0) {
						plus1 += t;
					} else {
						plus1 += t - 1;
						plus2++;
					}
				}
			}

			long t = plus1 - (minus * 2);
			long tt = minus + plus2 + t;

			if (t < 0) {
				System.out.println("No");
				return;
			}

			if (tt > bsum - asum) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			long x = sc.nextLong();
			long y = sc.nextLong();

			if (x % y == 0) {
				System.out.println("-1");
				return;
			}

			long i = 1;
			long t = x;
			while (true) {
				if (t % y != 0) {
					System.out.println(t);
					return;
				}
				if (t > 1000000000000000000L - x) {
					System.out.println("-1");
					return;
				}
				t += x;
			}
		}
	}

}
