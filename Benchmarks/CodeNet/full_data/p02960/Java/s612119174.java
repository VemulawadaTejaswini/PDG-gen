import java.util.*;

public class Main {

	static final int r = 1000000000 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int n = s.length();
		long dp[][] = new long[n + 1][13];
		dp[0][0] = 1;
		for(int i = 0; i < n; ++i) {
			char t = s.charAt(i);
			int c = -1;
			if(t != '?')c = t - '0';
			for(int j = 0; j < 10; ++j) {
				if(c != -1 && c != j) continue;
				for(int k = 0; k < 13; ++k) {
					dp[i + 1][(k * 10 + j) % 13] += dp[i][k];
				}
			}
			for(int j = 0; j < 13; ++j)dp[i + 1][j] %= r;
		}
		long ans = dp[n][5];
		System.out.println(ans);
	}
}
