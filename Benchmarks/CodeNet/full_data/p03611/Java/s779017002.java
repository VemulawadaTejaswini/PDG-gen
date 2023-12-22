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
import java.util.Optional;
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
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				int tmp = in.nextInt();
				if (map.containsKey(tmp)) {
					int current = map.get(tmp);
					map.put(tmp, current + 1);
				} else {
					map.put(tmp, 1);
				}
				int plus = tmp + 1;
				if (map.containsKey(plus)) {
					int current = map.get(plus);
					map.put(plus, current + 1);
				} else {
					map.put(plus, 1);
				}
				int minus = tmp - 1;
				if (map.containsKey(minus)) {
					int current = map.get(minus);
					map.put(minus, current + 1);
				} else {
					map.put(minus, 1);
				}
			}

			out.println(maxUsingStreamAndLambda(map));
		}
	}

	static <K, V extends Comparable<V>> V maxUsingStreamAndLambda(Map<K, V> map) {
		Optional<Entry<K, V>> maxEntry = map.entrySet().stream()
				.max((Entry<K, V> e1, Entry<K, V> e2) -> e1.getValue().compareTo(e2.getValue()));

		return maxEntry.get().getValue();
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
