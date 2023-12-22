import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		int[] a = new int[m];
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]) - 1;
		}
		int[] c = new int[k];
		int[] d = new int[k];
		for (int i = 0; i < k; i++) {
			sa = br.readLine().split(" ");
			c[i] = Integer.parseInt(sa[0]) - 1;
			d[i] = Integer.parseInt(sa[1]) - 1;
		}
		br.close();

		UnionFind uf = new UnionFind(n);
		for (int i = 0; i < m; i++) {
			uf.union(a[i], b[i]);
		}

		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			ans[i] = uf.size(i) - 1;
		}
		for (int i = 0; i < m; i++) {
			ans[a[i]]--;
			ans[b[i]]--;
		}
		for (int i = 0; i < k; i++) {
			if (uf.same(c[i], d[i])) {
				ans[c[i]]--;
				ans[d[i]]--;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(ans[i]).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}

	static class UnionFind {
		int[] parent, size;

		UnionFind(int n) {
			parent = new int[n];
			size = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
				size[i] = 1;
			}
		}

		void union(int x, int y) {
			int px = find(x);
			int py = find(y);
			if (px != py) {
				parent[px] = py;
				size[py] += size[px];
			}
		}

		int find(int x) {
			if (parent[x] == x) {
				return x;
			}
			parent[x] = find(parent[x]);
			return parent[x];
		}

		/**
		 * xとyが同一連結成分か
		 */
		boolean same(int x, int y) {
			return find(x) == find(y);
		}

		/**
		 * xを含む連結成分のサイズ
		 */
		int size(int x) {
			return size[find(x)];
		}
	}
}
