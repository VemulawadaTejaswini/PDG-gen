import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Edge, Integer> map = new HashMap<>();
		ArrayList<Edge>[] adj= new ArrayList[n];
		for(int i=0;i<n;i++) {
			adj[i] = new ArrayList<>();
		}
		for(int i=0;i<m;i++) {
			int p = sc.nextInt()-1;
			int q = sc.nextInt()-1;
			int c = sc.nextInt()-1;
			adj[p].add(new Edge(q,c));
			adj[q].add(new Edge(p,c));
		}
		HashMap<Edge, Integer> dp = new HashMap<Edge, Integer>();
		PriorityQueue<Edge> pq = new PriorityQueue<>(new Comparator<Edge>() {

			@Override
			public int compare(Edge o1, Edge o2) {
				// TODO Auto-generated method stub
				return dp.get(o1)-dp.get(o2);
			}
			
		});
		for(Edge x : adj[0]) {
			dp.put(x,1);
			pq.add(x);
		}
		while(!pq.isEmpty()) {
			Edge curr = pq.poll();
			int steps = dp.get(curr);
			for(Edge next : adj[curr.dest]) {
				if(next.c==curr.c) {
					if(steps<dp.getOrDefault(next,1000000000)) {
						dp.put(next, steps);
						pq.add(next);
					}
				}
				else {
					if(steps+1<dp.getOrDefault(next,1000000000)) {
						dp.put(next,steps+1);
						pq.add(next);
					}
				}
			}
		}
		int min = 1000000000;
		for(int c=0;c<1000000;c++) {
			min = Math.min(min,dp.getOrDefault(new Edge(n-1,c),1000000000));
		}
		if(min>=1000000000) {
			System.out.println(-1);
		}
		else {
			System.out.println(min);
		}
		
	}
	static class Edge{
		int dest;
		int c;
		public Edge(int dest,int c) {
			this.dest = dest;
			this.c = c;
		}
		@Override
		public int hashCode() {
			return dest*1299827+c*1299821;
		}
		@Override
		public boolean equals(Object o) {
			Edge e = (Edge)o;
			return (e.dest==dest && e.c==c);
		}
		
	}
}
