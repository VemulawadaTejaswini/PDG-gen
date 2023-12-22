import java.io.*;
import java.util.*;
import java.util.function.*;

class WeightedEdge {
	int from;
	int to;
	int weight;

	WeightedEdge(int from, int to, int weight){
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		List<Queue<WeightedEdge>> edges = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			edges.add(new ArrayDeque<>());
		}
		for (int i = 0; i < N - 1; i++) {
			int u = Integer.parseInt(sc.get()) - 1;
			int v = Integer.parseInt(sc.get()) - 1;
			int w = Integer.parseInt(sc.get());
			edges.get(u).add(new WeightedEdge(u, v, w));
			edges.get(v).add(new WeightedEdge(v, u, w));
		}

		BitSet black = new BitSet();
		dfs(new BitSet(), black, 0, edges);
		StringJoiner joiner = new StringJoiner("\n");
		for (int i = 0; i < N; i++) {
			joiner.add(black.get(i) ? "1" : "0");
		}
		System.out.println(joiner.toString());
	}

	void dfs(BitSet visited, BitSet black, int start, List<? extends Queue<WeightedEdge>> ki) {
		if (visited.get(start)) return;
		visited.set(start);
		Queue<WeightedEdge> edges = ki.get(start);
		while (!edges.isEmpty()) {
			WeightedEdge w = edges.remove();
			if (w == null || w.weight <= 0) {
				continue;
			}
			if (w.weight % 2 == 0) {
				black.set(w.to, black.get(start));
			} else {
				black.set(w.to, !black.get(start));
			}
			dfs(visited,black, w.to, ki);
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