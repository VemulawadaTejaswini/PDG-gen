
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static int modP = 1000000007;

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int N = in.nextInt(), A = in.nextInt();
			int[] xn = in.nextIntArray(N);
			int X = A;
			for (int i = 0; i < N; i++) {
				X = Math.max(X, xn[i]);
			}

			int[][][] dp = new int[N+1][N+1][N*X+1];
			dp[0][0][0] = 1;

			for (int j = 0; j <= N; j++) {
				for (int k = 0; k <= N; k++) {
					for (int s = 0; s <= N*X; s++) {
						if (j >= 1 && s < xn[j-1]) {
							dp[j][k][s] = dp[j-1][k][s];
						} else if (j >= 1 && k >= 1 && s >= xn[j-1]) {
							dp[j][k][s] = dp[j-1][k][s] + dp[j-1][k-1][s-xn[j-1]];
						}
					}
				}
			}

			long ans = 0;
			for (int k = 1; k <= N; k++) {
				ans += dp[N][k][k*A];
			}
			out.println(ans);

		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}
