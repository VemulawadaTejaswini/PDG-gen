import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no2();
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			long[] x = new long[N];
			long[] y = new long[N];
			String[] C = new String[N];

			for (int i = 0; i < N; i++) {
				x[i] = sc.nextLong();
				y[i] = sc.nextLong();
				C[i] = sc.next();
			}

			int count1;
			int count2;
			int max1 = 0;
			int max2 = 0;

			for (int i = 0; i < K; i++) {
				for (int j = 0; j < K; j++) {
					count1 = 0;
					count2 = 0;
					for (int t = 0; t < N; t++) {
						if (color(K, i, j, x[t], y[t]).equals(C[t])) {
							count1++;
						} else {
							count2++;
						}
					}
					max1 = Math.max(max1, count1);
					max2 = Math.max(max2, count2);
				}
			}

			System.out.println(Math.max(max1, max2));

		}
	}

	private static Object color(int K, int i, int j, long l, long m) {
		long tx = (l + i) / K;
		long ty = (m + j) / K;

		long XX = ((tx % 2) + (ty % 2));
		if (XX == 1) {
			return "W";
		} else {
			return "B";
		}
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int[] t = new int[n];
			int[] a = new int[n];
			int[] b = new int[n];

			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}

			int tt = 0;
			int aa = 0;
			int bb = 0;

			int dt;
			int dd;

			for (int i = 0; i < n; i++) {
				dt = t[i] - tt;
				dd = Math.abs(a[i] - aa) + Math.abs(b[i] - bb);

				if (dd > dt) {
					System.out.println("No");
					return;
				}

				if ((dd - dt) % 2 != 0) {
					System.out.println("No");
					return;
				}

				tt = t[i];
				aa = a[i];
				bb = b[i];
			}

			System.out.println("Yes");

		}
	}

}
