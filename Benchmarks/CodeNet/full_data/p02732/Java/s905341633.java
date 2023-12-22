import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int n = sc.nextInt();
		int[] a = new int[n];
		int[][] b = new int[n + 1][2];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[a[i]][0]++;
		}

		int count = 0;

		for (int h = 0; h < n; h++) {
			if (b[a[h]][1] != 0) {
				out(b[a[h]][1]);
				continue;
			}
			count = 0;
			b[a[h]][0]--;
			for (int i = 0; i < n; i++) {
				if (b[i][0] <= 0) {
					continue;
				} else {
					if (b[i][0] < 2) {
						continue;
					} else {
						count += (b[i][0] * (b[i][0] - 1)) / 2;
					}

				}
			}
			b[a[h]][0]++;
			b[a[h]][1] = count;

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
