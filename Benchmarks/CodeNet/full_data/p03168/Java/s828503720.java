
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static FastReader input = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	static int n;
	static double[] pHead;
	static double[][] memo;
	static boolean[][] visited;

	static double solve(int i, int heads) {
		if (i >= n) {
			if (heads > n - heads) {
				return 1;
			} else {
				return 0;
			}
		}

		if (visited[i][heads]) {
			return memo[i][heads];
		}
		visited[i][heads] = true;

		return memo[i][heads] = pHead[i] * solve(i + 1, heads + 1) + ((1 - pHead[i]) * solve(i + 1, heads));

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		n = input.nextInt();
		pHead = new double[n];
		memo = new double[n + 10][n + 10];
		visited = new boolean[n + 10][n + 10];

		for (int i = 0; i < n; i++) {
			pHead[i] = input.nextDouble();
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
