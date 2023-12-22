+import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run2();
	}

	long[] f;
	long INF = Integer.MAX_VALUE / 10;
	// f[i][0]={w[i],#黒}∧col[i]=白
	// f[i][1]={#白,w[i]}∧col[i]=黒

	void dfs(int cur, int par, ArrayList<Integer>[] g, int[] x) {
		for (int dst : g[cur]) {
			if (dst == par) {
				continue;
			}
			dfs(dst, cur, g, x);
			long add = INF;
			{
				if (x[dst] <= x[cur]) {
					add = Math.min(add, f[dst]);
				}
				if (f[dst] <= x[cur]) {
					add = Math.min(add, x[dst]);
				}
			}
			if (f[cur] < INF && add < INF) {
				f[cur] += add;
			} else {
				f[cur] = INF;
			}
		}

	}

	// f[i][0]={w[i],#黒}∧col[i]=白
	// f[i][1]={#白,w[i]}∧col[i]=黒

	void solve(int n, int[] p, int[] x) {
		ArrayList<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < n; ++i)
			g[i] = new ArrayList<>();
		for (int i = 0; i < n - 1; ++i) {
			g[i + 1].add(p[i]);
			g[p[i]].add(i + 1);
		}
		f = new long[n];
		dfs(0, -1, g, x);
		if (f[0] < INF) {
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}

	public void run() {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
	}

	void run2() {
		System.out.println("IMPOSSIBLE");
//		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] p = new int[n];
//		int[] x = new int[n];
//		for (int i = 0; i < n - 1; ++i) {
//			p[i] = sc.nextInt();
//			--p[i];
//		}
//		for (int i = 0; i < n; ++i) {
//			x[i] = sc.nextInt();
//		}
//
//		solve(n, p, x);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}