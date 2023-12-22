import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int mod = (int) 1E9 + 7;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();

		// i文字目までを13で割った余りがｊであるものの個数を格納する
		long dp[][] = new long[s.length][13];

		// 初期値
		if ( s[0] == '?' ) {
			for ( int n = 0; n < 10; n++ ) {
				dp[0][n] = 1;
			}
		} else {
			dp[0][s[0] - '0'] = 1;
		}

		// 1文字づつ見る
		for ( int i = 1; i < s.length; i++ ) {
			// 前回の余りrごとに見る
			for ( int r = 0; r < 13; r++ ) {
				
				if ( s[i] == '?' ) {
					for ( int now = 0; now < 10; now++ ) {
						dp[i][(r * 10 + now) % 13] += dp[i - 1][r];
					}

				} else {
					int now = s[i] - '0';
					dp[i][(r * 10 + now) % 13] += dp[i - 1][r];
				}
			}
			// %mod
			for ( int t = 0; t < 13; t++ ) {
				dp[i][t] %= mod;
			}
		}
		System.out.println(dp[s.length - 1][5]);
		br.close();
	}
}