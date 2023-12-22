import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n + 1];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[a[i]]++;
		}

		int count = 0;

		for (int h = 0; h < n; h++) {
			count = 0;
			b[a[h]]--;
			for (int i = 0; i < n; i++) {
				if (b[i] <= 0) {
					continue;
				} else {
					if (b[i] < 2) {
						continue;
					} else {
						count += (b[i] * (b[i] - 1)) / 2;
					}

				}
			}
			b[a[h]]++;

			out(count);
		}

	}

	/*
	 * 以下メソッド集
	 */

	static long gcd(long a, long b) {
		return (b == 0) ? a : gcd(b, a % b);
	}

	static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}

	static void out(String info) {
		System.out.println(info);
	}

	static void out(int info) {
		System.out.println(info);
	}

	static void out(double info) {
		System.out.println(info);
	}

	static void out(long info) {
		System.out.println(info);
	}

}
