import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), m = sc.nextInt();
		ArrayList<int[]>[] adj = new ArrayList[n];
		for (int i = 0; i < n; i++)
			adj[i] = new ArrayList();
		while (m-- > 0) {
			int u = sc.nextInt() - 1, v = sc.nextInt() - 1, c = sc.nextInt();
			adj[u].add(new int[] { v, c });
			adj[v].add(new int[] { u, c });
		}
		int[][] dist = new int[n][];
		for (int i = 0; i < n; i++) {
			dist[i] = new int[adj[i].size()];

			for (int j = 0; j < adj[i].size(); j++)
				dist[i][j] = i == 0 ? 1 : -1;
		}
		Deque<int[]> q = new LinkedList();
		for (int[] v : adj[0])
			q.add(new int[] { v[0], v[1], 1 });
		while (!q.isEmpty()) {
			int[] curr = q.pollFirst();
			int u = curr[0], c = curr[1], d = curr[2];
			for (int i = 0; i < adj[u].size(); i++)
				if (dist[u][i] == -1) {
					int[] tmp = adj[u].get(i);
					int newC = tmp[1];

					if (newC == c) {
						dist[u][i] = d;
						q.addFirst(new int[] { tmp[0], newC, dist[u][i] });
					} else {
						dist[u][i] = d + 1;
						q.addLast(new int[] { tmp[0], newC, dist[u][i] });
					}
				}

		}
		int ans = (int) 1e9;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < adj[i].size(); j++)
				if (adj[i].get(j)[0] == n - 1 && dist[i][j]!=-1)
					ans = Math.min(ans, dist[i][j]);
		System.out.println(ans == 1e9 ? -1 : ans);
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