import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		BitSet[] S = new BitSet[M];
		for (int i = 0; i < M; i++) {
			int K = Integer.parseInt(sc.get());
			BitSet bs = S[i] = new BitSet();
			for (int j = 0; j < K; j++) {
				bs.set(Integer.parseInt(sc.get()) - 1);
			}
		}
		int[] P = new int[M];
		Arrays.setAll(P, $ -> Integer.parseInt(sc.get()));

		int count = 0;
		for (int i = 0; i < 1 << N; i++) {
			BitSet on = BitSet.valueOf(new long[]{i});
			int valve = 0;
			for (int j = 0; j < S.length; j++) {
				BitSet result = new BitSet();
				result.or(S[j]);
				result.and(on);
				if ((result.cardinality() % 2) == P[j]) valve += 1;
			}
			if (valve == M) count += 1;
		}
		System.out.println(count);
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			StringTokenizer line;

			public String get() {
				while (line == null || !line.hasMoreTokens()) try {
					line = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
				return line.nextToken();
			}
		});
	}
}