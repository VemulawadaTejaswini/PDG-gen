import java.util.Scanner;

public class Main {

	class UnionFind {
		int[] parent, rank;

		public UnionFind(int n) {
			parent = new int[n];
			rank = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
			}
		}

		public void unite(int x, int y) {
			x = find(x);
			y = find(y);
			if (x == y) {
				return;
			}

			if (rank[x] < rank[y]) {
				parent[x] = y;
			} else {
				parent[y] = x;
				if (rank[x] == rank[y]) {
					rank[x]++;
				}
			}
		}

		public int find(int x) {
			if (parent[x] == x) {
				return x;
			}

			return parent[x] = find(parent[x]);
		}

		public boolean same(int x, int y) {
			return find(x) == find(y);
		}
	}

	int n, m;
	int[] p;
	UnionFind uf;

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			m = sc.nextInt();
			p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt() - 1;
			}

			uf = new UnionFind(n);
			for (int i = 0; i < m; i++) {
				uf.unite(sc.nextInt() - 1, sc.nextInt() - 1);
			}
			System.out.println(fnc());
		}
	}

	String fnc() {
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			if (uf.same(p[i], i)) {
				cnt++;
			}
		}

		return "" + cnt;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
