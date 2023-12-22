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
		int m = sc.nextInt();
		int[][] dd = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				dd[i][j] = INF;
			dd[i][i] = 0;
		}
		int[] ii = new int[m];
		int[] jj = new int[m];
		int[] ww = new int[m];
		for (int h = 0; h < m; h++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			int w = sc.nextInt();
			ii[h] = i;
			jj[h] = j;
			ww[h] = w;
			dd[i][j] = dd[j][i] = w;
		}
		for (int k = 0; k < n; k++)
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					dd[i][j] = Math.min(dd[i][j], dd[i][k] + dd[k][j]);
		int ans = 0;
		for (int h = 0; h < m; h++)
			if (dd[ii[h]][jj[h]] < ww[h])
				ans++;
		println(ans);
	}
}
