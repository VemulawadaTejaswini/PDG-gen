import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static BufferedReader br;
	static PrintWriter pw;
	static int[][] memo;
	static int[] arr, C, D;
	static ArrayList<Integer> index;
	static ArrayList<Edge>[] adj;
	static long[][] dist;
	static int n;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		br = new BufferedReader(new FileReader(new File("input.txt")));
//		pw = new PrintWriter("output.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		adj = new ArrayList[n];
		D = new int[n];
		C = new int[n];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<>();
		}
		int maxa = 0;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()) - 1;
			int v = Integer.parseInt(st.nextToken()) - 1;
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			adj[u].add(new Edge(v, b, a));
			adj[v].add(new Edge(u, b, a));
			maxa = Math.max(maxa, a);
		}
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			C[i] = c;
			D[i] = d;
		}

		dist = new long[n][n * maxa + 1];
		s = Math.min(dist[0].length - 1, s);
		dijkstra(s);
		for (int i = 1; i < adj.length; i++) {
			long ans = Long.MAX_VALUE / 2;
			for (int j = 0; j < dist[0].length; j++) {
				ans = Math.min(ans, dist[i][j]);
			}
			pw.println(ans);
		}
		pw.flush();

	}

	static void dijkstra(int s) // O(E log E)
	{
		for (int i = 0; i < n; i++)
			Arrays.fill(dist[i], Long.MAX_VALUE / 2);

		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		dist[0][s] = 0;
		pq.add(new Edge(0, 0, s)); // may add more in case of MSSP
		int len = dist[0].length - 1; // (Mult-Source)
		while (!pq.isEmpty()) {
			Edge cur = pq.remove();
			int nextCoin = Math.min(cur.s + C[cur.node], len);
			if (cur.cost + D[cur.node] < dist[cur.node][nextCoin]) {
				dist[cur.node][nextCoin] = cur.cost + D[cur.node];
				pq.add(new Edge(cur.node, cur.cost + D[cur.node], nextCoin));
			}
			if (cur.cost > dist[cur.node][cur.s]) // lazy deletion
				continue;
			for (Edge nxt : adj[cur.node]) {
				if (cur.s < nxt.s)
					continue;
				if (cur.cost + nxt.cost < dist[nxt.node][cur.s - nxt.s]) {
					dist[nxt.node][cur.s - nxt.s] = cur.cost + nxt.cost;
					pq.add(new Edge(nxt.node, cur.cost + nxt.cost, cur.s - nxt.s));
				}
			}
		}
	}

	static class Edge implements Comparable<Edge> {
		int node, s, t;
		long cost;

		Edge(int n, long cost, int silver) {
			node = n;
			this.cost = cost;
			s = silver;
		}

		public int compareTo(Edge e) {
			return Long.compare(cost, e.cost);
		}
	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		public pair(int d, int u) {
			x = d;
			y = u;
		}

		public int compareTo(pair o) {
			if (x == o.x)
				return y - o.y;
			return x - o.x;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return x + " " + y;
		}

	}

}