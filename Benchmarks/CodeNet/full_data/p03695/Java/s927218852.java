import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

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
			int n = in.nextInt();
			int[] a = new int[n];
			HashSet<String> set = new HashSet<String>();
			int count = 0;
			for (int i = 0; i < n; i++) {
				int rate = in.nextInt();
				if (rate <= 399) {
					set.add("灰");
				} else if (rate <= 799) {
					set.add("茶");
				} else if (rate <= 1199) {
					set.add("緑");
				} else if (rate <= 1599) {
					set.add("水");
				} else if (rate <= 1999) {
					set.add("青");
				} else if (rate <= 2399) {
					set.add("黄");
				} else if (rate <= 2799) {
					set.add("橙");
				} else if (rate <= 3199) {
					set.add("赤");
				} else {
					count++;
				}
			}
			if (set.size() + count > 12) {
				out.println(set.size() + " " + (set.size() + count));
			} else {
				if (set.size() == 0) {
					out.println(1 + " " + (set.size() + count));
				} else {
					out.println(set.size() + " " + (set.size() + count));
				}

			}
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
