import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[(int) (M)];
		int[] B = new int[(int) (M)];
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
		}


		long answer = (long) N * (N - 1) / 2L;
		UnionFind uf = new UnionFind(N);
		long[] a = new long[M + 1];
		a[M] = answer;
		for (int i = M - 1; i >= 0; i--) {
			if (!uf.connected(A[i], B[i])) {
				answer -= (long) uf.count(A[i]) * uf.count(B[i]);
				uf.union(A[i], B[i]);
			}

			a[i] = answer;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= M; i++) {
			sb.append(a[i]).append("\n");
		}

		System.out.print(sb);
	}

	private static class UnionFind {

		private int[] parent;
		private int[] count;

		public UnionFind(int n) {
			parent = new int[n];
			count = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
				count[i] = 1;
			}
		}

		public boolean union(int v, int w) {
			int a = root(v);
			int b = root(w);
			if (a == b) return false;

			if (count[a] >= count[b]) {
				parent[b] = a;
			} else {
				parent[a] = b;
			}
			count[a] = count[b] = count[a] + count[b];

			return true;
		}

		public boolean connected(int v, int w) {
			return root(v) == root(w);
		}

		public int count(int v) {
			return count[root(v)];
		}

		private int root(int v) {
			while (parent[v] != parent[parent[v]]) parent[v] = parent[parent[v]];
			return parent[v];
		}
	}

}
