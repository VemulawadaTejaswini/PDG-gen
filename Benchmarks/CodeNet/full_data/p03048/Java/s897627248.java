import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(1, in, out);
		out.close();
	}

	static class Task {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int R = in.nextInt();
			int G = in.nextInt();
			int B = in.nextInt();
			int N = in.nextInt();
			int count = 0;
			for(int i = 0; i <= N; i++) {
				if(R > N) {
					continue;
				}
				for(int j = 0; j <= N - i; j++) {
					if(G > N) {
						continue;
					}
					for(int k = 0; k <= N - i - j; k++) {
						if(B > N) {
							continue;
						}
						if(R * i + G * j + B * k == N) {
							count++;
						}
					}
				}
			}
			out.println(count);
		}
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;	

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
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

		public char nextChar() {
			return next().charAt(0);
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

	}
}
