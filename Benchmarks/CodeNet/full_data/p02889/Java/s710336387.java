import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int m = in.nextInt();
		int l = in.nextInt();
		int[][] d = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				d[i][j] = Integer.MAX_VALUE >> 1;
		for (int i = 0; i < m; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			int c = in.nextInt();
			if (c <= l) {
				d[a][b] = c;
				d[b][a] = c;
			}
		}
		int[][] ans = new int[n][n];
		solve(n, d, ans, l);
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			int s = in.nextInt() - 1;
			int t = in.nextInt() - 1;
			if (ans[s][t] == Integer.MAX_VALUE >> 1)
				System.out.println(-1);
			else
				System.out.println(ans[s][t] - 1);
		}
		in.close();
	}

	private static void solve(int n, int[][] d, int[][] ans, int l) {
		for (int k = 0; k < n; k++)
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (d[i][j] <= l)
					ans[i][j] = 1;
				else
					ans[i][j] = Integer.MAX_VALUE >> 1;
		for (int k = 0; k < n; k++)
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					ans[i][j] = Math.min(ans[i][j], ans[i][k] + ans[k][j]);
	}
}