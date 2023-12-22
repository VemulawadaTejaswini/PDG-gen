
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		inputStream = new FileInputStream(new File("/workspace/Atcoder/arc/arc063/random_01.txt"));

		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 29;
	static int modP = 1000000007;

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = in.nextInt();
			int t = in.nextInt();
			int[] a = in.nextIntArray(n);

			int min = INF;
			int max = -1;
			int profit = 0;
			Set<Long> list = new HashSet<>();

			int maxProfit = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] < min) {
					min = a[i];
					max = a[i];
				}
				if (max < a[i]) {
					max = a[i];
				}
				maxProfit = Math.max(maxProfit, max-min);
			}

			min = INF;
			max = -1;
			for (int i = 0; i < n; i++) {
				if (a[i] < min) {
					min = a[i];
					max = a[i];
				}
				if (max < a[i]) {
					max = a[i];
				}
				if (max-min == maxProfit) {
					list.add((long)min<<32 | max);
				}
			}

			out.println(list.size());

		}
	}
	static class P {
		int a, b;
		P (int a, int b) {
			this.a = a;
			this.b = b;
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
