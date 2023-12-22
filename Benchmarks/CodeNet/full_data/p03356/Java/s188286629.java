import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p[] = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt() - 1;
		}
		Union union = new Union(n);
		int x, y;
		for (int i = 0; i < m; i++) {
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;
			union.unite(x, y);
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (union.same(i, p[i])) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

class Union {
	private int[] parent;
	private int[] rank;

	public Union(int n) {
		parent = new int[n];
		rank = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0;
		}
	}

	public boolean same(int a, int b) {
		if (root(a) == root(b)) {
			return true;
		} else {
			return false;
		}
	}

	public int root(int n) {
		if (parent[n] == n) {
			return n;
		}
		return parent[n] = root(parent[n]);
	}

	public void unite(int a, int b) {
		int aroot = root(a);
		int broot = root(b);
		if (aroot == broot) {
			return;
		}
		if (rank[aroot] > rank[broot]) {
			parent[broot] = aroot;
		} else if (rank[aroot] < rank[broot]) {
			parent[aroot] = broot;
		} else {
			parent[broot] = aroot;
			rank[aroot]++;
		}

	}

}