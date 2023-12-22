import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long m = (long) 1e9 + 7;

	int[] depth;

	void dfs(int cur, int par, ArrayList<Integer>[] g) {
		for (int dst : g[cur]) {
			if (dst == par)
				continue;
			depth[dst] = depth[cur] + 1;
			dfs(dst, cur, g);
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int u = sc.nextInt();// T
		int v = sc.nextInt();// A
		--u;
		--v;
		int[] A = new int[N - 1];
		int[] B = new int[N - 1];
		ArrayList<Integer>[] g = new ArrayList[N];
		for (int i = 0; i < N; ++i)
			g[i] = new ArrayList<Integer>();
		for (int i = 0; i < N - 1; ++i) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			--A[i];
			--B[i];
			g[A[i]].add(B[i]);
			g[B[i]].add(A[i]);
		}
		depth = new int[N];
		dfs(v, -1, g);
		ArrayDeque<long[]> dq = new ArrayDeque<>();
		dq.addLast(new long[] { u, 0, depth[u] });
		long ans = 0;
		while (!dq.isEmpty()) {
			long[] cur = dq.pollFirst();
			for (int dst : g[(int) cur[0]]) {
				if (depth[dst] > depth[(int) cur[0]]) {
					dq.add(new long[] { dst, cur[1] + 1, cur[2] });
					ans = Math.max(ans, cur[1] + 1);
				} else {
					if (cur[2] - 2 > 0) {
						dq.add(new long[] { dst, cur[1] + 1, cur[2] - 2 });
						ans = Math.max(ans, cur[1] + 1);
					} else if (cur[2] == 2) {
						ans = Math.max(ans, cur[1] + 1);
					}
				}
			}
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}