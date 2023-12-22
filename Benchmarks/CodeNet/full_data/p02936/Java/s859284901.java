import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	ArrayList<Integer>[] g;

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		g = new ArrayList[N];
		for (int i = 0; i < N; ++i)
			g[i] = new ArrayList<>();
		int Q = sc.nextInt();
		long[] w = new long[N];
		for (int i = 0; i < N - 1; ++i) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			g[a].add(b);
			g[b].add(a);
		}
		for (int i = 0; i < Q; ++i) {
			int p = sc.nextInt() - 1;
			int x = sc.nextInt();
			w[p] += x;
		}
		dfs(0, -1, 0, w);
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < N; ++i) {
			pw.print(w[i] + (i == N - 1 ? "\n" : " "));
		}
		pw.close();
	}

	void dfs(int cur, int par, long pending, long[] w) {
		w[cur] += pending;
		for (int dst : g[cur]) {
			if (dst == par)
				continue;
			dfs(dst, cur, w[cur], w);
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}