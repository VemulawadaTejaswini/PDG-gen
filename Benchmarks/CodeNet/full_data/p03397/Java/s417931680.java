package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class EMedianReplace {
	static int MOD = 1000000007;
	public void solve(int testNumber, InputReader in, OutputWriter out) {
		String s = in.nextString();
		int n = s.length();

		int[] suf = new int[n + 1];
		for(int i = n - 1; i >= 0; --i) {
			suf[i] = suf[i + 1];
			if(s.charAt(i) == '?') suf[i]++;
		}

		int[] pw2 = new int[n + 1];

		pw2[0] = 1;
		for(int i = 1; i <= n; ++i) {
			pw2[i] = (pw2[i - 1] * 2) % MOD;
		}

		long ans = 0;
		long[][][][] dp = new long[n + 1][3][3][3];

		dp[0][0][0][0] = 1;
		for(int i = 0; i < n; ++i) {
			/// first take out all the countone = 2 shit
			for(int countZero = 0; countZero < 3; ++countZero) {
				for(int countOne = 0; countOne < 3; ++countOne) {
					ans += dp[i][2][countZero][countOne] * pw2[suf[i]] % MOD;
					ans %= MOD;
					dp[i][2][countZero][countOne] = 0;
				}
			}
			for(int prefix = 0; prefix < 2; ++prefix) {
				for (int countZero = 0; countZero < 3; ++countZero) {
					for (int countOne = 0; countOne + countZero < 3; ++countOne) {
						if (dp[i][prefix][countZero][countOne] == 0) continue;


						if (s.charAt(i) == '1' || s.charAt(i) == '?') {
							int newprefix = prefix;
							int newCountZero = countZero;
							int newCountOne = countOne + 1;
							if (newCountOne + newCountZero == 3) {
								newCountOne--;
								newCountZero--;
							}
							if(newCountOne == 1 && newCountZero == 0) {
								newprefix++;
								newCountOne = 0;
								newCountZero = 0;



							}

							dp[i + 1][newprefix][newCountZero][newCountOne] += dp[i][prefix][countZero][countOne];
							dp[i + 1][newprefix][newCountZero][newCountOne] %= MOD;
						}
						if (s.charAt(i) == '0' || s.charAt(i) == '?') {
							int newCountZero = countZero + 1;
							int newCountOne = countOne;
							if (newCountOne + newCountZero == 3) {
								if (newCountZero == 3) {
									newCountZero = 1;
								} else {
									newCountOne--;
									newCountZero--;
								}
							}
							dp[i + 1][prefix][newCountZero][newCountOne] += dp[i][prefix][countZero][countOne];
							dp[i + 1][prefix][newCountZero][newCountOne] %= MOD;
						}
					}
				}
			}
		}


		ans += dp[n][1][0][0];
		ans %= MOD;

		ans += dp[n][1][1][1];
		ans %= MOD;

		out.println(ans);
	}
}
