import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int P = Integer.parseInt(sc.get());
		int odd = 0;
		int even = 0;
		for (int i = 0; i < N; i++) {
			int A = Integer.parseInt(sc.get());
			if ((A & 1) == 0) even += 1;
			else odd += 1;
		}
		if (odd == 0 && P == 1){
			System.out.println(0);
			return;
		}
		long ans = (1L << even) * Math.max(1L << (odd - 1), 0);
		System.out.println(ans);
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			StringTokenizer line;

			public String get() {
				try {
					return (line = line != null && line.hasMoreTokens() ? line : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		});
	}
}