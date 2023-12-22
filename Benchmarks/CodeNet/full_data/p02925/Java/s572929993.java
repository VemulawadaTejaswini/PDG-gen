// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	int[] oo; int[][] oj;
	void link(int i, int j) {
		int o = oo[i];
		if (o >= 2 && (o & o - 1) == 0)
			oj[i] = Arrays.copyOf(oj[i], o << 1);
		oj[i][oo[i]++] = j;
	}
	byte[] used;
	int[] qu; int cnt;
	int[] dp;
	void init(int n) {
		oo = new int[n]; oj = new int[n][2];
		used = new byte[n];
		qu = new int[n];
		dp = new int[n];
	}
	boolean dfs(int i) {
		if (used[i] != 0)
			return used[i] == 1;
		used[i] = 1;
		for (int o = 0; o < oo[i]; o++) {
			int j = oj[i][o];
			if (dfs(j))
				return true;
		}
		used[i] = 2;
		qu[--cnt] = i;
		return false;
	}
	void main() {
		int n = sc.nextInt();
		int n_ = n * n;
		init(n_);
		for (int i = 0; i < n; i++)
			for (int u = -1, h = 0; h < n - 1; h++) {
				int j = sc.nextInt() - 1;
				int v = i < j ? i * n + j : j * n + i;
				if (h > 0)
					link(u, v);
				u = v;
			}
		cnt = n_;
		for (int u = 0; u < n_; u++)
			if (dfs(u)) {
				println(-1);
				return;
			}
		int ans = 0;
		for (int h = 0; h < n_; h++) {
			int i = qu[h];
			int x = dp[i] + 1;
			ans = Math.max(ans, x);
			for (int o = 0; o < oo[i]; o++) {
				int j = oj[i][o];
				dp[j] = Math.max(dp[j], x);
			}
		}
		println(ans);
	}
}
