import java.util.*;
import java.io.*;


public class Main {
	
	public static class edge {
		
		node l;
		node r;
		int d;
		long excl2;
		long w3;
		boolean excludes;
		long w4;
		
		public edge(node l, node r, int d) {
			this.l = l;
			this.r = r;
			this.d = d;
			this.excl2 = -1;
			this.w3 = 0;
			this.excludes = false;
			this.w4 = 0;
		}
		
	}	
	public static class node implements Comparable<node>{
		
		LinkedList<edge> edg;
		long btp;
		boolean p1clear;
		boolean p2clear;
		boolean p3clear;
		long excl2;
		long w3;
		boolean p4clear;
		long w4;
		boolean excludes;
		
		long sort_val;
		
		public node() {
			edg = new LinkedList<edge>();
			btp = -1;
			sort_val = 0;
			p1clear = false;
			p2clear = false;
			p3clear = false;
			p4clear = false;
			excl2 = -1;
			w3 = 0;
			w4 = 0;
			this.excludes = false;
		}
		
		public int compareTo(node other) {
			if(this.sort_val < other.sort_val) return -1;
			if(this.sort_val == other.sort_val) return 0;
			return 1;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] rd;
		rd = in.readLine().split("\\s++");
		int n = Integer.parseInt(rd[0]);
		int m = Integer.parseInt(rd[1]);
		rd = in.readLine().split("\\s++");
		int s = Integer.parseInt(rd[0]);
		int t = Integer.parseInt(rd[1]);
		node[] nodes = new node[n];
		for(int i = 0; i < n; i++) {
			nodes[i] = new node();
		}
		edge[] edges = new edge[m];
		for(int i = 0; i < m; i++) {
			rd = in.readLine().split("\\s++");
			int l = Integer.parseInt(rd[0]);
			int r = Integer.parseInt(rd[1]);
			int d = Integer.parseInt(rd[2]);
			edge tm = new edge(nodes[l-1], nodes[r-1], d);
			nodes[l-1].edg.offer(tm);
			nodes[r-1].edg.offer(tm);
			edges[i] = tm;
		}
		// Pass one: Assign times for blue to pink ( s to t)
		PriorityQueue<node> q = new PriorityQueue<node>();
		nodes[s-1].btp = 0;
		nodes[s-1].sort_val = 0;
		q.offer(nodes[s-1]);
		while(!q.isEmpty()) {
			node next = q.poll();
			if(next.p1clear) continue;
			for(edge e : next.edg) {
				node oth = e.l;
				if(e.l == next) {
					oth = e.r;
				}
				if(oth.p1clear) continue;
				if(oth.btp == -1 || oth.btp > (next.btp + e.d)) {
					oth.btp = next.btp + e.d;
					oth.sort_val = next.btp + e.d;
					q.offer(oth);
				}
			}
			next.p1clear = true;
		}
		long t_short = nodes[t-1].btp;
		// Pass two: Assign exclusion ranges for blue to pink
		nodes[t-1].excl2 = nodes[t-1].btp;
		if((2 * nodes[t-1].excl2) == t_short) nodes[t-1].excludes = true;
		int dum = 0;
		nodes[t-1].sort_val = dum++;
		q.offer(nodes[t-1]);
		while(!q.isEmpty()) {
			node next = q.poll();
			if(next.p2clear) continue;
			for(edge e : next.edg) {
				node oth = e.l;
				if(e.l == next) {
					oth = e.r;
				}
				if(oth.p2clear) continue;
				if(oth.btp == next.btp - e.d) {
					oth.excl2 = oth.btp;
					if(2 * oth.excl2 == t_short) oth.excludes = true;
					e.excl2 = oth.btp;
					if(2 * oth.excl2 < t_short && 2 * (oth.excl2 + e.d) > t_short) e.excludes = true;
					oth.sort_val = dum++;
					q.offer(oth);
				}
			}
			next.p2clear = true;
		}
		// Pass three: Count the ways from blue to pink
		nodes[s-1].w3 = 1;
		for(int i = 0; i < n; i++) {
			nodes[i].sort_val = nodes[i].btp;
		}
		q.offer(nodes[s-1]);
		long MOD = 1000000007;
		while(!q.isEmpty()) {
			node next = q.poll();
			if(next.p3clear) continue;
			for(edge e : next.edg) {
				node oth = e.l;
				if(e.l == next) {
					oth = e.r;
				}
				if(oth.p3clear) continue;
				if(next.btp + e.d == oth.btp) {
					e.w3 = next.w3;
					oth.w3 = (oth.w3 + next.w3) % MOD;
					q.offer(oth);
				}
			}
			next.p3clear = true;
		}
		long tot_ways = nodes[t-1].w3;
		// Pass four: Get the final ans
		nodes[t-1].w4 = 1;
		for(int i = 0; i < n; i++) {
			nodes[i].sort_val = t_short - nodes[i].btp;
		}
		q.offer(nodes[t-1]);
		while(!q.isEmpty()) {
			node next = q.poll();
			if(next.p4clear) continue;
			for(edge e : next.edg) {
				node oth = e.l;
				if(e.l == next) {
					oth = e.r;
				}
				if(oth.p4clear) continue;
				if(oth.btp + e.d == next.btp) {
					e.w4 = next.w4;
					oth.w4 = (oth.w4 + next.w4) % MOD;
					q.offer(oth);
				}
			}
			next.p4clear = true;
		}
		long ans = (tot_ways * tot_ways) % MOD;
		for(int i = 0; i < n; i++) {
			if(nodes[i].excludes) {
				long pen = (nodes[i].w3 * nodes[i].w4) % MOD;
				ans -= pen;
				if(ans < 0) ans += MOD;
			}
		}
		for(int i = 0; i < m; i++) {
			if(edges[i].excludes) {
				long pen = (edges[i].w3 * edges[i].w4) % MOD;
				ans -= pen;
				if(ans < 0) ans += MOD;
				
			}
		}
		System.out.println(tot_ways);
	}
}