
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no2();
	}

	static void no3() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			long nn = 2 ^ (n - 1);

		}
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int k = sc.nextInt();

			long[] a = new long[k];

			for (int i = 0; i < k; i++) {
				a[i] = sc.nextLong();
			}

			long min = 2;
			long max = 2;

			for (int i = k - 1; i >= 0; i--) {
				if (a[i] > max) {
					System.out.println("-1");
					return;
				}

				if (a[i] < min) {
					long t = min / a[i];
					if (min % a[i] == 0) {
					} else {
						min = a[i] * (t + 1);
					}
				} else {
					min = a[i];
				}

				long t = max / a[i];
				long tt = Math.max((min * 2) - 1, (a[i] * (t + 1)) - 1);
				max = Math.max(max, tt);
			}
			System.out.println(min + " " + max);
		}
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			int d = b - a;
			if (d % 2 == 0) {
				System.out.println("Alice");
			} else {
				System.out.println("Borys");
			}
		}
	}

}
