import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Edge{
		int to;
		int cost;
		Edge(int to, int cost){
			this.to=to;
			this.cost=cost;
		}
	}

	ArrayList<ArrayList<Edge>> g = new ArrayList<ArrayList<Edge>>();
	int d[];
	int INF = 2000000005;
	boolean ans = false;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0; i<n; i++) g.add(new ArrayList<Edge>());
		d = new int[n];
		for(int i=0; i<n; i++) d[i] = INF;
		for(int i=0; i<m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int d = sc.nextInt();
			g.get(l).add(new Edge(r,d));
			g.get(r).add(new Edge(l,-d));
		}
		for(int i=0; i<n; i++) {
			if(d[i] == INF) {
				dfs(i);
			}
		}
		System.out.println(ans ? "Yes" : "No");
		sc.close();
	}

	private void dfs(int r) {
		ArrayDeque<Integer> s = new ArrayDeque<Integer>();
		s.push(r);
		d[r]=0;
		while(!s.isEmpty()) {
			int u = s.pop();
			for(Edge e : g.get(u)) {
				if(d[e.to] != INF) {
					d[e.to] = d[u] + e.cost;
					s.push(e.to);
				}else {
					if(d[e.to] != d[u] + e.cost) {
						ans = false;
					}
				}
			}
		}
	}
}
