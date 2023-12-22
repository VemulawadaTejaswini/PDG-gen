import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int N = nextInt();
		String S = next();
		char[] C = S.toCharArray();
		int[][] dp = new int[5005][5005];

		for(int i=N-1;i>=0;i--) {
			for(int j=N-1;j>=0;j--) {
				if(C[i] != C[j]) dp[i][j] = 0;
				else dp[i][j] = dp[i+1][j+1]+1;
			}
		}
		int res = 0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				int now = Math.min(dp[i][j], j-1);
				res = Math.max(res, now);
			}
		}
		out.println(res);
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

}