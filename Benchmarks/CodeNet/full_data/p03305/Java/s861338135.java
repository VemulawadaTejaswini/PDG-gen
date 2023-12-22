import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), s = in.nextInt() - 1, t = in.nextInt() - 1;
		List<Grid>[] yen = new List[n], snu = new List[n];
		for(int i = 0; i < n; i++) {
			yen[i] = new ArrayList<>();
			snu[i] = new ArrayList<>();
		}
		for(int i = 0; i < m; i++) {
			int u = in.nextInt() - 1, v = in.nextInt() - 1;
			long a = in.nextLong(), b = in.nextLong();
			yen[u].add(new Grid(v, a));
			yen[v].add(new Grid(u, a));
			snu[u].add(new Grid(v, b));
			snu[v].add(new Grid(u, b));
		}
		long[] sc = Dijkstra.execute(yen, s), tc = Dijkstra.execute(snu, t);
		long[] ans = new long[sc.length];
		ans[ans.length - 1] = sc[sc.length - 1] + tc[tc.length - 1];
		for(int i = ans.length - 2; 0 <= i; i--) {
			ans[i] = Math.min(ans[i + 1], sc[i] + tc[i]);
		}
		for(long a : ans) {
			System.out.println(1_000_000_000_000_000L - a);
		}
	}
}

class Dijkstra {

	public static long[] execute(List<Grid>[] list, int start) {
		long[] cost = new long[list.length];
		Arrays.fill(cost, Integer.MAX_VALUE);
		cost[start] = 0;

		Queue<Grid> que = new PriorityQueue<>(Comparator.comparing(Grid::getCost).reversed());
		que.add(new Grid(start, 0));
		while(0 < que.size()) {
			Grid p = que.poll();
			if(cost[p.to] < p.cost) continue;
			for(Grid g : list[p.to]) {
				if(cost[p.to] + g.cost < cost[g.to]) {
					cost[g.to] = cost[p.to] + g.cost;
					que.add(new Grid(g.to, cost[g.to]));
				}
			}
		}
		return cost;
	}
}

class Grid {
	int to;
	long cost;

	public Grid(int to, long cost) {
		this.to = to;
		this.cost = cost;
	}
	public long getCost() { return this.cost; }
}