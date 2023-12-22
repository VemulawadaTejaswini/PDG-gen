import java.io.*;
import java.util.*;
import java.util.function.*;

class Pair {
	int a, b;

	Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		int[] A = new int[M];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		int[] num = {-1, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		Pair[] usable = new Pair[M];
		for (int i = 0; i < M; i++) {
			usable[i] = new Pair(A[i], num[A[i]]);
		}
		Arrays.sort(usable, Comparator.comparingInt((Pair p) -> p.b).thenComparingInt(p -> p.a));
		TreeMap<Integer, Integer> higher = new TreeMap<>();
		for (Pair pair : usable) {
			higher.put(pair.b, pair.a);
		}

		final String INF = String.valueOf((char) 0);
		String[] maxNum = new String[N + 1];
		Arrays.fill(maxNum, INF);
		maxNum[0] = "";
		for (int i = 2; i <= N; i++) {

			for (Map.Entry<Integer, Integer> entry = higher.floorEntry(i);
				 entry != null;
				 entry = higher.lowerEntry(entry.getKey())) {
				String base = maxNum[i - entry.getKey()];
				if (base == INF) continue;
				String candidate = base + entry.getValue();
				if (numeroComp.compare(maxNum[i], candidate) > 0) maxNum[i] = candidate;
			}
		}
		System.out.println(maxNum[N]);
	}

	Comparator<String> numeroComp = Comparator.comparingInt(String::length).thenComparing(s -> s).reversed();
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