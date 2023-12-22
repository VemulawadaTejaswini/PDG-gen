import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static List<List<Hen>> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		UnionFind uf = new UnionFind(n);
		Hen[] arr = new Hen[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.a = Integer.parseInt(sa[0]) - 1;
			h.b = Integer.parseInt(sa[1]) - 1;
			list.get(h.a).add(h);
			list.get(h.b).add(h);
			if (!uf.same(h.a, h.b)) {
				h.need = true;
				uf.union(h.a, h.b);
			}
			arr[i] = h;
		}
		br.close();

		if (m % 2 == 1) {
			System.out.println(-1);
			return;
		}

		dfs(0, -1);

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < m; i++) {
			pw.println(++arr[i].c + " " + ++arr[i].d);
		}
		pw.flush();
	}

	static void dfs(int x, int p) {
		for (Hen h : list.get(x)) {
			int ch = h.a;
			if (ch == x) {
				ch = h.b;
			}
			if (h.need && ch != p) {
				dfs(ch, x);
			}
		}

		int cnt = 0;
		List<Hen> work = new ArrayList<>();
		for (Hen h : list.get(x)) {
			if (h.d == -1) {
				work.add(h);
			} else {
				if (h.c == x) {
					cnt++;
				}
			}
		}

		for (Hen h : work) {
			int ch = h.a;
			if (ch == x) {
				ch = h.b;
			}
			h.c = x;
			h.d = ch;
		}
		if (cnt % 2 != work.size() % 2) {
			Hen h = work.get(0);
			int tmp = h.c;
			h.c = h.d;
			h.d = tmp;
		}
	}

	static class Hen {
		int a, b, c, d = -1;
		boolean need;
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

		boolean same(int x, int y) {
			return find(x) == find(y);
		}
	}
}
