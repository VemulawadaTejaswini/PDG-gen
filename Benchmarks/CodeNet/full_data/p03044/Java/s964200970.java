import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []u = new int[N - 1];
		int []v = new int[N - 1];
		long []cost = new long[N - 1];
		for (int i = 0; i < N - 1; i++) {
		    u[i] = sc.nextInt() - 1;
		    v[i] = sc.nextInt() - 1;
		    cost[i] = sc.nextInt();
		}
		long []d = dijkstra(N, 0, u, v, cost, true);
		int []id = new int[N];
		id[0] = 0;
		for (int i = 1; i < N; i++) {
		    if (d[i] % 2 == 0) {
		        id[i] = 0;
		    } else {
		        id[i] = 1;
		    }
		}
		for (int i : id) {
		    System.out.println(i);
		}
	}
	/**
	 * ダイクストラ法 (優先度付きキュー)
	 * @param N 頂点数 (0 ~ N-1)
	 * @param t 始点
	 * @param from, to 辺
	 * @param cost 辺のコスト
	 * @param flag true なら無向辺、 false なら有向辺
	 * @return d t から各頂点への最短距離
	 */
	public static long[] dijkstra(int N, int t, int[] from, int[] to, long[] cost, boolean flag) {
		final int WHITE = 0;
	    final int GRAY = 1;
	    final int BLACK = 2;
	    final long INF = 100000000000000l;
		long[] d = new long[N];
		int[] color = new int[N];
		@SuppressWarnings("unchecked")
		ArrayList<Node>[] adj = new ArrayList[N];
		for(int i = 0; i < N; i++) {
			d[i] = INF;
			color[i] = WHITE;
			adj[i] = new ArrayList<Node>();
		}
		int E = from.length;
		for(int i = 0; i < E; i++) {
			adj[from[i]].add(new Node(to[i], cost[i]));
			if(flag)adj[to[i]].add(new Node(from[i], cost[i]));
 
		}
		Queue<Node> pq = new PriorityQueue<Node>(new MyComparator());
		d[t] = 0;
		pq.add(new Node(t, 0l));
		while(!pq.isEmpty()) {
			Node f = pq.poll();
			int u = f.id;
			color[u] = BLACK;
			if(d[u] < f.cost) continue;
			for(int j = 0; j < adj[u].size(); j++) {
				int v = adj[u].get(j).id;
				if(color[v] == BLACK) continue;
				if(d[v] > d[u] + adj[u].get(j).cost) {
					d[v] = d[u] + adj[u].get(j).cost;
					pq.add(new Node(v, d[v]));
					color[v] = GRAY;
				}
			}
		}
		return d;
	}
	static class Node{
		int id;
		long cost;
		public Node(int id, long cost) {
			this.id = id;
			this.cost = cost;
		}
	}
	static class MyComparator implements Comparator<Node>{
		@Override
        public int compare(Node v1, Node v2) {
			if(v1.cost < v2.cost) {
				return -1;
			}else if(v1.cost == v2.cost) {
				return 0;
			}else {
				return 1;
			}
		}
	}
}
