import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	static class Query implements Comparable<Query> {
		int from, to, cost;

		public Query(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}

		@Override
		public int compareTo(Query o) {
			return Integer.compare(cost, o.cost);
		}

	}

	int[] p;

	int get(int v) {
		return p[v] == v ? v : (p[v] = get(p[v]));
	}

	boolean unite(int a, int b) {
		a = get(a);
		b = get(b);

		if (a != b) {
			if (((a + b) & 1) == 1) {
				p[a] = b;
			} else {
				p[b] = a;
			}
		}

		return a != b;
	}

	void solve() throws IOException {
		int n = nextInt();
		int q = nextInt();

		PriorityQueue<Query> que = new PriorityQueue<>();

		for (int i = 0; i < q; i++) {
			int from = nextInt();
			int to = nextInt();
			int cost = nextInt();
			que.add(new Query(from, to, cost));
			que.add(new Query(to, (from + 1) % n, cost + 1));
		}

		p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = i;
		}

		long ans = 0;

		while (!que.isEmpty()) {
			Query top = que.poll();

			// System.err.println(top.from + " " + top.to + " " + top.cost);

			if (unite(top.from, top.to)) {
				ans += top.cost;

				top.from = (top.from + 1) % n;
				top.to = (top.to + 1) % n;
				top.cost += 2;

				que.add(top);
			}
		}

		out.println(ans);
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}