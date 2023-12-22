import java.io.*;
import java.util.*;
public class Main {
	
	static final int INF = Integer.MAX_VALUE;
	static PriorityQueue<Vertex> pq = new PriorityQueue<>();
	static boolean[] visited;
	static Vertex[] vs;
	
	static class Vertex implements Comparable<Vertex> {
		int index;
		int shortestDist;
		ArrayList<Integer> adj;
		
		public Vertex(int i) {
			index = i;
			shortestDist = INF;
			adj = new ArrayList<>();
		}
		
		public int compareTo(Vertex v) {
			return Integer.compare(shortestDist, v.shortestDist);
		}
		
//		public String toString() {
//			return "" + index + " " + shortestDist;
//		}
	}
	
	public static void main(String[] args) {
		InputReader in = new InputReader();
		int n = in.nextInt();
		int m = in.nextInt();
		
		vs = new Vertex[n];
		for (int i=0; i<n; i++)
			vs[i] = new Vertex(i);
		
		for (int i=0; i<m; i++) {
			int u = in.nextInt() - 1;
			int v = in.nextInt() - 1;
			vs[u].adj.add(v);
		}
		int s = in.nextInt() - 1, t = in.nextInt() - 1;
		
		visited = new boolean[n];
		visited[s] = true;
		vs[s].shortestDist = 0;
		pq.add(vs[s]);
		
		while (!pq.isEmpty() && !visited[t]) {
			Vertex v = pq.poll();
			dijkstra(v.index, v.index, 0);
		}
		
		System.out.println(vs[t].shortestDist == INF ? -1 : vs[t].shortestDist);
		
	}
	
	public static void dijkstra(int cur, int start, int dist) {
		if (dist == 3) {
			if (!visited[cur]) {
				visited[cur] = true;
				vs[cur].shortestDist = vs[start].shortestDist + 1;
				pq.add(vs[cur]);
			}
			return;
		}
		
		for (int i: vs[cur].adj)
			dijkstra(i, start, dist+1);
	}

	static class InputReader {
		public BufferedReader br;
		public StringTokenizer st;
		
		public InputReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = null;
		}
		
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}