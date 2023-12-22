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
			int A = in.nextInt();
			int B = in.nextInt();
			int M = in.nextInt();
			int[] a = new int[A];
			int[] b = new int[B];
			int[] c = new int[M];
			int minA = 10000000;
			int minB = 10000000;

			for(int i = 0; i < A; i++) {
				a[i] = in.nextInt();
				minA = Math.min(minA, a[i]);
			}
			for(int i = 0; i < B; i++) {
				b[i] = in.nextInt();
				minB = Math.min(minB, b[i]);
			}
			int[] x = new int[M];
			int[] y = new int[M];
			int ans = 10000000;
			for(int i = 0; i < M; i++) {
				x[i] = in.nextInt();
				y[i] = in.nextInt();
				c[i] = in.nextInt();	
				if((a[x[i] - 1] + b[y[i] - 1]) - c[i] < ans) {
					ans = a[x[i]- 1] + b[y[i] - 1] - c[i];
				}
				
			}
			if(minA + minB < ans) {
				ans = minA + minB;
			}
			System.out.println(ans);
		}
	}

	static boolean permutation_2(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] letters = new int[256];

		char[] s_array = s.toCharArray();
		for (char c : s_array) {
			letters[c]++;
		}

		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			if (--letters[c] < 0) {
				return false;
			}
		}
		return true;
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
