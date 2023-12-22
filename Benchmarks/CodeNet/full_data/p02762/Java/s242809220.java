import java.util.*;

public class Main {

	private static int par[];
	private static int rank[];

	public static void Unionfind(int n) {
		par = new int[n + 1];
		rank = new int[n + 1];
		for (int i = 0; i <= n; ++i) {
			par[i] = i;
			rank[i] = 0;
		}
	}

	public static int root(int x) {
		if (par[x] == x)
			return x;
		return par[x] = root(par[x]);
	}

	public static void unite(int x, int y) {
		int rx = root(x);
		int ry = root(y);
		if (rx == ry)
			return;
		if (rank[rx] < rank[ry])
			par[rx] = ry;
		else {
			par[ry] = rx;
			if (rank[rx] == rank[ry])
				rank[rx]++;
		}
	}

	public static boolean isSame(int x, int y) {
		int rx = root(x);
		int ry = root(y);
		return rx == ry;
	}

	public static class Graph {
		List<Integer> friend = new ArrayList<Integer>();
		List<Integer> block = new ArrayList<Integer>();
		List<Integer> rest = new ArrayList<Integer>();
		int simplecount;
		int truthfriend;

		public Graph(int n, int self) {
			for (int i = 0; i < n; ++i) {
				if (i + 1 != self)
					rest.add(i + 1);
			}
			simplecount = n;
			truthfriend = 0;
		}

		public void addfriend(int b) {
			friend.add(b);
			rest.remove(rest.indexOf(b));
			simplecount--;
		}

		public void addblock(int b) {
			block.add(b);
			rest.remove(rest.indexOf(b));
			simplecount--;
		}

		public int simplefriend(int n) {
			simplecount = n - (friend.size() + block.size()) - 1;
			return simplecount;
		}

		public int simplefriend() {
			return simplecount;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		Graph graph[] = new Graph[n + 1];
		Unionfind(n);
		for (int i = 0; i <= n; ++i)
			graph[i] = new Graph(n, i);
		for (int i = 0; i < m; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a].addfriend(b);
			graph[b].addfriend(a);
			unite(a, b);
		}
		for (int i = 0; i < k; ++i) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			graph[c].addblock(d);
			graph[d].addblock(c);
		}
		sc.close();
		for (int i = 1; i <= n; ++i) {
			int num = graph[i].simplefriend(n);
			if (num > 0) {
				for (int friend : graph[i].rest) {
					if (isSame(i, friend)) {
						graph[i].truthfriend++;
						graph[friend].truthfriend++;
						graph[friend].rest.remove(graph[friend].rest.indexOf(i));
					}
				}
				num = graph[i].truthfriend;
			}
			System.out.print(num + " ");
		}
	}
}
