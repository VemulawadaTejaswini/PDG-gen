

import java.util.*;
import java.math.*;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	static final long mod = (int) (1e9 + 7);
	static final int inf = (int) (1e9);
	static final int maxn = (int) (1e5 + 10);

	static long ksm(long a, long b) {
		long ret = 1;
		while (b != 0) {
			if (b % 2 == 1) {
				ret = ret * a % mod;
			}
			b >>= 1;
			a = a * a % mod;
		}
		return ret;
	}

	static int n, q;
	static String s;
	static long[][][][] dp = new long[110][5][5][5];

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (i == 0 && j == 1 && k == 2)
						continue;
					if (i == 1 && j == 0 && k == 2)
						continue;
					if (i == 0 && j == 2 && k == 1)
						continue;
					dp[3][i][j][k] = 1;
				}
			}
		}
		for (int i = 4; i <= n; i++) {
			for(int a=0;a<4;a++) {
				for(int b=0;b<4;b++) {
					for(int c=0;c<4;c++) {
						for(int d=0;d<4;d++) {
							if (a == 0 && b == 1 && c == 2)
								continue;
							if (a == 1 && b == 0 && c == 2)
								continue;
							if (a == 0 && b == 2 && c == 1)
								continue;
							if(d==0&&b==1&&c==2) continue;
							if(d==0&&a==1&&c==2) continue;
							dp[i][a][b][c]=(dp[i][a][b][c]+dp[i-1][d][a][b])%mod;
						}
					}
				}
			}
		}
		long ans=0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					ans=(ans+dp[n][i][j][k])%mod;
				}
			}
		}
		System.out.println(ans);
	}
}