import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int X = Integer.parseInt(sc.get());
		int Y = Integer.parseInt(sc.get());
		if (X > Y) {
			int result = Math.abs(Y + X) + 1;
			if (0 > X) {
				System.out.println(Math.min(X - Y + 2, result));
			} else if (0 > Y) {
				System.out.println(Math.min(-Y - X + 1, result));
			} else {
				System.out.println(Y + X + 1);
			}
		} else {
			System.out.println(Y - X);
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