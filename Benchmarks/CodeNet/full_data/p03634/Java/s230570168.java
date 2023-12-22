import java.util.*;

public class Main {

	List<Integer> next;
	List<Long> c;

	static long depth[];

	static Main edge[];

	public Main(List<Integer> next, List<Long> c, int count) {
		this.next = next;
		this.c = c;
	}

	public static void dfs(int v, int p, long d) {
		depth[v] = d;
		int n = edge[v].next.size();
		for (int i = 0; i < n; ++i) {
			int next = edge[v].next.get(i);
			if (next == 0)
				break;
			if (next == p)
				continue;
			long cost = edge[v].c.get(i);
			dfs(next, v, d + cost);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, a, b, q, k, x, y;
		long c;
		n = sc.nextInt();
		edge = new Main[n + 1];
		depth = new long[n + 1];
		for (int i = 0; i <= n; ++i) {
			edge[i] = new Main(new ArrayList<Integer>(), new ArrayList<Long>(), 0);
		}
		for (int i = 0; i < n - 1; ++i) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextLong();
			edge[a].next.add(b);
			edge[a].c.add(c);
			edge[b].next.add(a);
			edge[b].c.add(c);
		}

		q = sc.nextInt();
		k = sc.nextInt();
		dfs(k, -1, 0);
		for (int i = 0; i < q; ++i) {
			x = sc.nextInt();
			y = sc.nextInt();
			long ans = depth[x] + depth[y];
			System.out.println(ans);
		}
		sc.close();
	}

}
