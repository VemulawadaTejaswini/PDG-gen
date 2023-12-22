import java.util.*;
import java.io.*;

public class Main {
	final static int MOD = 1000000007;
	final static int intMax = 1000000000;
	final static int intMin = -1000000000;
	final static int[] dx = { 0, 0, -1, 1 };
	final static int[] dy = { -1, 1, 0, 0 };

	static int add(int a, int b) {
		return (a + b) % MOD;
	}
	
	static int sub(int a, int b) {
		return (a - b + MOD) % MOD;
	}
	
	static int mult(int a, int b) {
		return (int)((((long)(a)) * b) % MOD);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader br = new BufferedReader(new FileReader(".in"));
		PrintWriter out = new PrintWriter(new File(".out"));
		String s = br.readLine();
		String t = br.readLine();
		int N = s.length();
		int M = t.length();
		String[][] dp = new String[N + 1][M + 1];
		for(int i = 0; i <= N; ++i) {
			for(int j = 0; j <= M; ++j) {
				dp[i][j] = "";
			}
		}
		for(int i = 1; i <= N; ++i) {
			for(int j = 1; j <= M; ++j) {
				int mxlen = dp[i - 1][j].length();
				String mxstr = dp[i - 1][j];
				if(dp[i][j - 1].length() > mxlen) {
					mxlen = dp[i][j - 1].length();
					mxstr = dp[i][j - 1];
				}
				if(dp[i - 1][j - 1].length() > mxlen) {
					mxlen = dp[i - 1][j - 1].length();
					mxstr = dp[i - 1][j - 1];
				}
				if(s.charAt(i - 1) == t.charAt(j - 1)) {
					if(dp[i - 1][j - 1].length() + 1> mxlen) {
						mxlen = dp[i - 1][j - 1].length() + 1;
						mxstr = dp[i - 1][j - 1] + s.charAt(i - 1);
					}
				}
				dp[i][j] = mxstr;
			}
		}
		System.out.println(dp[N][M]);
		br.close();
		out.close();
	}
}