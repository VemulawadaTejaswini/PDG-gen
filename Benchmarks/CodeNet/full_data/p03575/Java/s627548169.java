import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		int a[] = new int[m];
		int b[] = new int[m];

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			a[i] = Integer.parseInt(str[0]) - 1;
			b[i] = Integer.parseInt(str[1]) - 1;
		}

		int ans = 0;
		for (int i = 0; i < m; i++) {
			UnionFindTree uf = new UnionFindTree(n);

			for (int j = 0; j < m; j++) {
				if (j != i)
					uf.union(a[j], b[j]);
			}

			int count = 0;
			for (int j = 0; j < n; j++) {
				if (uf.find(j) == j) {
					count++;
				}
			}
			if (1 < count) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}

class UnionFindTree {

	int[] parent;
	int[] rank;

	public UnionFindTree(int size) {
		this.parent = new int[size];
		this.rank = new int[size];

		for (int i = 0; i < size; i++) {
			makeSet(i);
		}
	}

	public void makeSet(int i) {
		parent[i] = i;
		rank[i] = 0; // 集合の高さ
	}

	public void union(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);

		// xが属する木の方が大きい場合
		if (rank[xRoot] > rank[yRoot]) {
			parent[yRoot] = xRoot; // yの親をxに更新

		} else if (rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;

		} else if (xRoot != yRoot) {
			parent[yRoot] = xRoot;
			rank[xRoot]++; // 同じ高さの木がルートの子として着くから大きさ++;
		}
	}

	// 引数の属する木のルートのidを返す
	public int find(int i) {
		if (i != parent[i]) {
			parent[i] = find(parent[i]);
		}
		return parent[i];
	}

	// 同じ木に属しているか
	public boolean same(int x, int y) {
		return find(x) == find(y);
	}
}