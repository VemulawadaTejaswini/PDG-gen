import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] xs = new int[n][2];
		int[][] ys = new int[n][2];
		for (int i = 0; i < n; i++) {
			xs[i][0] = sc.nextInt();
			xs[i][1] = i;
			ys[i][0] = sc.nextInt();
			ys[i][1] = i;
		}

		Arrays.sort(xs, (a, b) -> Integer.compare(a[0], b[0]));
		Arrays.sort(ys, (a, b) -> Integer.compare(a[0], b[0]));
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
		for (int i = 0; i < n - 1; i++) {
			pq.offer(new int[]{Math.abs(xs[i][0] - xs[i + 1][0]), xs[i][1], xs[i + 1][1]});
			pq.offer(new int[]{Math.abs(ys[i][0] - ys[i + 1][0]), ys[i][1], ys[i + 1][1]});
		}

		UnionFind uf = new UnionFind(n);

		long answer = 0;
		while (!pq.isEmpty()) {
			int[] d = pq.poll();
			if (uf.connected(d[1], d[2])) continue;
			uf.union(d[1], d[2]);
			answer += d[0];
		}

		System.out.println(answer);
	}

	private static class UnionFind {

		private int[] parent;

		public UnionFind(int n) {
			this.parent = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
			}
		}

		private int root(int v) {
			while (parent[v] != parent[parent[v]]) {
				parent[v] = parent[parent[v]];
			}
			return parent[v];
		}

		public boolean connected(int v, int u) {
			return root(v) == root(u);
		}

		public void union(int v, int u) {
			parent[root(v)] = parent[root(u)];
		}
	}
}
