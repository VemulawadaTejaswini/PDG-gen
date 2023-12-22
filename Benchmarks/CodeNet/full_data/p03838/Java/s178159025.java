import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int X = Integer.parseInt(sc.get());
		int Y = Integer.parseInt(sc.get());
		int[] ints = {
				Y < X ? Integer.MAX_VALUE : Y - X,
				-Y < X ? Integer.MAX_VALUE : -Y - X + 1,
				Y < -X ? Integer.MAX_VALUE : Y - (-X) + 1,
				-Y < -X ? Integer.MAX_VALUE : (-Y) - (-X) + 2
		};
		Arrays.sort(ints);
		for (int x : ints) {
			if (x >= 0) {
				System.out.println(x);
				return;
			}
		}
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
