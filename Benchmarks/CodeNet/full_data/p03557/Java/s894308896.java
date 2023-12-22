import java.io.*;
import java.util.*;

import static java.lang.Math.*;
import java.math.BigInteger;

@SuppressWarnings("unchecked")
public class Main {

	static boolean fileIO = false;
	static boolean DEBUG = false;



	final static int INF = 0x7FFFFFFF;
	final static int MOD = (int)(1 << 30);
	final static int EPS = (int)1e6;

	final static String input = "input.txt";
	final static String output = "output.txt";

	public static void main(String args[]) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		if (fileIO) {
			is = new FileInputStream(input);
			os = new FileOutputStream(output);
		} else {
			is = System.in;
			os = System.out;
		}
		InputReader in = new InputReader(is);
		PrintWriter out = new PrintWriter(os);
		new Task_C().solve(in, out);
		out.close();
	}


	static class Task_A {

		public void solve(InputReader in, PrintWriter out) {
			int a[][] = new int[2][3];
			char row1[] = in.nextString().toCharArray();
			char row2[] = in.nextString().toCharArray();
			for (int j = 0; j < 3; ++j) {
				a[0][j] = row1[j];
				a[1][j] = row2[j];
			}
			int b[][] = new int[2][3];
			b[1][1] = a[0][1];
			b[0][1] = a[1][1];
			b[1][2] = a[0][0];
			b[0][0] = a[1][2];
			b[1][0] = a[0][2];
			b[0][2] = a[1][0];
			boolean ans = true;
			for (int i = 0; i < 2; ++i) {
				for (int j = 0; j < 3; ++j) {
					if (a[i][j] != b[i][j]) {
						ans = false;
					}
				}
			}
			out.println(ans ? "YES" : "NO");
		}
	}

	static class Task_B {

		public void solve(InputReader in, PrintWriter out) {
			int n = in.nextInt();
			int ans = 1;
			for (int i = 1; i * i <= n; ++i) {
				ans = i * i;
			}
			out.println(ans);
		}
	}

	static class Task_C {

		int pos_a[];
		int pos_b[];
		long suf_b[];


		private int higher(Integer array[], int key) {
			int lo = 0, hi = array.length - 1;
			while (lo <= hi) {
				int m = (lo + hi) >> 1;
				if (array[m] >= key) {
					hi = m - 1;
				} else {
					lo = m + 1;
				}
			}
			return hi + 1;
		}


		public void solve(InputReader in, PrintWriter out) {
			int n = in.nextInt();
			Integer a[] = in.nextIntArray(n);
			Integer b[] = in.nextIntArray(n);
			Integer c[] = in.nextIntArray(n);
			Arrays.sort(a);
			Arrays.sort(b);
			Arrays.sort(c);
			pos_a = new int[n];
			pos_b = new int[n];
			suf_b = new long[n];
			for (int i = 0; i < n; ++i) {
				pos_a[i] = higher(b, a[i] + 1);
				pos_b[i] = higher(c, b[i] + 1);
				if (DEBUG) {
					System.out.println("pos_a[" + i + "] = " + pos_a[i]);
					System.out.println("pos_b[" + i + "] = " + pos_b[i]);
				}
			}
			suf_b[n - 1] = (n - pos_b[n - 1]);
			for (int i = n - 2; i >= 0; --i) {
				suf_b[i] = suf_b[i + 1] + (n - pos_b[i]);
			}
			if (DEBUG) {
				for (int i = 0; i < n; ++i) {
					System.out.println("sum_f[" + i + "] = " + suf_b[i]);
				}
			}
			BigInteger sum = BigInteger.valueOf(0);
			for (int i = 0; i < n; ++i) {
				long tmp = 0;
				if (pos_a[i] < n) {
					tmp = suf_b[ pos_a[i] ];
				}
				sum = sum.add(BigInteger.valueOf(tmp));
			}
			out.println(sum);
		}
	}

	static class Task_D {

		public void solve(InputReader in, PrintWriter out) {
			int n = in.nextInt();
			int ans = INF;
			for (int m = 1; m <= 9; ++m) {
				int cur = n * m;
				int can = 0;
				while (cur > 0) {
					can += cur % 10;
					cur /= 10;
				}
				ans = Math.min(ans, can);
			}
			out.println(ans);
		}
	}




	static class InputReader {

		private StringTokenizer tokenizer;
		private BufferedReader reader;

		public InputReader(InputStream is) {
			tokenizer = null;
			reader = new BufferedReader(new InputStreamReader(is), 32768);

		}

		public String nextString() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					String line = reader.readLine();
					if (line == null) return null;
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public String nextLine() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					String line = reader.readLine();
					if (line == null) return null;
					tokenizer = new StringTokenizer(line, "\n");
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public Integer nextInt() { return Integer.parseInt(nextString()); }
		public Integer[] nextIntArray(int n) {
			Integer ret[] = new Integer[n];
			int i = 0;
			while (n-- > 0) ret[i++] = nextInt();
			return ret;
		}
		public Long nextLong() { return Long.parseLong(nextString()); }
		public Long[] nextLongArray(int n) {
			Long ret[] = new Long[n];
			int i = 0;
			while (n-- > 0) ret[i++] = nextLong();
			return ret;
		}
	}
}