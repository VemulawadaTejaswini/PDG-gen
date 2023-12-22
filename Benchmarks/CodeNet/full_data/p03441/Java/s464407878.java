import java.io.*;
import java.util.*;

public class Main {

	int[][] g;
	
	
	int ans = 0;
	void submit() {
		int n = nextInt();
		g = new int[n][];
		int[] a = new int[2 * n - 2];
		int[] deg = new int[n];
		for (int i = 0; i < 2 * n - 2; i++) {
			a[i] = nextInt();
			deg[a[i]]++;
		}

		for (int i = 0; i < n; i++) {
			g[i] = new int[deg[i]];
		}
		
		for (int i = 0; i < 2 * n - 2; i += 2) {
			int v = a[i];
			int u = a[i + 1];
			g[v][--deg[v]] = u;
			g[u][--deg[u]] = v;
		}
		
		int root = 0;
		while (root < n && g[root].length < 3) {
			root++;
		}
		
		if (root == n) {
			out.println(1);
			return;
		}
		
//		System.err.println(root);
		
		dfs(root, -1);
		out.println(ans);
	}
	
	boolean dfs(int v, int p) {
		int k = 0;
		boolean ret = false;
		for (int u : g[v]) {
			if (u == p) {
				continue;
			}
			if (!dfs(u, v)) {
				k++;
			} else {
				ret = true;
			}
		}
//		System.err.println(v + " " + k);
		
		if (k >= 2) {
			ans += k - 1;
			return true;
		}
		return ret;
	}

	void preCalc() {

	}

	void stress() {

	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		//stress();
		//test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
