package main;

import util.FastScanner;

import java.io.PrintWriter;
import java.util.Arrays;

public class ProblemC {
	public void solve(int testNumber, FastScanner in, PrintWriter out) {
		int n = in.nextInt();
		int[][] col = new int[n][4];
		long[][] hash = new long[n][4];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				col[i][j] = in.nextInt();
			}
			for (int rot = 0; rot < 4; rot++) {
				for (int j = 0; j < 4; j++) {
					hash[i][rot] = 1000 * hash[i][rot] + col[i][(rot + j) % 4];
				}
			}
		}
		long ans = 0;
		long[] dp = new long[1 << 4];
		int[] ways = new int[4];
		for (int front = 0; front < n; front++) {
			int a = col[front][0];
			int b = col[front][1];
			int c = col[front][2];
			int d = col[front][3];
			for (int back = front + 1; back < n; back++) {
				rotLoop:
				for (int rotBack = 0; rotBack < 4; rotBack++) {
					int f = col[back][(rotBack + 0) % 4];
					int e = col[back][(rotBack + 1) % 4];
					int h = col[back][(rotBack + 2) % 4];
					int g = col[back][(rotBack + 3) % 4];
					long h1 = calcHash(a, e, f, b);
					long h2 = calcHash(b, f, g, c);
					long h3 = calcHash(d, c, g, h);
					long h4 = calcHash(e, a, d, h);
					long[] hs = {h1, h2, h3, h4};
					Arrays.fill(dp, 0);
					dp[0] = 1;
					for (int i = front + 1; i < n; i++) {
						if (i == back) {
							continue;
						}
						Arrays.fill(ways, 0);
						for (int bit = 0; bit < 4; bit++) {
							for (int rot = 0; rot < 4; rot++) {
								if (hash[i][rot] == hs[bit]) {
									++ways[bit];
								}
							}
						}
						/*
						for (int mask = 15; mask >= 0; mask--) {
							if (dp[mask] == 0) {
								continue;
							}
							for (int bit = 0; bit < 4; bit++) {
								int nmask = mask | (1 << bit);
								if (nmask != mask) {
									dp[nmask] += dp[mask] * ways[bit];
								}
							}
						}
						*/

						dp[15] += dp[14] * ways[0];
						dp[15] += dp[13] * ways[1];
						dp[15] += dp[11] * ways[2];
						dp[15] += dp[7] * ways[3];
						dp[14] += dp[12] * ways[1];
						dp[14] += dp[10] * ways[2];
						dp[14] += dp[6] * ways[3];
						dp[13] += dp[12] * ways[0];
						dp[13] += dp[9] * ways[2];
						dp[13] += dp[5] * ways[3];
						dp[12] += dp[8] * ways[2];
						dp[12] += dp[4] * ways[3];
						dp[11] += dp[10] * ways[0];
						dp[11] += dp[9] * ways[1];
						dp[11] += dp[3] * ways[3];
						dp[10] += dp[8] * ways[1];
						dp[10] += dp[2] * ways[3];
						dp[9] += dp[8] * ways[0];
						dp[9] += dp[1] * ways[3];
						dp[8] += dp[0] * ways[3];
						dp[7] += dp[6] * ways[0];
						dp[7] += dp[5] * ways[1];
						dp[7] += dp[3] * ways[2];
						dp[6] += dp[4] * ways[1];
						dp[6] += dp[2] * ways[2];
						dp[5] += dp[4] * ways[0];
						dp[5] += dp[1] * ways[2];
						dp[4] += dp[0] * ways[2];
						dp[3] += dp[2] * ways[0];
						dp[3] += dp[1] * ways[1];
						dp[2] += dp[0] * ways[1];
						dp[1] += dp[0] * ways[0];
					}
					ans += dp[15];
				}
			}
		}
		out.println(ans);
	}

	private long calcHash(int a, int b, int c, int d) {
		long h = 0;
		h = 1000 * h + a;
		h = 1000 * h + b;
		h = 1000 * h + c;
		h = 1000 * h + d;
		return h;
	}
}
