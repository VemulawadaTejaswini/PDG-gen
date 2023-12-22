import java.io.*;
import java.util.*;

public class Main {

	static ArrayList<Integer>[] adj;
	static int INF = (int) 1e9;
	static int[] l, r;

	static void dfs(int u, int p) {
		boolean decided = l[u] != -INF;

		for (int v : adj[u])
			if (v != p) {
				dfs(v, u);
				l[u] = Math.max(l[v], l[u]);
				r[u] = Math.min(r[v], r[u]);
			}
		if (!decided) {
			l[u]--;
			r[u]++;

		}
	}

	static boolean solve(int u, int p) {
		int prev = l[p];
		boolean ans = false;
		for (int i = -1; i <= 1; i += 2)
			if (prev + i >= l[u] && prev + i <= r[u]) {
				l[u] = prev + i;
				ans = true;
				break;
			}
		if (!ans)
			return false;
		for (int v : adj[u])
			if (v != p) {
				ans &= solve(v, u);
			}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		adj = new ArrayList[n];
		for (int i = 0; i < n; i++)
			adj[i] = new ArrayList();
		for (int i = 1; i < n; i++) {
			int u = sc.nextInt() - 1, v = sc.nextInt() - 1;
			adj[u].add(v);
			adj[v].add(u);

		}
		int k = sc.nextInt();
		int root = -1;
		l = new int[n];
		r = new int[n];
		Arrays.fill(l, -INF);
		Arrays.fill(r, INF);
		while (k-- > 0) {
			root = sc.nextInt() - 1;
			l[root] = r[root] = sc.nextInt();
		}
		dfs(root, root);

		boolean ans = true;
		for (int i = 0; i < n; i++)
			ans &= l[i] <= r[i];
		for (int v : adj[root])
			ans &= solve(v, root);
		out.println(ans ? "Yes" : "No");
		if (ans)
			for (int i = 0; i < n; i++)
				out.println(l[i]);
		out.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

		int[] nxtArr(int n) throws IOException {
			int[] ans = new int[n];
			for (int i = 0; i < n; i++)
				ans[i] = nextInt();
			return ans;
		}

	}

	static void sort(int[] a) {
		shuffle(a);
		Arrays.sort(a);
	}

	static void shuffle(int[] a) {
		int n = a.length;
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			int tmpIdx = rand.nextInt(n);
			int tmp = a[i];
			a[i] = a[tmpIdx];
			a[tmpIdx] = tmp;
		}
	}

}