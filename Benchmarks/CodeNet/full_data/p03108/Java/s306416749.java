import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static class UnionFind {
		private int n;
		private int[] parent;
		private int[] rank;

		public UnionFind(int n) {
			this.n = n;
			rank = new int[n];
			Arrays.fill(rank, 1);
			this.parent = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
			}
		}

		public boolean connected(int a, int b) {
			return root(a) == root(b);
		}

		public void union(int a, int b) {
			if (connected(a, b)) return;
			int rootA = root(a);
			int rootB = root(b);

			if (rank[rootA] > rank[rootB]) {
				parent[rootB] = parent[rootA];
				rank[rootA] = rank[rootB] = rank[rootA] + rank[rootB];
			} else {
				parent[rootA] = parent[rootB];
				rank[rootA] = rank[rootB] = rank[rootA] + rank[rootB];
			}
		}

		public int rank(int a) {
			return rank[root(a)];
		}

		private int root(int a) {
			while (parent[a] != parent[parent[a]]) parent[a] = parent[parent[a]];
			return parent[a];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ab = new int[m][2];
		for (int i = 0; i < m; i++) {
			ab[i][0] = sc.nextInt() - 1;
			ab[i][1] = sc.nextInt() - 1;
		}

		long[] answer = new long[m];
		answer[m - 1] = (long) n * (n - 1) / 2L;

		UnionFind uf = new UnionFind(n);
		for (int i = m - 2; i >= 0; i--) {
			if (uf.connected(ab[i + 1][0], ab[i + 1][1])) {
				answer[i] = answer[i + 1];
			} else {
				answer[i] = answer[i + 1] - (long) uf.rank(ab[i + 1][0]) * uf.rank(ab[i + 1][1]);
			}
			uf.union(ab[i + 1][0], ab[i + 1][1]);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			sb.append(answer[i]).append("\n");
		}

		System.out.print(sb.toString());
	}
}
