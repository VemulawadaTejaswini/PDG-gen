
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static FastReader input = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	static int n, m;
	static int[][] memo;
	static char[][] a;
	static boolean[][] visited;

	static int solve(int i, int j) {

		if (i >= n || j >= m || a[i][j] == '#')
			return 0;

		if (i == n - 1 && j == m - 1)
			return 1;

		if (visited[i][j])
			return memo[i][j];

		visited[i][j] = true;

		int x = solve(i + 1, j);
		int y = solve(i, j + 1);

		return memo[i][j] = ((x + y) % ((int) 1e9 + 7));
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		n = input.nextInt();
		m = input.nextInt();

		a = new char[n][m];

		memo = new int[n + 10][m + 10];
		visited = new boolean[n + 10][m + 10];

		for (int i = 0; i < n; i++) {
			a[i] = input.nextLine().toCharArray();
		}

		System.out.println(solve(0, 0));

	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		String nextLine() throws IOException {
			String str = "";
			str = br.readLine();
			return str;
		}
	}
}
