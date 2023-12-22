
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static FastReader input = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	static int n;
	static int m = 3;

	static int[][] a, memo;
	static int _INF = (int) -1e9;

	static int solve(int n, int nextActivity) {

		if (n == -1) {
			return 0;
		}

		if (memo[n][nextActivity] != -1)
			return memo[n][nextActivity];

		int max = _INF;

		for (int i = 0; i < m; i++) {
			if (i != nextActivity) {
				max = Math.max(max, a[n][i] + solve(n - 1, i));
			}
		}

		return memo[n][nextActivity] = max;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		n = input.nextInt();

		a = new int[n][m];
		memo = new int[n + 10][m+5];

		for (int i = 0; i < n; i++) {
			Arrays.fill(memo[i], -1);
			for (int j = 0; j < m; j++) {
				a[i][j] = input.nextInt();
			}
		}
		
		System.out.println(solve(n-1,4));

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
