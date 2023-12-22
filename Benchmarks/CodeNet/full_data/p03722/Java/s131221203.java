import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
	static int n;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		ArrayList<Edge> edge = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;
			int c = Integer.parseInt(str[2]);
			edge.add(new Edge(a, b, c));
		}

		long ans = bellmanford(edge, 0, n - 1);

		if (ans == Long.MIN_VALUE)
			System.out.println("inf");
		else
			System.out.println(ans);
	}

	static long bellmanford(ArrayList<Edge> edge, int s, int g) {
		long[] dist = new long[n];
		int[] count = new int[n];

		Arrays.fill(dist, Long.MIN_VALUE);
		dist[s] = 0;

		boolean loop = false;
		boolean update = true;

		while (update && !loop) {
			update = false;
			for (Edge e : edge) {
				if (dist[e.from] != Long.MIN_VALUE && dist[e.from] + e.cost > dist[e.to]) {
					dist[e.to] = dist[e.from] + e.cost;
					update = true;

					if (++count[e.to] >= n && e.to == g) {
						return Long.MIN_VALUE;
					}
				}
			}
		}
		return dist[g];
	}
}

class Edge implements Comparable<Edge> {

	int from;
	int to;
	long cost;

	public Edge(int from, int to, long cost) {
		this.from = from;
		this.to = to;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge e) {
		return (int) (this.cost - e.cost);
	}
}
