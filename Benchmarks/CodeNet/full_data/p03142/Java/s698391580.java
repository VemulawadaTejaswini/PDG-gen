import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		int[][] graph = new int[N][];
		int root;
		{
			BitSet child = new BitSet(N);
			IntStream.Builder[] builder = new IntStream.Builder[N];
			Arrays.setAll(builder, $ -> IntStream.builder());
			for (int i = 0; i < N - 1 + M; i++) {
				int A = Integer.parseInt(sc.get()) - 1;
				int B = Integer.parseInt(sc.get()) - 1;
				builder[A].add(B);
				child.set(B);
			}
			Arrays.setAll(graph, i -> builder[i].build().toArray());
			root = child.nextClearBit(0);
		}

		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(root);
		int[] parent = new int[N];
		while (!queue.isEmpty()) {
			int remove = queue.remove();
			for (int x : graph[remove]) {
				parent[x] = remove;
				queue.add(x);
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