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
		for(int i = 0; i < N; i++)
			for(int j = 0; j < M; j++)
					d[e[j].to] = Math.min(d[e[j].to], d[e[j].from] + e[j].cost);
		long ans = d[N-1];
		for(int k = 0; k < 2; k++)
			for(int i = 0; i < N; i++)
				for(int j = 0; j < M; j++)
					d[e[j].to] = Math.min(d[e[j].to], d[e[j].from] + e[j].cost);
		System.out.println(ans == d[N-1] ? Math.max(-ans, 0) : -1);
	}

}