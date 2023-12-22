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

		long[] ef = new long[40];
		long up = 0;
		for (int i = 0; i < 40; i += 1) {
			int bit = 1 << i;
			if (bit > K) break;
			long count = 0;
			for (long l : A) {
				if ((l & bit) > 0) {
					count += 1;
				}
			}
			long ud = (N - count) * bit - count * bit;
			if (ud > 0) {
				up |= bit;
				ef[i] = ud;
			}
		}

		long max = 0;
		for (int i = 0; i < 40; i++) {
			long bit = 1L << i;
			if ((K & bit) == 0) continue;
			long mask = -1L << i;
			long actualValue = ((K & mask) & up) | (up & ~mask);
			actualValue &= ~bit;
			long sum = 0;
			for (int j = 0; j < 40; j++) {
				if ((actualValue & (1L<<j)) == 0) continue;
				sum += ef[j];
			}
			max = Math.max(max, sum);
		}

		for (long l : A) {
			max += l;
		}

		System.out.println(max);
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
