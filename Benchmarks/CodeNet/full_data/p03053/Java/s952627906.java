import java.io.*;
import java.util.*;
import java.util.function.*;

class Cost<T> implements Comparable<Cost<T>>{
	int cost;
	T thing;

	Cost(int cost, T thing) {
		this.cost = cost;
		this.thing = thing;
	}

	public int compareTo(Cost<T> o) {
		return Comparator.comparingInt((Cost<T> c) -> c.cost).compare(this, o);
	}
}

class Pair {
	int x, y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pair pair = (Pair) o;
		return x == pair.x &&
				y == pair.y;
	}

	public int hashCode() {
		return Objects.hash(x, y);
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int H = Integer.parseInt(sc.get());
		int W = Integer.parseInt(sc.get());

		Set<Pair> black = new HashSet<>();
		Queue<Cost<Pair>> queue = new ArrayDeque<>();
		for (int i = 0; i < H; i++) {
			char[] data = sc.get().toCharArray();
			for (int j = 0; j < W; j++) {
				if (data[j] == '#') {
					Pair pair = new Pair(i, j);
					black.add(pair);
					queue.add(new Cost<>(0, pair));
				}
			}
		}

		int[] vx = {1,0,-1,0};
		int[] vy = {0,1,0,-1};

		int max = 0;

		while (!queue.isEmpty()) {
			Cost<Pair> next = queue.remove();
			max = Math.max(max, next.cost);
			for (int i = 0; i < 4; i++) {
				int x = next.thing.x + vx[i];
				int y = next.thing.y + vy[i];
				if (x < 0 || x >= W || y < 0 || y >= H) continue;
				Pair pair = new Pair(x, y);
				if (black.contains(pair)) continue;
				queue.add(new Cost<>(next.cost + 1, pair));
				black.add(pair);
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
				try {
					return (line = line != null && line.hasMoreTokens() ? line : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		});
	}
}