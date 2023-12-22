import java.util.Scanner;

public class Main {

	int n, m;
	int[] p, parent, rank;

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			m = sc.nextInt();
			p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt() - 1;
			}

			init(n);
			for (int i = 0; i < m; i++) {
				unite(sc.nextInt() - 1, sc.nextInt() - 1);
			}
			System.out.println(fnc());
		}
	}

	String fnc() {
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			if (find(p[i]) == find(i)) {
				cnt++;
			}
		}

		return "" + cnt;
	}

	void init(int n) {
		parent = new int[n];
		rank = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0;
		}
	}

	void unite(int x, int y) {
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

	int find(int x) {
		if (parent[x] == x) {
			return x;
		}

		return parent[x] = find(parent[x]);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
