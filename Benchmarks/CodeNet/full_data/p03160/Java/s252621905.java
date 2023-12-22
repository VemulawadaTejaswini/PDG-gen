
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Frog1 {
	static FastReader input = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	static int n;
	static int[] a;
	static int[] memo;
	static final int INF =(int) 1e9;

	static int solve(int n) {

		if (n < 0)
			return INF;

		if (n == 0)
			return 0;

		if (memo[n] != -1)
			return memo[n];

		int x = (int) Math.abs(a[n] - a[n - 1]);
		int y = INF;
		
		if (n >= 2)
			y = Math.abs(a[n] - a[n - 2]);

		return memo[n] = Math.min(x + solve(n - 1), y + solve(n - 2));
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		n = input.nextInt();
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
