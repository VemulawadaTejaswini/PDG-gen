// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int INF = 0x3f3f3f3f;
	void main() {
		int n = sc.nextInt();
		int ma = sc.nextInt();
		int mb = sc.nextInt();
		int n_ = n * 10;
		int[][] dp = new int[n_ + 1][n_ + 1];
		for (int i = 0; i <= n_; i++)
			for (int j = 0; j <= n_; j++)
				dp[i][j] = INF;
		dp[0][0] = 0;
		while (n-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			for (int i = n_ - a; i >= 0; i--)
				for (int j = n_ - b; j >= 0; j--) {
					int x = dp[i][j];
					if (x != INF)
						dp[i + a][j + b] = Math.min(dp[i + a][j + b], x + c);
				}
		}
		int ans = INF;
		for (int i, j, k = 1; (i = k * ma) <= n_ && (j = k * mb) <= n_; k++)
			ans = Math.min(ans, dp[i][j]);
		println(ans == INF ? -1 : ans);
	}
}
