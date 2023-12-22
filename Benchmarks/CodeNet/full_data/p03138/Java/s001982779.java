import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		long K = Long.parseLong(sc.get());
		long[] A = new long[N];
		Arrays.setAll(A, $ -> Long.parseLong(sc.get()));

		long x = 0;
		for (int i = 1; i <= K; i <<= 1) {
			int count = 0;
			for (long l : A) {
				if ((l & i) > 0) {
					count += 1;
				}
			}
			if (count < -Math.floorDiv(-N, 2)) {
				x |= i;
			}
		}
		System.out.println(func(x, A));
	}

	long func(long x, long[] a) {
		long sum = 0;
		for (long l : a) {
			sum += x ^ l;
		}
		return sum;
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
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
		System.out.flush();
	}
}