
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
	static int[] a;
	static int[] memo;
	static final int INF = (int) 1e9;
	static int k  ;
	
	static int solve(int n) {

		if (n < 0)
			return INF;

		if (n == 0)
			return 0;

		if (memo[n] != -1)
			return memo[n];

		int min = INF;

		for (int i = 1; i<=k && n-i>=0; i++) {
			min = Math.min(min, Math.abs(a[n]-a[n-i])+ solve(n-i));
		}

		return memo[n] = min;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		n = input.nextInt();
		k = input.nextInt();
		a = new int[n];
		memo = new int[n + 10];
		Arrays.fill(memo, -1);

		for (int i = 0; i < n; i++)
			a[i] = input.nextInt();

		System.out.println(solve(n - 1));

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
