import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
	static int n;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		int x[][] = new int[n][2];
		int y[][] = new int[n][2];

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");

			x[i][0] = Integer.parseInt(str[0]);
			y[i][0] = Integer.parseInt(str[1]);
			x[i][1] = i;
			y[i][1] = i;
		}

		Arrays.sort(x, (a, b) -> Integer.compare(a[0], b[0]));
		Arrays.sort(y, (a, b) -> Integer.compare(a[0], b[0]));

		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
		for (int i = 0; i < n - 1; i++) {
			pq.add(new int[] { Math.abs(x[i][0] - x[i + 1][0]), x[i][1], x[i + 1][1] });
			pq.add(new int[] { Math.abs(y[i][0] - y[i + 1][0]), y[i][1], y[i + 1][1] });
		}

		UnionFind uf = new UnionFind(n);
		long answer = 0;
		while (!pq.isEmpty()) {
			int d[] = pq.poll();
			if (uf.same(d[1], d[2]))
				continue;
			uf.union(d[1], d[2]);
			answer += d[0];
		}
		System.out.println(answer);
	}
}

class UnionFind {
	int[] parent; // インデックスにとノードを対応させ、そのルートノードのインデックスを格納
	int[] rank; // parentと同様に、木の高さを格納

	public UnionFind(int size) {
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