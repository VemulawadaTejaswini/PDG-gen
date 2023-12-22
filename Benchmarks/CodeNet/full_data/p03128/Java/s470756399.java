// practice with kaiboy, coached by rainboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] dd = new int[8];
		int[] d2c = { 0, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		while (m-- > 0) {
			int d = sc.nextInt();
			int c = d2c[d];
			dd[c] = Math.max(dd[c], d);
		}
		int[] dp = new int[n + 1]; Arrays.fill(dp, -1); dp[0] = 0;
		for (int i = 0; i < n; i++) {
			int k = dp[i];
			if (k != -1)
				for (int c = 2; c <= 7 && i + c <= n; c++)
					if (dd[c] != 0)
						dp[i + c] = Math.max(dp[i + c], k + 1);
		}
		for (int i = n; i > 0; ) {
			int d_ = 0, c_ = 0;
			for (int c = 2; c <= 7 && i - c >= 0; c++) {
				int d = dd[c];
				if (d_ < d && dp[i] == dp[i - c] + 1) {
					d_ = d; c_ = c;
				}
			}
			print(d_);
			i -= c_;
		}
		println();
	}
}
