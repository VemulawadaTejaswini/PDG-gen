import java.util.*;

public class Main {

	private static int[] d;
	private static int[] prev;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<int[]>[] g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();

			g[a].add(new int[]{b, c});
			g[b].add(new int[]{a, c});
		}

		boolean[][] es = new boolean[n][n];
		d = new int[n];
		prev = new int[n];
		PriorityQueue<Integer[]> pq = new PriorityQueue<>((x, y) -> Integer.compare(y[0], x[0]));
		for (int v = 1; v < n; v++) {
			Arrays.fill(d, 1000000000);
			Arrays.fill(prev, -1);
			pq.offer(new Integer[]{0, v, v});
			while (!pq.isEmpty()) {
				Integer[] a = pq.poll();
				if (d[a[1]] < a[0]) continue;
				d[a[1]] = a[0];
				prev[a[1]] = a[2];
				for (int i = 0; i < g[a[1]].size(); i++) {
					if (g[a[1]].get(i)[0] == a[2]) continue;
					pq.offer(new Integer[]{g[a[1]].get(i)[1] + d[a[1]], g[a[1]].get(i)[0], a[1]});
				}
			}

			for (int i = 0; i < prev.length; i++) {
				if (prev[i] == -1 || prev[i] == i) continue;
				es[prev[i]][i] = true;
				es[i][prev[i]] = true;
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (es[i][j]) count++;
			}
		}

		System.out.println(m - count / 2);
	}
}
