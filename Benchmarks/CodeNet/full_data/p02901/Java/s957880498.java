import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] val = new long[m];
		int[] key = new int[m];
		for(int i = 0; i < m; i++) {
			val[i] = sc.nextLong();
			int b = sc.nextInt();
			int mask = 0;
			for(int j = 0; j < b; j++) {
				int c = sc.nextInt()-1;
				mask += (1 << c);
			}
			key[i] = mask;
		}
		int N = 1 << n;
		long[] cost = new long[N];
		Arrays.fill(cost, Integer.MAX_VALUE);
		cost[0] = 0;
		PriorityQueue<Pair> q = new PriorityQueue<>();
		q.add(new Pair(0, 0));
		while(!q.isEmpty()) {
			Pair p = q.poll();
			if(cost[p.u] < p.w) continue;
			for(int i = 0; i < m; i++) {
				int v = p.u | key[i];
				long w = cost[p.u] + val[i];
				if(w < cost[v]) {
					cost[v] = w;
					q.add(new Pair(v, w));
				}
			}
		}
		if(cost[N-1] == Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		else {
			System.out.println(cost[N-1]);
		}
	}
	static class Pair implements Comparable<Pair>{
		int u; long w;
		public Pair(int _n, long _w) {
			 u = _n; w = _w;
		}
		@Override
		public int compareTo(Pair p) {
			return (w-p.w > 0) ? 1 : (w-p.w < 0) ? -1 : 0;
		}
	}

}
