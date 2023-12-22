import java.io.*;
import java.util.*;
import java.util.function.*;


final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[][] ki = new int[N][N];
		for (int i = 0; i < N - 1; i++) {
			int u = Integer.parseInt(sc.get()) - 1;
			int v = Integer.parseInt(sc.get()) - 1;
			int w = Integer.parseInt(sc.get());
			ki[u][v] = ki[v][u] = w;
		}
		BitSet black = new BitSet();
		black.set(1);
		dfs(new BitSet(), black, 0, ki);
		StringJoiner joiner = new StringJoiner("\n");
		for (int i = 0; i < N; i++) {
			joiner.add(black.get(i) ? "1" : "0");
		}
		System.out.println(joiner.toString());
	}

	void dfs(BitSet visited, BitSet black, int start, int[][] ki) {
		if (visited.get(start)) return;
		visited.set(start);
		for (int i = 0; i < ki[start].length; i++) {
			int w = ki[start][i];
			if (w <= 0) {
				continue;
			}
			if (w % 2 == 0) {
				black.set(i, black.get(start));
			} else {
				black.set(i, !black.get(start));
			}
			dfs(visited,black, i, ki);
		}
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