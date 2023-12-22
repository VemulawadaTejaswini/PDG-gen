import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		Integer[] V = new Integer[N];
		Arrays.setAll(V, $ -> Integer.parseInt(sc.get()));
		List<Integer> view = Arrays.asList(V);

		int ops = Math.min(N, K);

		int max = 0;
		for (int f = 0; f <= ops; f++) {
			for (int l = 0; l <= ops - f; l++) {
				PriorityQueue<Integer> jewel = new PriorityQueue<>(view.subList(0, f));
				jewel.addAll(view.subList(N - l, N));
				int sum = 0;
				for (int r = 0; !jewel.isEmpty(); r++) {
					int next = jewel.remove();
					if (r < K - (f + l) && next < 0) continue;
					sum += next;
				}
				max = Math.max(max, sum);
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