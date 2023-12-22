package main;

import util.FastScanner;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskC {
	public void solve(int testNumber, FastScanner in, PrintWriter out) {
		int n = in.nextInt();
		int m = in.nextInt();
		List<Integer>[] adj = new List[n];
		for (int i = 0; i < n; i++) {
			adj[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			adj[a].add(b);
			adj[b].add(a);
		}
		int[] d = bfs(0, adj);
		out.println(d[n - 1] <= 2 ? "POSSIBLE" : "IMPOSSIBLE");
	}

	private int[] bfs(int s, List<Integer>[] adj) {
		int n = adj.length;
		int[] q = new int[n];
		int[] d = new int[n];
		Arrays.fill(d, n);
		d[s] = 0;
		q[0] = s;
		int qt = 0;
		int qh = 1;
		while (qt < qh) {
			int i = q[qt++];
			for (int j : adj[i]) {
				if (d[j] > 1 + d[i]) {
					d[j] = 1 + d[i];
					q[qh++] = j;
				}
			}
		}
		return d;
	}

}
