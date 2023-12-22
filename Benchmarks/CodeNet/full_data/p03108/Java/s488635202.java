import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = in.nextInt() - 1;
			b[i] = in.nextInt() - 1;
		}
		solve(n, m, a, b);
		in.close();
	}

	private static void solve(int n, int m, int[] a, int[] b) {
		long[] ans = new long[m];
		ans[m - 1] = n * (n - 1) / 2;

		int[] grp = new int[n];
		int[] mem = new int[n];
		for (int i = 0; i < n; i++) {
			grp[i] = i + 1;
			mem[i] = 1;
		}

		for (int i = m - 1; i > 0; i--) {
			if (grp[a[i]] == grp[b[i]]) {
				ans[i - 1] = ans[i];
				continue;
			}
			long t = mem[a[i]] * mem[b[i]];
			ans[i - 1] = ans[i] - t;

			int tmem = mem[a[i]] + mem[b[i]];
			int tgrp = grp[b[i]];
			for (int j = 0; j < n; j++) {
				if (grp[j] == tgrp)
					grp[j] = grp[a[i]];
				if (grp[j] == grp[a[i]])
					mem[j] = tmem;
			}
		}
		for (int i = 0; i < m; i++)
			System.out.println(ans[i]);
	}
}