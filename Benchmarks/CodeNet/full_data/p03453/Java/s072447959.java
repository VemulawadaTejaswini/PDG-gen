
import java.util.*;
import java.io.*;

class Edge {
	int to, cost;
	public Edge(int to, int cost) {
		super();
		this.to = to;
		this.cost = cost;
	}
}

class Vertex implements Comparable<Vertex>{
	int id;
	long dist;
	public Vertex(int id, long dist) {
		super();
		this.id = id;
		this.dist = dist;
	}
	
	@Override
	public int compareTo(Vertex o) {
		if (dist != o.dist) {
			return Long.compare(dist, o.dist);
		}
		return id - o.id;
	}
	
}

public class Main {
	
	static List<Edge>[] graph; 
	static int mod = (int)1e9+7;
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), m = fs.nextInt();
		int s = fs.nextInt()-1, t = fs.nextInt()-1;
		graph = new List[n];
		for (int i=0;i<n;i++) graph[i] = new ArrayList<>();
		for (int i=0;i<m;i++) {
			int u = fs.nextInt()-1 , v = fs.nextInt()-1, d = fs.nextInt();
			graph[u].add(new Edge(v, d)); 
			graph[v].add(new Edge(u, d)); 
		}
		long distS[] = new long[n]; //各ノードまでの距離
		long distT[] = new long[n];
		long numS[] = new long[n]; //ノードに最短で辿り着く時の経路の数
		long numT[] = new long[n];

		dijkstra(s, distS, numS);
		dijkstra(t, distT, numT);
		
		//SからT, TからSの全通りの行き方
		long total = distS[t];
		long all = numS[t] * numT[s] % mod;
		//点で出会う時　最短経路状の頂点かつ、二人からの距離が等しい
		long vNum = 0;
		for(int i=0;i<n;i++) {
			if(distS[i] == distT[i] && distS[i]*2 == total) {
				long tmp = numS[i] * numT[i] % mod;
				tmp = tmp * tmp % mod;
				vNum = ( vNum + tmp ) % mod;
			}
		}
		//辺で出会う時
		long eNum = 0;
		for(int i=0;i<n;i++) {
			for(Edge e : graph[i]) {
				int from = i, to = e.to;
				if(distS[from] + distT[from] == total && distT[to] * 2 < total && distT[from] * 2 > total) {
					long tmp = numS[from] * numT[to] % mod;
					tmp = tmp * tmp % mod;
					eNum = ( eNum + tmp ) % mod;
				}
			}
		}
		long ans = (all - ((vNum + eNum)%mod + mod)%mod)%mod; 
		System.out.println(ans);
	}
	static void dijkstra(int v, long dist[], long num[]) {
		long INF = Long.MAX_VALUE / 3;
		Arrays.fill(dist, INF);
		dist[v] = 0;
		num[v] = 1;
//		PriorityQueue<Vertex> pq = new PriorityQueue<>((v1, v2)->v1.dist < v2.dist ? -1:1);
		PriorityQueue<Vertex> pq = new PriorityQueue<>();
		pq.add(new Vertex(v, 0));
		while(!pq.isEmpty()) {
			Vertex now = pq.poll();
			if(now.dist > dist[now.id])continue;
			for(Edge e : graph[now.id]) {
				if(dist[e.to] > dist[now.id] + e.cost) {
					dist[e.to] = dist[now.id] + e.cost; 
					pq.add(new Vertex(e.to, dist[e.to]));
					num[e.to] = num[now.id];
				}
				else if( dist[e.to] == dist[now.id] + e.cost ){
					num[e.to] += num[now.id];					
				}
			}
		}
		
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}