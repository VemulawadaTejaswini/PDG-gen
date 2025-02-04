
import java.util.*;

public class Main {
	static class Edge {
		int src;
		int dst;
		int cost;

		public Edge(int src, int dst, int cost) {
			this.src = src;
			this.dst = dst;
			this.cost = cost;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Edge> es = new ArrayList<>();

		int[][] d = new int[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				if (i == j)
					continue;
				d[i][j] = Integer.MAX_VALUE / 10;
			}
		}
		for (int i = 0; i < M; ++i) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();
			d[a][b] = c;
			d[b][a] = c;
			es.add(new Edge(a, b, c));
			es.add(new Edge(b, a, c));
		}
		for (int m = 0; m < N; ++m) {
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					d[i][j] = Math.min(d[i][m] + d[m][j], d[i][j]);
				}
			}
		}
		int ans = 0;
		out: for (Edge e : es) {
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					if (d[i][e.src] + e.cost + d[e.dst][j] == d[i][j])
						continue out;
				}
			}
			++ans;
		}
		System.out.println(ans / 2);
	}
}
