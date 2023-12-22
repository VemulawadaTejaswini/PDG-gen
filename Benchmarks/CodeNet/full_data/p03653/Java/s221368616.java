import java.util.*;

public class Main {
	public static class MinCostFlow {
		public class Edge {
			int to, cap, rev;
			long cost;

			public Edge(int to, int cap, long cost, int rev) {
				this.to = to;
				this.cap = cap;
				this.cost = cost;
				this.rev = rev;
			}
		}
		public class Pair {
			long dis;
			int idx;
			public Pair(long dis, int idx) {
				this.dis = dis;
				this.idx = idx;
			}
		}
		
		int V;
		ArrayList<ArrayList<Edge>> G;
		long[] h;
		long dist[];
		int prevv[], preve[];
		static final long INF = 10000000000000000l;
		
		public MinCostFlow(int V) {
			this.V = V;
			G = new ArrayList<ArrayList<Edge>>();
			for(int i=0; i<V; i++)
				G.add(new ArrayList<Edge>());
			h = new long[V];
			dist = new long[V];
			prevv = new int[V];
			preve = new int[V];
		}
		
		public void addEdge(int from, int to, int cap, long cost) {
			G.get(from).add(new Edge(to, cap, cost, G.get(to).size()));
			G.get(to).add(new Edge(from, 0, -cost, G.get(from).size()-1));
		}
		
		public long getMinCost(int s, int t, int f) {
			long res = 0;
			while(f>0) {
				PriorityQueue<Pair> que = new PriorityQueue<>(new Comparator<Pair>() {
					public int compare(Pair p1, Pair p2) {
						return -Long.compare(p1.dis, p2.dis);
					}
				});
				Arrays.fill(dist, INF);
				dist[s]=0;
				que.add(new Pair(0, s));
//				boolean updated = true;
				while(!que.isEmpty()) {
					Pair p = que.poll();
					int v = p.idx;
					if(dist[v] < p.dis)
						continue;
					for(int i=0; i<G.get(v).size(); i++) {
						Edge e = G.get(v).get(i);
						if(e.cap>0 && dist[e.to] > dist[v] + e.cost + h[v] - h[e.to]) {
							dist[e.to] = dist[v] + e.cost + h[v] - h[e.to];
							prevv[e.to] = v;
							preve[e.to] = i;
							que.add(new Pair(dist[e.to], e.to));
						}
					}
				}
				
				if(dist[t]==INF)
					return -1;
				
				for(int v=0; v<V; v++)
					h[v] += dist[v];
				
				long d=f;
				for(int v=t; v!=s; v=prevv[v]) {
					d = Math.min(d, G.get(prevv[v]).get(preve[v]).cap);
				}
				
				f-=d;
				res += d*h[t];
				for(int v=t; v!=s; v=prevv[v]) {
					Edge e = G.get(prevv[v]).get(preve[v]);
					e.cap -= d;
					G.get(v).get(e.rev).cap += d;
				}
			}
			return res;
		}
	}
	
	public static void main(String[] args) {
		final long Gap = 1000000000;
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int N = X+Y+Z;
		
		MinCostFlow mcf = new MinCostFlow(N*3+4);
		int sa = N*3;
		int sb = sa+1;
		int s = sb+1;
		int t = s+1;
		long goldSum = 0;
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			goldSum += a;
			
			mcf.addEdge(i+N, i, 1, Gap-(b-a));
			mcf.addEdge(i+N*2, i, 1, Gap-(c-a));
			mcf.addEdge(i, t, 1, 0);
			mcf.addEdge(sa, i+N, 1, 0);
			mcf.addEdge(sb, i+N*2, 1, 0);
		}
		mcf.addEdge(s, sa, Y, 0);
		mcf.addEdge(s, sb, Z, 0);

		System.out.println(goldSum + (Y+Z)*Gap - mcf.getMinCost(s, t, Y+Z));
		
		sc.close();
	}
}
