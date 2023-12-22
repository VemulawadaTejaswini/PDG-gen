import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		ArrayList<Integer>[] g = new ArrayList[N];
		for (int i = 0; i < g.length; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; ++i) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			g[a[i]].add(b[i]);
			g[b[i]].add(a[i]);
		}
		int Q = sc.nextInt();
		int[] v = new int[Q];
		int[] d = new int[Q];
		int[] c = new int[Q];
		for (int i = 0; i < Q; ++i) {
			v[i] = sc.nextInt() - 1;
			d[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		int[] color = new int[N];
		boolean[][] vis = new boolean[N][11];
		Arrays.fill(color, -1);
		for (int i = Q - 1; i >= 0; --i) {
			func(g, color, c[i], v[i], d[i], vis);
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int val : color) {
			if (val == -1) {
				pw.println(0);
			} else {
				pw.println(val);
			}
		}
		pw.close();
	}

	void func(ArrayList<Integer>[] g, int[] color, int c, int v, int d, boolean[][] vis) {
		if (vis[v][d])
			return;
		if (d == 0 && color[v] == -1)
			color[v] = c;
		else {
			func(g, color, c, v, d - 1, vis);
			for (int nei : g[v]) {
				func(g, color, c, nei, d - 1, vis);
			}
		}
		vis[v][d] = true;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}