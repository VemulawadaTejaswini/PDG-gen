import java.io.*;
import java.util.*;

public class Main {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int N = file.nextInt();
		long[] h = new long[N + 1];
		long[] dp = new long[N + 1];
		dp[1] = 0;
		for(int i = 1; i <= N; i++) h[i] = file.nextLong();
		for(int i = 2; i <= N; i++) {
			dp[i] = Math.min(dp[i-2] + Math.abs(h[i] - h[i-2]), dp[i-1] + Math.abs(h[i] - h[i-1]));
		}
		System.out.println(dp[N]);
	}
	class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

	}
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
}
