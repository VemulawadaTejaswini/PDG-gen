import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(2, in, out);
		out.close();
	}

	static class TaskC {

		public void solve(int testNumber, InputReader in, PrintWriter out) {
			if (testNumber == 1) {
				solveA(in, out);
			} else if (testNumber == 2) {
				solveB(in, out);
			} else if (testNumber == 3) {
				solveC(in, out);
			} else if (testNumber == 4) {
				solveD(in, out);
			} else if (testNumber == 5) {
				solveE(in, out);
			} else if (testNumber == 6) {
				solveF(in, out);
			}
		}

		public void solveA(InputReader in, PrintWriter out) {
			long q = in.nextInt(), h = in.nextInt(), s = in.nextInt(), d = in.nextInt(), n = in.nextInt();
			long bestValueFor1 = Math.min(q * 4, h * 2);
			bestValueFor1 = Math.min(bestValueFor1, s);
			long bestValueFor2 = Math.min(2 * bestValueFor1, d);
			long result = (n >> 1) * bestValueFor2;
			result += (n % 2) * bestValueFor1;
			out.println(result);
		}

		public void solveB(InputReader in, PrintWriter out) {
			char[] a = in.next().toCharArray();
			long[] count = new long[26];
			for (char c : a) {
				count[c - 'a']++;
			}
			long result = ((a.length * (a.length - 1)) >> 1) + 1;
			for (long c : count) {
				result -= (c * (c - 1)) >> 1;
			}
			out.println(result);
		}

		public void solveC(InputReader in, PrintWriter out) {

		}

		public void solveD(InputReader in, PrintWriter out) {

		}

		public void solveE(InputReader in, PrintWriter out) {

		}

		public void solveF(InputReader in, PrintWriter out) {

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

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextFloat() {
			return Double.parseDouble(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}
}
