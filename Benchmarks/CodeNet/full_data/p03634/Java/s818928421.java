import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Edge{
		int to;
		long cost;
		Edge(int to, long cost){
			this.to=to;
			this.cost=cost;
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Edge>> g = new ArrayList<ArrayList<Edge>>();
		int n = sc.nextInt();
		long INF = 10000000000000000L;
		for(int i=0; i<n; i++) {
			g.add(new ArrayList<Edge>());
		}
		for(int i=0; i<n-1; i++) {
			int a=sc.nextInt(); a--;
			int b=sc.nextInt(); b--;
			long c=sc.nextLong();
			g.get(a).add(new Edge(b, c));
			g.get(b).add(new Edge(a, c));
		}

		long d[] = new long[n];
		boolean used[] = new boolean[n];
		int q = sc.nextInt();
		int k = sc.nextInt(); k--;
		for(int i=0; i<n; i++) {
			d[i]=INF;
		}
		d[k]=0;


		while(true){
			long minv = INF;
			int u = -1;
			for(int i=0; i<n; i++) {
				if(used[i]) continue;
				if(d[i] == INF) continue;
				if(d[i] < minv) {
					minv = d[i];
					u = i;
				}
			}
			if(u == -1) break;
			used[u]=true;
			for(Edge e : g.get(u)) {
				if(used[e.to]) continue;
				if(d[e.to] > d[u] + e.cost) {
					d[e.to] = d[u] + e.cost;
				}
			}
		}

		for(int i=0; i<q; i++) {
			int x = sc.nextInt(); x--;
			int y = sc.nextInt(); y--;
			System.out.println(d[x] + d[y]);
		}
		sc.close();
	}

}
