import java.io.*;
import java.util.*;
import java.math.*;

public class Main implements Runnable {
	private static BufferedReader in;
	private static PrintWriter out;
	private static StringTokenizer st;
	private static Random rnd;
	
	static class State {
		int result;
		int size;
		
		public State(int result, int size) {
			this.result = result;
			this.size = size;
		}
	}

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
		State result = dfs(0, -1, tree);
		out.println(result.result == 1 ? "Alice" : "Bob");
	}


	private State dfs(int u, int p, List<Integer>[] tree) {
		List<Integer> childs = tree[u];
		State result = new State(0, 1);
		List<State> belows = new ArrayList<>();
		for (int v : childs) {
			if (v != p) {
				State below = dfs(v, u, tree);
				result.result ^= (below.result);
				result.size += below.size;
				belows.add(below);
			}
		}
		for (State below : belows) {
			int x = (result.size % 2) == (below.size % 2) ? 0 : 1;
			result.result ^= x;
		}
		return result;
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