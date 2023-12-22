import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	static int n, m, l;
	static List<List<Hen>> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		m = Integer.parseInt(sa[1]);
		l = Integer.parseInt(sa[2]);
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			int c = Integer.parseInt(sa[2]);
			if (c <= l) {
				list.get(a).add(new Hen(b, c));
				list.get(b).add(new Hen(a, c));
			}
		}
		int q = Integer.parseInt(br.readLine());
		int[] s = new int[q];
		int[] t = new int[q];
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			s[i] = Integer.parseInt(sa[0]) - 1;
			t[i] = Integer.parseInt(sa[1]) - 1;
		}
		br.close();

		long[][][] d = new long[n][2][n];
		for (int i = 0; i < n; i++) {
			d[i] = dijkstra(i);
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			if (d[s[i]][0][t[i]] == Long.MAX_VALUE) {
				pw.println(-1);
			} else {
				pw.println(d[s[i]][0][t[i]]);
			}
		}
		pw.flush();
	}

	static long[][] dijkstra(int s) {
		long[][] d = new long[2][list.size()];
		Arrays.fill(d[0], Long.MAX_VALUE);
		Arrays.fill(d[1], Long.MAX_VALUE);
		d[0][s] = 0;
		d[1][s] = 0;
		PriorityQueue<Node> que = new PriorityQueue<Node>();
		Node first = new Node(s, 0, 0);
		que.add(first);
		boolean[] fix = new boolean[n];
		while (!que.isEmpty()) {
			Node cur = que.poll();
			if (!fix[cur.v]) {
				fix[cur.v] = true;
				for (Hen hen : list.get(cur.v)) {
					long alt0 = d[0][cur.v];
					long alt1 = d[1][cur.v] + hen.c;
					if (alt1 > l) {
						alt0++;
						alt1 = hen.c;
					}
					if (alt0 < d[0][hen.v] ||
							alt0 == d[0][hen.v] && alt1 < d[1][hen.v]) {
						d[0][hen.v] = alt0;
						d[1][hen.v] = alt1;
						Node next = new Node(hen.v, alt0, alt1);
						que.add(next);
					}
				}
			}
		}
		return d;
	}

	static class Hen {
		int v, c;

		public Hen(int v, int c) {
			this.v = v;
			this.c = c;
		}
	}

	static class Node implements Comparable<Node> {
		int v;
		long h;
		long d;

		public Node(int v, long h, long d) {
			this.v = v;
			this.h = h;
			this.d = d;
		}

		public int compareTo(Node o) {
			if (h != o.h) {
				return Long.compare(h, o.h);
			}
			return Long.compare(d, o.d);
		}
	}
}
