import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		UnionFind uf = new UnionFind(N);
		Set<Integer>[] direct = new HashSet[N];
		for (int i = 0; i < N; i++) {
			direct[i] = new HashSet<>();
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			uf.union(a, b);
			direct[a].add(b);
			direct[b].add(a);
		}

		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = uf.scale(i) - 1 - direct[i].size();
		}


		Set<Integer>[] checked = new HashSet[N];
		for (int i = 0; i < N; i++) {
			checked[i] = new HashSet<>();
		}

		for (int i = 0; i < K; i++) {
			int c = sc.nextInt() - 1;
			int d = sc.nextInt() - 1;
			if (c == d) continue;
			if (checked[c].contains(d)) continue;
			if (checked[d].contains(c)) continue;
			if (direct[c].contains(d)) continue;
			if (uf.connected(c, d)) {
				a[c]--;
				a[d]--;
			}
			checked[c].add(d);
			checked[d].add(c);
		}


		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(a[i]).append(" ");
		}
		System.out.println(sb.toString());
	}

	private static class UnionFind {

		private int n;
		private int[] a;
		private int[] scale;

		public UnionFind(int n) {
			this.n = n;
			a = new int[n];
			scale = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = i;
				scale[i] = 1;
			}
		}

		public void union(int v, int w) {
			int rv = root(v);
			int rw = root(w);
			if (rv != rw) {
				a[rv] = a[rw];
				scale[rw] += scale[rv];
			}
		}

		private int root(int v) {
			while (a[v] != a[a[v]]) a[v] = a[a[v]];
			return a[v];
		}

		public int scale(int v) {
			return scale[root(v)];
		}

		public boolean connected(int v, int w) {
			return root(v) == root(w);
		}
	}


}

