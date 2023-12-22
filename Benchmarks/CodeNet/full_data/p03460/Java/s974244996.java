package tester;

import java.util.Arrays;
import java.util.Scanner;

class Main {
	double[][] p = new double[2][6];

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		for (int i = 0; i < N; ++i) {
			x[i] = sc.nextInt() % (2 * K);
			y[i] = sc.nextInt() % (2 * K);
			if (sc.next().equals("W")) {
				y[i] += K;
				y[i] %= 2 * K;
			}
			if (y[i] >= K) {
				x[i] += K;
				y[i] += K;
				x[i] %= 2 * K;
				y[i] %= K;
			}
		}
		int[][] cnt = new int[2 * K][3 * K];
		for (int i = 0; i < N; ++i) {
			++cnt[y[i]][x[i]];
			--cnt[y[i]][x[i] + K];
			--cnt[y[i] + K][x[i]];
			++cnt[y[i] + K][x[i] + K];
		}
		for (int i = 0; i < cnt.length; ++i) {
			for (int j = 1; j < cnt[i].length; ++j) {
				cnt[i][j] += cnt[i][j - 1];
			}
		}
		for (int i = 1; i < cnt.length; ++i) {
			for (int j = 0; j < cnt[i].length; ++j) {
				cnt[i][j] += cnt[i - 1][j];
			}
		}
		for (int i = 0; i < cnt.length; ++i) {
			for (int j = 0; j < cnt.length; ++j) {
				if (i < K && j < 2 * K)
					continue;
				cnt[pos(j, i, K)[1]][pos(j, i, K)[0]] += cnt[i][j];
			}
		}
		int ans = 0;
		for (int i = 0; i < K; ++i) {
			for (int j = 0; j < 2 * K; ++j) {
				ans = Math.max(ans, cnt[i][j]);
			}
		}
		System.out.println(ans);
	}

	int[] pos(int x, int y, int K) {
		x %= (2 * K);
		y %= (2 * K);
		if (y >= K) {
			x += K;
			y += K;
			x %= 2 * K;
			y %= K;
		}
		return new int[] { x, y };

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}