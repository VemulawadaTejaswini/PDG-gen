import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			UnionFind uf = new UnionFind(n);
			for (int i = 0; i < m; i++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				int z = sc.nextInt();
				uf.unit(x, y);
			}
			Set<Integer> group = new HashSet<>();
			for (int i = 0; i < n; i++) {
				group.add(uf.root(i));
			}
			System.out.println(group.size());
		}
	}
}

class UnionFind {
	int[] par;
	int[] rank;

	UnionFind(int n) {
		par = new int[n];
		rank = new int[n];
		for (int i = 0; i < n; i++) {
			par[i] = i;
			rank[i] = 0;
		}
	}

	int root(int x) {
		if (par[x] == x) {
			return x;
		}
		else {
			par[x] = root(par[x]);
			return par[x];
		}
	}

	boolean same(int x, int y) {
		return root(x) == root(y);
	}

	void unit(int x, int y) {
		x = root(x);
		y = root(y);
		if (x == y) return;

		if (rank[x] < rank[y]) {
			par[x] = y;
		}
		else {
			par[y] = x;
			if (rank[x] == rank[y]) rank[x]++;
		}
	}
}