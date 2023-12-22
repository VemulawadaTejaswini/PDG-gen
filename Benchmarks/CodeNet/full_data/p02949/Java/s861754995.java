import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int p = Integer.parseInt(sa[2]);
		List<List<Hen>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		int[] max = new int[n];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			int c = Integer.parseInt(sa[2]) - p;
			list.get(a).add(new Hen(b, c));
			max[b]++;
		}
		br.close();

		long INF = 10000000000000000L;
		int s = 0;
		long[] d = new long[n];
		for (int i = 1; i < d.length; i++) {
			d[i] = Long.MIN_VALUE;
		}
		long[] cnt = new long[n];
		PriorityQueue<Node> que = new PriorityQueue<Node>();
		Node first = new Node(s, 0);
		que.add(first);

		while (!que.isEmpty()) {
			Node cur = que.poll();
			for (Hen hen : list.get(cur.v)) {
				long alt = d[cur.v] + hen.c;
				if (d[hen.v] < alt && cnt[hen.v] < INF) {
					if (cnt[hen.v] > max[hen.v] + 1) {
						d[hen.v] = INF;
						Node next = new Node(hen.v, INF);
						que.add(next);
						cnt[hen.v] = INF;
					} else {
						d[hen.v] = alt;
						Node next = new Node(hen.v, alt);
						que.add(next);
						cnt[hen.v]++;
					}
				}
			}
		}
		if (d[n - 1] >= INF / 100) {
			System.out.println(-1);
		} else {
			System.out.println(Math.max(d[n - 1], 0));
		}
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
		long d;

		public Node(int v, long d) {
			this.v = v;
			this.d = d;
		}

		public int compareTo(Node o) {
			if (d > o.d) {
				return 1;
			} else if (d == o.d) {
				return 0;
			} else {
				return -1;
			}
		}
	}
}
