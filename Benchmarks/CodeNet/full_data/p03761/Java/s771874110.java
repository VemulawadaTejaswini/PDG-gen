import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		String[] S = new String[N];
		Arrays.setAll(S, $ -> sc.get());
		int[] min = new int['z' - 'a' + 1];
		Arrays.fill(min, Integer.MAX_VALUE);
		for (String s : S) {
			int[] count = new int['z' - 'a' + 1];
			char[] chars = s.toCharArray();
			for (char ch : chars) {
				count[ch - 'a'] += 1;
			}
			for (int i = 0; i < 'z' - 'a' + 1; i++) {
				min[i] = Math.min(min[i], count[i]);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 'z' - 'a' + 1; i++) {
			char c = (char) (i + 'a');
			for (int j = 0; j < min[i]; j++) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			private StringTokenizer tokenizer;

			public String get() {
				try {
					return (tokenizer = tokenizer != null && tokenizer.hasMoreTokens() ? tokenizer : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		});
	}
}