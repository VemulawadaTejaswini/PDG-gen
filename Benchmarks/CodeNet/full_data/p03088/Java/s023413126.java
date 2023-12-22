// practice with kaiboy, coached by rainboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int A = 4, MD = 1000000007;
	int n; int[][] tt; boolean[] eof;
	void build(byte[][] cc, int m) {
		int[] ii = new int[26];
		ii['A' - 'A'] = 0;
		ii['C' - 'A'] = 1;
		ii['G' - 'A'] = 2;
		ii['T' - 'A'] = 3;
		n = 2;
		for (int h = 0; h < m; h++)
			n += cc[h].length;
		tt = new int[n][A];
		eof = new boolean[n];
		n = 2;
		for (int h = 0; h < m; h++) {
			int l = cc[h].length;
			int i = 1;
			for (int k = 0; k < l; k++) {
				int a = ii[cc[h][k] - 'A'];
				if (tt[i][a] == 0)
					tt[i][a] = n++;
				i = tt[i][a];
			}
			eof[i] = true;
		}
		Arrays.fill(tt[0], 1);
		int[] ff = new int[n];
		int[] qu = new int[n]; int head = 0, cnt = 0;
		ff[1] = 0; qu[head + cnt++] = 1;
		while (cnt > 0) {
			int i = qu[head++]; cnt--;
			int e = ff[i];
			for (int a = 0; a < A; a++) {
				int j = tt[i][a];
				int f = tt[e][a];
				if (j == 0)
					tt[i][a] = f;
				else {
					ff[j] = f; qu[head + cnt++] = j;
				}
			}
		}
	}
	void main() {
		int l = sc.nextInt();
		byte[][] cc = new byte[6][];
		cc[0] = "AGC".getBytes();
		cc[1] = "ACG".getBytes();
		cc[2] = "GAC".getBytes();
		cc[3] = "AGGC".getBytes();
		cc[4] = "AGTC".getBytes();
		cc[5] = "ATGC".getBytes();
		build(cc, 6);
		int[] dp = new int[n]; dp[1] = 1;
		int[] dq = new int[n];
		while (l-- > 0) {
			Arrays.fill(dq, 0);
			for (int i = 1; i < n; i++) {
				int x = dp[i];
				if (x == 0 || eof[i])
					continue;
				for (int a = 0; a < A; a++) {
					int j = tt[i][a];
					dq[j] = (dq[j] + x) % MD;
				}
			}
			int[] tmp = dp; dp = dq; dq = tmp;
		}
		int ans = 0;
		for (int i = 1; i < n; i++)
			if (!eof[i])
				ans = (ans + dp[i]) % MD;
		println(ans);
	}
}
