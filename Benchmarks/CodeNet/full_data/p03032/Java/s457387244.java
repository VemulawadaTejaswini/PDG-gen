import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		int[] V = new int[N];
		Arrays.setAll(V, $ -> Integer.parseInt(sc.get()));
		int ops = Math.min(N, K);

		PriorityQueue<Integer> jewel = new PriorityQueue<>();
		int max = 0;
		for (int f = 0; f <= ops; f++) {
			jewel.clear();
			for (int i = 0; i < f; i++) {
				jewel.add(V[i]);
			}
			for (int l = 0; l <= ops - f; l++) {
				int sum = 0;
				Iterator<Integer> iterator = jewel.iterator();
				for (int r = 0; iterator.hasNext(); r++) {
					int next = iterator.next();
					if (r < K - (f + l) && next < 0) continue;
					sum += next;
				}
				max = Math.max(max, sum);
				if (N - 1 - l >= 0) jewel.add(V[N - 1 - l]);
			}
		}
		System.out.println(max);
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