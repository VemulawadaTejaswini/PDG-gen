import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int tank = sc.nextInt();
		ArrayList<Pair>[] g = new ArrayList[n];
		for(int i = 0; i < n; i++) g[i] = new ArrayList<Pair>();
		for(int i = 0; i < m; i++) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			int w = sc.nextInt();
			if(w > tank) continue;
			g[u].add(new Pair(v, w));
			g[v].add(new Pair(u, w));
		}
		Pair[][] dist = new Pair[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				dist[i][j] = new Pair(n+1, 0);
			}
		}
		for(int s = 0; s < n; s++) {
			LinkedList<Pair2> q = new LinkedList<>();
			q.add(new Pair2(s, new Pair(0, tank)));
			dist[s][s] = new Pair(0, tank);
			while(!q.isEmpty()) {
				Pair2 p = q.pollFirst();
				int u = p.k;
				for(Pair pv: g[u]) {
					int ts = p.w.k;
					int curr = p.w.w;
					if(pv.w > curr) {
						ts++; curr = tank - pv.w;
					}
					else {
						curr -= pv.w;
					}
					Pair up = new Pair(ts, curr);
					if(dist[s][pv.k].compareTo(up) > 0) {
						dist[s][pv.k] = up;
						q.add(new Pair2(pv.k, up));
					}
				}
			}
		}
		int qers = sc.nextInt();
		for(int qi = 0; qi < qers; qi++) {
			int s = sc.nextInt()-1;
			int t = sc.nextInt()-1;
			if(dist[s][t].k > n) {
				System.out.println(-1);
			}
			else {
				System.out.println(dist[s][t].k);
			}
		}
		
	}
	static class Pair implements Comparable<Pair>{
		int k, w;
		public Pair(int k, int w) {
			this.k = k; this.w = w;
		}
		@Override
		public int compareTo(Pair p) {
			if(k == p.k) return p.w - w;
			else return k - p.k;
		}
		public String toString() {
			return k+"/"+w;
		}
		
	}
	static class Pair2 implements Comparable<Pair2>{
		int k; Pair w;
		public Pair2(int k, Pair w) {
			this.k = k; this.w = w;
		}
		@Override
		public int compareTo(Pair2 p) {
			return w.compareTo(p.w);
		}
		public String toString() {
			return k+"-("+w.toString()+")";
		}
	}
}
