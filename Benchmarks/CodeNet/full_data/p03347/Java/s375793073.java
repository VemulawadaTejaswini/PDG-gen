import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	ArrayList<Integer>[] g;

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
		}
		if (A[0] != 0) {
			System.out.println(-1);
			return;
		}
		int ans = 0;
		for (int i = 1; i < N; ++i) {
			if (A[i] - A[i - 1] > 1) {
				System.out.println(-1);
				return;
			}
			if (i == N - 1 || A[i + 1] != A[i] + 1) {
				ans += A[i];
			}
		}
		System.out.println(ans);
		// int N = sc.nextInt();
		// int[] a = new int[N - 1];
		// int[] b = new int[N - 1];
		// int[] deg = new int[N];
		// g = new ArrayList[N];
		// for (int i = 0; i < N; ++i)
		// g[i] = new ArrayList<>();
		// for (int i = 0; i < N - 1; ++i) {
		// a[i] = sc.nextInt();
		// b[i] = sc.nextInt();
		// --a[i];
		// --b[i];
		// g[a[i]].add(b[i]);
		// g[b[i]].add(a[i]);
		// ++deg[a[i]];
		// ++deg[b[i]];
		// }
		// int diameter = 0;
		// for (int u = 0; u < N; ++u) {
		// for (int v = 0; v < N; ++v) {
		// if (deg[u] != 1 || deg[v] != 1)
		// continue;
		// Arrays.fill(depth, 0);
		// dfs(u, -1, v);
		// diameter = Math.max(diameter, depth[v] + 1);
		// }
		// }
		// int ans1 = 0, ans2 = 0;
		// for (int u = 0; u < N; ++u) {
		// for (int v = 0; v < N; ++v) {
		// if (deg[u] != 1 || deg[v] != 1)
		// continue;
		// Arrays.fill(depth, 0);
		// Arrays.fill(path, false);
		// Arrays.fill(unext, -1);
		// Arrays.fill(vnext, -1);
		// dfs(u, -1, v);
		// int d = depth[v] + 1;
		// if (d != diameter)
		// continue;
		// int leafs = 1, num = 2;
		// int s = u, t = v;
		// out: while (true) {
		// s = unext[s];
		// t = vnext[t];
		// if (s == t) {// 直径が奇数
		// if (deg[s] > 2) {
		// num += deg[s] - 2;
		// }
		// ans2 = Math.max(ans2, leafs * num);
		// break out;
		// }
		// if (vnext[s] == t) {
		// ans2 = Math.max(ans2, leafs * num);
		// break out;
		// }
		// leafs = leafs * (1 + Math.max(deg[s] - 2, deg[t] - 2));
		// }
		//
		// }
		// }
		//
		// System.out.println((diameter + 1) / 2 + " " + ans2);
	}

	// int[] depth = new int[200];
	// int[] unext = new int[200];
	// int[] vnext = new int[200];
	// boolean[] path = new boolean[200];
	//
	// boolean dfs(int cur, int par, int to) {
	// vnext[cur] = par;
	// if (par != -1)
	// depth[cur] = depth[par] + 1;
	// for (int dst : g[cur]) {
	// if (dst == par)
	// continue;
	// path[cur] |= dfs(dst, cur, to);
	// if (path[dst]) {
	// unext[cur] = dst;
	// }
	// }
	// return cur == to | path[cur];
	// }

	public static void main(String[] args) {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
