import java.io.*;
import java.util.*;
import java.math.*;

public class Main implements Runnable {
	private static BufferedReader in;
	private static PrintWriter out;
	private static StringTokenizer st;
	private static Random rnd;

	private void solve() throws IOException {
		int n = nextInt();
		List<Integer>[] tree = new List[n];
		for (int i = 0; i < n; i++)
			tree[i] = new ArrayList<>();
		for (int i = 0; i < n - 1; i++) {
			int u = nextInt() - 1;
			int v = nextInt() - 1;
			tree[u].add(v);
			tree[v].add(u);
		}
		int res = dfs(0, -1, tree);
		out.println(res == 1 ? "Alice" : "Bob");
	}


	private int dfs(int u, int p, List<Integer>[] tree) {
		List<Integer> childs = tree[u];
		int childsCount = childs.size() + ((p == -1) ? 0 : -1);
		if (childsCount == 0) {
			return 0;
		} else if (childsCount == 1) {
			return 1;
		} else {
			int x = 0;
			for (int v : childs) {
				if (v != p)
					x ^= dfs(v, u, tree);
			}
			return x;
		}
	}


	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);

			rnd = new Random();

			solve();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	private String nextToken() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			String line = in.readLine();

			if (line == null)
				return null;

			st = new StringTokenizer(line);
		}

		return st.nextToken();
	}

	private int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	private long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	private double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}