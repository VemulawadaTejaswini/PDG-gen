import java.util.*;
public class Main {

	static class Edge{
		int from, to, cost;
		Edge(int from, int to, int cost){
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}
	
	public static void main(String[] args) {
		int INF = Integer.MAX_VALUE/2;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int P = sc.nextInt();
		Edge[] e = new Edge[M];
		for (int i = 0; i < M; i++)
		    e[i] = new Edge(sc.nextInt()-1, sc.nextInt()-1, -(sc.nextInt()-P));
		long[] d = new long[N];
		Arrays.fill(d, 1, N, INF);
		long ans = 0;
		for(int c = 1; c <= 2*N; c++) {
			for(int i = 0; i < M; i++) {
				if(d[e[i].from] != INF && d[e[i].to] > d[e[i].from] + e[i].cost) {
					d[e[i].to] = d[e[i].from] + e[i].cost;
					if(c > N)
						d[e[i].to] = -INF;
				}
			}
			if(c == N)
				ans = d[N-1];
		}
		System.out.println(d[N-1] == ans ? Math.max(-ans, 0) : -1);
	}

}