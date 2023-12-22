import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		FastScanner scan = new FastScanner(System.in);
		final String S = scan.next();
		final int l = S.length();

		int numberL = 0;
		int numberR = 0;
		char previous = 'R';
		Integer[] ans = new Integer[l];
		for (int i = 0; i < l; i++) {
			ans[i] = 0;
		}
		for (int i = 0; i < l - 1; i++) {
			if (S.charAt(i) == 'R') {
				if (previous == 'R') {
					numberR++;
				} else {
					ans[i - numberL - 1] += (numberL - (numberL % 2)) / 2;
					ans[i - numberL] += (numberL + (numberL % 2)) / 2;
					numberL = 0;
					numberR++;
					previous = 'R';
				}
			} else {
				if (previous == 'L') {
					ans[i] = 0;
					numberL++;
				} else {
					ans[i - 1] += (numberR + (numberR % 2)) / 2;
					ans[i] += (numberR - (numberR % 2)) / 2;
					numberR = 0;
					numberL++;
					previous = 'L';
				}
			}
		}
		if (previous == 'L') {
			numberL++;
			ans[l - 1] = 0;
			ans[(l - 1) - numberL] += (numberL - (numberL % 2)) / 2;
			ans[(l - 1) - numberL + 1] += (numberL + (numberL % 2)) / 2;
		} else {
			ans[l - 2] += (numberR + (numberR % 2)) / 2;
			ans[l - 1] = (numberR - (numberR % 2)) / 2 + 1;
		}

		String output = Arrays.asList(ans).stream()
				.map(n -> String.valueOf(n))
				.collect(Collectors.joining(" "));
		System.out.println(output);

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

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
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
