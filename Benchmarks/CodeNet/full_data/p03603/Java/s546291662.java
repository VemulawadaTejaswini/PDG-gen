import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	int[][][] f;

	// f[i][0]={w[i],#黒}∧col[i]=白
	// f[i][1]={#白,w[i]}∧col[i]=黒

	void dfs(int cur, int par, ArrayList<Integer>[] g, int[] x) {
		f[cur][0][0] = x[cur];
		f[cur][1][1] = x[cur];
		for (int dst : g[cur]) {
			if (dst == par) {
				continue;
			}
			dfs(dst, cur, g, x);
			// col[cur]=黒
			{
				int add = Integer.MAX_VALUE / 10;
				if (f[dst][0][1] <= x[cur]) {
					add = Math.min(add, f[dst][0][0]);
				}
				if (f[dst][1][1] <= x[cur]) {
					add = Math.min(add, f[dst][1][0]);
				}
				if (add < Integer.MAX_VALUE / 10)
					f[cur][1][0] += add;
				else
					f[cur][1][0] = Integer.MAX_VALUE / 10;
			}
			// col[cur]=白
			{
				int add = Integer.MAX_VALUE / 10;
				if (f[dst][0][0] <= x[cur]) {
					add = Math.min(add, f[dst][0][1]);
				}
				if (f[dst][1][0] <= x[cur]) {
					add = Math.min(add, f[dst][1][1]);
				}
				if (add < Integer.MAX_VALUE / 10)
					f[cur][0][1] += add;
				else
					f[cur][0][1] = Integer.MAX_VALUE / 10;
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
		f = new int[n][2][2];
		dfs(0, -1, g, x);
		if (f[0][0][1] < Integer.MAX_VALUE / 10 || f[0][1][0] < Integer.MAX_VALUE / 10) {
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] x = new int[n];
		for (int i = 0; i < n - 1; ++i) {
			p[i] = sc.nextInt();
			--p[i];
		}
		for (int i = 0; i < n; ++i) {
			x[i] = sc.nextInt();
		}

		solve(n, p, x);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}