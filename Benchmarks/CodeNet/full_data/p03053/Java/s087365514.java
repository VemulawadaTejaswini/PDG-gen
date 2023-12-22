import java.io.*;
import java.util.*;
import java.util.function.*;

class Cost<T> {
	int cost;
	T thing;

	Cost(int cost, T thing) {
		this.cost = cost;
		this.thing = thing;
	}
}

class Pair {
	int x, y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int H = Integer.parseInt(sc.get());
		int W = Integer.parseInt(sc.get());

		BitSet[] black = new BitSet[H];
		Arrays.setAll(black, $ -> new BitSet(W+1));
		Queue<Cost<Pair>> queue = new ArrayDeque<>();
		for (int i = 0; i < H; i++) {
			char[] data = sc.get().toCharArray();
			for (int j = 0; j < W; j++) {
				if (data[j] == '#') {
					Pair pair = new Pair(i, j);
					black[i].set(j);
					queue.add(new Cost<>(0, pair));
				}
			}
		}

		int max = 0;

		while (!queue.isEmpty()) {
			Cost<Pair> next = queue.remove();
			max = Math.max(max, next.cost);
			int x = next.thing.x;
			int y = next.thing.y;
			int cost = next.cost + 1;
			if (x < H - 1) enqueue(x + 1, y, cost, black, queue);
			if (0 < x) enqueue(x - 1, y, cost, black, queue);
			if (y < H - 1) enqueue(x, y + 1, cost, black, queue);
			if (0 < y) enqueue(x, y - 1, cost, black, queue);
		}

		System.out.println(max);
	}

	void enqueue(int x, int y, int cost, BitSet[] black, Queue<Cost<Pair>> queue) {
		Pair pair = new Pair(x, y);
		if (black[y].get(x)) return;
		queue.add(new Cost<>(cost, pair));
		black[y].set(x);
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