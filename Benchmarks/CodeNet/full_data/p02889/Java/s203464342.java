// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[][] kk = new int[n][n];
		int[][] rr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				kk[i][j] = n;
			kk[i][i] = 1;
			rr[i][i] = l;
		}
		while (m-- > 0) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			int c = sc.nextInt();
			if (l >= c) {
				kk[i][j] = kk[j][i] = 1;
				rr[i][j] = rr[j][i] = l - c;
			}
		}
		for (int h = 0; h < n; h++)
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					int k, r;
					if (kk[h][j] == 1 && rr[i][h] >= l - rr[h][j]) {
						k = kk[i][h];
						r = rr[i][h] - (l - rr[h][j]);
					} else {
						k = kk[i][h] + kk[h][j];
						r = rr[h][j];
					}
					if (kk[i][j] > k || kk[i][j] == k && rr[i][j] < r) {
						kk[i][j] = k;
						rr[i][j] = r;
					}
				}
		int q = sc.nextInt();
		while (q-- > 0) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			int k = kk[i][j];
			if (k == n)
				k = 0;
			println(k - 1);
		}
	}
}
