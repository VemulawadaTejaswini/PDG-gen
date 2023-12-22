import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		List<Set<Integer>> graph = new ArrayList<>();
		List<Set<Integer>> reversed = new ArrayList<>();
		int root;
		{
			BitSet child = new BitSet(N);
			for (int i = 0; i < N; i++) {
				graph.add(new HashSet<>());
				reversed.add(new HashSet<>());
			}
			for (int i = 0; i < N - 1 + M; i++) {
				int A = Integer.parseInt(sc.get()) - 1;
				int B = Integer.parseInt(sc.get()) - 1;

				graph.get(A).add(B);
				reversed.get(B).add(A);

				child.set(B);
			}
			root = child.nextClearBit(0);
		}

		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(root);
		int[] parent = new int[N];
		while (!queue.isEmpty()) {
			int remove = queue.remove();
			Set<Integer> children = graph.get(remove);
			for (Integer child : children) {
				reversed.get(child).remove(remove);
				if (!reversed.get(child).isEmpty()) continue;
				parent[child] = remove;
				queue.add(child);
			}
		}
		parent[root] = -1;
		for (int i : parent) {
			System.out.println(i + 1);
		}
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