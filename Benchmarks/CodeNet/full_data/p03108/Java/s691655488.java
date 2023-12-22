import java.util.*;
import java.lang.*;

public class Main {
	static int n;
	static int m;
	static int[] a;
	static int[] b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[m];
		b = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		UnionFind tree = new UnionFind(n);
		long[] ans = new long[m];
		ans[m - 1] = (long) n * (n - 1) / 2;
		for (int i = m - 1; i > 0; i--) {
			if (!tree.same(a[i] - 1, b[i] - 1)) {
				ans[i - 1] = ans[i] - (long) tree.size(a[i] - 1) * tree.size(b[i] - 1);
			} else {
				ans[i - 1] = ans[i];
			}
			tree.unite(a[i] - 1, b[i] - 1);
		}
		for (int i = 0; i < m; i++) {
			System.out.println(ans[i]);
		}
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