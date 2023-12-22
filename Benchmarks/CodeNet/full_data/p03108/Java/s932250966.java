import java.io.*;
import java.util.*;
import java.util.function.*;

final class Pair {
	int a, b;

	Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class UnionFind {
	int[] parent;

	UnionFind(int size) {
		parent = new int[size];
		Arrays.fill(parent, -1);
	}

	int find(int i) {
		if (parent[i] < 0) return i;
		return parent[i] = find(parent[i]);
	}

	int size(int i) {
		return -parent[find(i)];
	}

	boolean same(int i, int j) {
		return find(i) == find(j);
	}

	boolean union(int i, int j) {
		i = find(i);
		j = find(j);
		if (i == j) return false;
		if (size(i) < size(j)) {
			int temp = i;
			i = j;
			j = temp;
		}

		parent[i] += parent[j];
		parent[j] = i;
		return true;
	}
}

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());

		Pair[] pairs = new Pair[M];
		for (int i = 0; i < M; i++) {
			int A = Integer.parseInt(sc.get()) - 1;
			int B = Integer.parseInt(sc.get()) - 1;
			pairs[i] = new Pair(A, B);
		}


		UnionFind uf = new UnionFind(N);
		long[] unhappiness = new long[M];
		unhappiness[M - 1] = N * (N - 1L) / 2;
		for (int i = pairs.length - 1; i > 0; i--) {
			Pair pair = pairs[i];
			if (uf.same(pair.a, pair.b)) {
				unhappiness[i - 1] = unhappiness[i];
				continue;
			}

			unhappiness[i - 1] = unhappiness[i] - (long) uf.size(pair.a) * uf.size(pair.b);
			uf.union(pair.a, pair.b);
		}
		for (long l : unhappiness) {
			System.out.println(l);
		}
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		new Solver().solve(new Supplier<String>() {
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
		System.out.flush();
	}
}