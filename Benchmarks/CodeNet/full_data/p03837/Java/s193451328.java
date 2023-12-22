import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	static int n, m;
	static Hen[] arr;
	static List<List<Hen>> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		m = Integer.parseInt(sa[1]);
		arr = new Hen[m];
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.i = i;
			h.a = Integer.parseInt(sa[0]) - 1;
			h.b = Integer.parseInt(sa[1]) - 1;
			h.c = Integer.parseInt(sa[2]);
			arr[i] = h;
			list.get(h.a).add(h);
			list.get(h.b).add(h);
		}
		br.close();

		for (int i = 0; i < n; i++) {
			dijkstra(i);
		}
		int ans = 0;
		for (Hen h : arr) {
			if (!h.used) {
				ans++;
			}
		}
		System.out.println(ans);
	}

	static void dijkstra(int s) {
		List<List<Hen>> pre = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			pre.add(new ArrayList<>());
		}
		long[] d = new long[list.size()];
		Arrays.fill(d, Long.MAX_VALUE);
		d[s] = 0;
		PriorityQueue<Node> que = new PriorityQueue<Node>();
		Node first = new Node(s, 0);
		que.add(first);

		while (!que.isEmpty()) {
			Node cur = que.poll();
			for (Hen hen : list.get(cur.v)) {
				long alt = d[cur.v] + hen.c;
				int next = hen.a;
				if (next == cur.v) {
					next = hen.b;
				}
				if (alt < d[next]) {
					pre.get(next).clear();
				}
				if (alt <= d[next]) {
					d[next] = alt;
					que.add(new Node(next, alt));
					pre.get(next).add(hen);
				}
			}
		}
		for (List<Hen> pre2 : pre) {
			for (Hen h : pre2) {
				h.used = true;
			}
		}
	}

	static class Hen {
		int i, a, b, c;
		boolean used;
	}

	static class Node implements Comparable<Node> {
		int v;
		long d;

		public Node(int v, long d) {
			this.v = v;
			this.d = d;
		}

		public int compareTo(Node o) {
			return Long.compare(d, o.d);
		}
	}
}
