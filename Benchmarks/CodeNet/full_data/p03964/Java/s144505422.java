

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}

		long[] dpt = new long[n];
		long[] dpa = new long[n];

		dpt[0] = t[0];
		dpa[0] = a[0];

		long c = 0;
		long ca = 0;

		for (int i = 1; i < n; i++) {
			if (t[i] >= dpt[i - 1]) {
				if (a[i] >= dpa[i - 1]) {
					dpt[i] = t[i];
					dpa[i] = a[i];
				} else {
					if (dpa[i - 1] % a[i] == 0)
						c = dpa[i - 1] / a[i];
					else
						c = dpa[i - 1] / a[i] + 1;

					dpt[i] = c * t[i];
					dpa[i] = c * a[i];
				}
			} else {
				if (a[i] >= dpa[i - 1]) {
					if (dpt[i - 1] % t[i] == 0)
						c = dpt[i - 1] / t[i];
					else
						c = dpt[i - 1] / t[i] + 1;

					dpt[i] = c * t[i];
					dpa[i] = c * a[i];
				} else {
					if (dpa[i - 1] % a[i] == 0)
						ca = dpa[i - 1] / a[i];
					else
						ca = dpa[i - 1] / a[i] + 1;

					if (dpt[i - 1] % t[i] == 0)
						c = dpt[i - 1] / t[i];
					else
						c = dpt[i - 1] / t[i] + 1;

					dpt[i] = Math.max(ca, c) * t[i];
					dpa[i] = Math.max(ca, c) * a[i];
				}
			}

		}

		System.out.println(dpt[n - 1] + dpa[n - 1]);

	}

}
