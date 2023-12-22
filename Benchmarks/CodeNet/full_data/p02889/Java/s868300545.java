import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int tank = Integer.parseInt(st.nextToken());
		ArrayList<Pair>[] g = new ArrayList[n];
		for(int i = 0; i < n; i++) g[i] = new ArrayList<Pair>();
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken())-1;
			int v = Integer.parseInt(st.nextToken())-1;
			int w = Integer.parseInt(st.nextToken());;
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
		st = new StringTokenizer(br.readLine());
		int qers = Integer.parseInt(st.nextToken());
		for(int qi = 0; qi < qers; qi++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken())-1;
			int t = Integer.parseInt(st.nextToken())-1;
			if(dist[s][t].k > n) {
				bw.write("-1");
				bw.write("\n");
			}
			else {
				bw.write(""+dist[s][t].k);
				bw.write("\n");
			}
		}
		bw.flush();
		
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
