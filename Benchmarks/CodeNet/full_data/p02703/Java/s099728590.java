import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	long inf = LMAX / 2 - MAX;

	List<Edge> link[];

	void doIt() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int S = sc.nextInt();


		int[] C = new int[N];
		int[] D = new int[N];
		link = new List[N];
		for(int i = 0; i < N; i++) {
			link[i] = new ArrayList<>();
		}
		int amax = 0;

		for(int i = 0; i < M; i++) {
			int U = sc.nextInt() - 1;
			int V = sc.nextInt() - 1;
			int A = sc.nextInt();
			int B = sc.nextInt();
			link[U].add(new Edge(V, A, B));
			link[V].add(new Edge(U, A, B));
			amax = Math.max(A, amax);
		}
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
			D[i] = sc.nextInt();
		}
		int len = amax * (N - 1) + 1;
		S = Math.min(S, len);

		long dp[][] = new long[N][len + 1];
		for(int i = 0; i < N; i++)
			Arrays.fill(dp[i], inf);
		dp[0][S] = 0;


		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.add(new Edge(0, S, 0));
		while(!pq.isEmpty()) {
			Edge e = pq.poll();
			//System.out.println("now:" + e.to + " " + e.coin + " " + e.cost);
			if(dp[e.to][e.coin] < e.cost) continue;
			int nextCoin = Math.min(e.coin + C[e.to], len);
			if(dp[e.to][nextCoin] > e.cost + D[e.to]) {
				dp[e.to][nextCoin] = e.cost + D[e.to];
				pq.add(new Edge(e.to, nextCoin, e.cost + D[e.to]));
				//System.out.println(e.to + " " + nextCoin + " " + (e.cost + D[e.to]));
			}
			
			for(Edge i : link[e.to]) {
				//System.out.println(e.coin + "->" + i.coin);
				if(e.coin < i.coin) continue;
				if(dp[i.to][e.coin - i.coin] > e.cost + i.cost) {
					dp[i.to][e.coin - i.coin] = e.cost + i.cost;
					pq.add(new Edge(i.to, e.coin - i.coin, e.cost + i.cost));
					//System.out.println(i.to + " " + (e.coin - i.coin) + " " + e.cost +"+"+ i.cost+"="+(e.cost+i.cost));

				}
			}

		}
		for(int i = 1; i < N; i++) {
			long min = inf;
			for(int j = 0; j < len; j++) {
				min = Math.min(dp[i][j], min);
			}
			System.out.println(min);
		}
		
		/*for(int i = 0; i < N; i++) {
			for(int j = 0; j < len; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}*/

	}

	class Edge implements Comparable<Edge>{
		int to;
		int coin;
		long cost;

		Edge(int t, int sc ,long c){
			to = t; coin = sc; cost = c;
		}

		@Override
		public int compareTo(Edge arg0) {
			return (int)(this.cost - arg0.cost);
		}

	}

	
	

	public static void main(String[] args) {
		new Main().doIt();
	}
}
