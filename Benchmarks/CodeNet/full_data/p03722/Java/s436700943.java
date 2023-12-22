
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Edge{
		int from;
		int to;
		long cost;
		Edge(int from, int to, long cost){
			this.from=from;
			this.to=to;
			this.cost=cost;
		}
	}

	ArrayList<Edge> es;
	long INF = 100100100100100L;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		es = new ArrayList<>();

		for(int i=0; i<m; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			a--;b--;
			long c=sc.nextInt();
			c = -c;
			es.add(new Edge(a,b,c));
		}

		long dist[] = new long[n];
		for(int i=0; i<n; i++) {
				dist[i]=INF;
		}
		dist[0]=0;

		boolean negative = false;
		for(int i=0; i<n; i++) {
			for(int j=0; j<es.size(); j++) {
				Edge e = es.get(j);
				if(dist[e.from] == INF) continue;
				if(dist[e.to] > dist[e.from] + e.cost) {
					if(i==n-1) {
						negative=true;
					}
					dist[e.to] = dist[e.from]+ e.cost;
				}
			}
		}
		if(negative) {
			System.out.println("inf");
		}else {
			System.out.println(-dist[n-1]);
		}
		sc.close();
	}



}
