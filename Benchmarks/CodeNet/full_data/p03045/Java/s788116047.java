import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		Union union = new Union(n);
		int x, y, z;
		for (int i = 0; i < m; i++) {
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;
			z = sc.nextInt();
			union.unite(x, y);
		}
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < n; i++) {
			hs.add(union.getparent(i));
		}
		System.out.println(hs.size());
	}
}

class Union {

	private int[] rank;
	private int[] parent;

	public Union(int n) {
		rank = new int[n];
		parent = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
	}

	public int root(int n) {
		if (n == parent[n]) {
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
		} else if (rank[aroot] == rank[broot]) {
			parent[broot] = aroot;
			rank[aroot]++;
		}
	}

	public int getparent(int n) {
		return parent[n];
	}
}