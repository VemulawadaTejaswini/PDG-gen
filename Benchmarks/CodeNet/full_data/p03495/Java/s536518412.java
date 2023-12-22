import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		FastScanner scanner = new FastScanner(System.in);
		PrintWriter printWriter = new PrintWriter(System.out);

		int size = (int) scanner.nextInt();
		int kinds = (int) scanner.nextInt();

		int[] numsArr = scanner.nextIntArray(size);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numsArr.length; i++) {
			if (!map.containsKey(numsArr[i])) {
				map.put(numsArr[i], 1);
			} else {
				map.put(numsArr[i], map.get(numsArr[i]) + 1);
			}
		}

		int difference = map.size() - kinds;
		if (difference <= 0) {
			printWriter.printf("%d\n", 0);
		}else{
			Object[] arr = map.values().toArray();
			Arrays.sort(arr);
			int sum = 0;
			for (int i = 0; i < difference; i++) {
				int tmp = (int) arr[i];
				sum +=tmp;
			}
			printWriter.printf("%d\n", sum);
		}
		printWriter.close();
	}

	static class FastScanner {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;

		public FastScanner(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
			tokenizer = null;
		}

		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public String nextLine() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					return reader.readLine();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}

			return tokenizer.nextToken("\n");
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public long nextInt() {
			return Integer.parseInt(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = (int) nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
	}
}
