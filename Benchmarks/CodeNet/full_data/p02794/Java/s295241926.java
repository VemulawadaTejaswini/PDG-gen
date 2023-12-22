import java.io.*;
import java.util.*;
import java.util.spi.LocaleNameProvider;

class Main {

	private static class Edge {
		public int to, id;

		public Edge(int to, int id) {
			this.to = to;
			this.id = id;
		}
	}

	private static List<Edge>[] G;

	private static List<Integer> dfs(int v, int t, int p) {
		if (v == t) return new ArrayList<>();
		for (Edge e : G[v]) {
			if (e.to == p) continue;
			List<Integer> a = dfs(e.to, t, v);
			if (a != null) {
				a.add(e.id);
				return a;
			}
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		G = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			G[i] = new ArrayList<>();
		}

		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			G[a].add(new Edge(b, i));
			G[b].add(new Edge(a, i));
		}

		int M = sc.nextInt();
		long[] s = new long[M];
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			List<Integer> ids = dfs(a, b, -1);
			assert ids != null;
			for (Integer id : ids) {
				s[i] |= 1L << id;
			}
		}

		long answer = 0;
		for (int i = 0; i < 1 << M; i++) {
			long mask = 0;
			for (int j = 0; j < M; j++) {
				if (((i >> j) & 1) == 1) {
					mask |= s[j];
				}

				int white = Long.bitCount(mask);
				long x = 1L << (N - 1 - white);
				if (Long.bitCount(i) % 2 == 0) {
					answer += x;
				} else {
					answer -= x;
				}
			}
		}

		System.out.println(answer);
	}
}
