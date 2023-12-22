import java.io.*;
import java.util.*;
import java.util.function.*;

class Child {
	Child(int x, int a) {
		this.x = x;
		this.a = a;
	}

	int x;
	int a;

	long happiness(long y) {
		return a * Math.abs(y - x);
	}

	static Comparator<Child> comparator(long y) {
		return Comparator.comparingLong(c -> c.happiness(y));
	}

	public String toString() {
		return new StringJoiner(", ", Child.class.getSimpleName() + "[", "]")
				.add("x=" + x)
				.add("a=" + a)
				.toString();
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));

		Child[] children = new Child[N];
		for (int i = 0; i < children.length; i++) {
			children[i] = new Child(i, A[i]);
		}

		for (int y = 0; y < N / 2; y++) {
			Arrays.sort(children, y, N / 2, Child.comparator(N - 1 - y).reversed());
			Arrays.sort(children, N / 2, N - y, Child.comparator(y));
		}

		long sum = 0;
		for (int y = 0; y < N; y++) {
			sum += Math.max(children[y].happiness(y), children[y].happiness(N - 1 - y));
		}

		System.out.println(sum);
	}
}

class Main {
	public static void main(String... args) {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<>() {
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