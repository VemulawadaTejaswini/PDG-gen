import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[m];
		int[] y = new int[m];
		int[] z = new int[m];
		for (int i = 0; i < m; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			z[i] = sc.nextInt();
		}
		UnionFind uf = new UnionFind(n);
		for (int i = 0; i < m; i++) {
			uf.unite(x[i] - 1, y[i] - 1);
		}
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			set.add(uf.find(i));
		}
		System.out.println(set.size());
	}
}
class UnionFind {
	int[] par;
	int[] rank;
	int[] size;

	UnionFind(int n) {
		par = new int[n];
		rank = new int[n];
		size = new int[n];
		for (int i = 0; i < n; i++) {
			par[i] = i;
			rank[i] = 0;
			size[i] = 1;
		}
	}

	int find(int x) {
		if (par[x] == x) {
			return x;
		}
		return par[x] = find(par[x]);
	}

	void unite(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y) {
			return;
		}
		if (rank[x] < rank[y]) {
			par[x] = y;
			size[y] += size[x];
		} else {
			par[y] = x;
			size[x] += size[y];
			if (rank[x] == rank[y]) {
				rank[x]++;
			}
		}
	}

	boolean same(int x, int y) {
		return find(x) == find(y);
	}

	int size(int x) {
		return size[find(x)];
	}
}