import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static long dist[][];
	static long ans = Integer.MAX_VALUE;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int R = Integer.parseInt(str[2]);

		long edge[][] = new long[N][N];

		int r[] = new int[R];
		str = br.readLine().split(" ");
		for (int i = 0; i < R; i++) {
			r[i] = Integer.parseInt(str[i]);
		}

		for (int i = 0; i < M; i++) {
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;
			int c = Integer.parseInt(str[2]);

			edge[a][b] = c;
			edge[b][a] = c;
		}
		dist = wf(edge, N);

		permutation(r);
		System.out.println(ans);
	}

	static long[][] wf(long edge[][], int n) {
		long dp[][] = edge;

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				if (dp[i][k] == 0)
					continue;
				for (int j = 0; j < n; j++) {
					if (dp[k][j] == 0)
						continue;
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
				}
			}
		}
		return dp;
	}

	private static void permutation(int[] seed) {
		int[] perm = new int[seed.length];
		boolean[] used = new boolean[seed.length];
		buildPerm(seed, perm, used, 0);
	}

	private static void buildPerm(int[] seed, int[] perm, boolean[] used, int index) {
		if (index == seed.length) {
			procPerm(perm);
			return;
		}

		for (int i = 0; i < seed.length; ++i) {
			if (used[i])
				continue;
			perm[index] = seed[i];
			used[i] = true;
			buildPerm(seed, perm, used, index + 1);
			used[i] = false;
		}
	}

	private static void procPerm(int[] perm) {
		// Use the perm[] here.
		//System.out.println(Arrays.toString(perm));
		long sum = 0;
		for (int i = 0; i < perm.length - 1; i++) {
			sum += dist[perm[i] - 1][perm[i + 1] - 1];
		}
		ans = Math.min(ans, sum);
	}

}

class Edge implements Comparable<Edge> {
	int to;
	int cost;

	public Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}

	public int compareTo(Edge e) {
		return this.cost - e.cost;
	}
}