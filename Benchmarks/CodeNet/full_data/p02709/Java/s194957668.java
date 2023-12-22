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

	long happiness(long moveTo) {
		return a * Math.abs(moveTo - x);
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

		Arrays.sort(children, Comparator.comparingInt(c -> -c.a));

		var memo = new long[N + 1][N + 1];
		for (int placed = 0; placed < N; placed++) {
			for (int left = 0; left <= placed; left++) {
				var prev = memo[placed][left];
				var next = children[placed];

				var right = N - 1 - (placed - left);

				memo[placed + 1][left] = Math.max(memo[placed + 1][left], prev + next.happiness(right));
				memo[placed + 1][left + 1] = Math.max(memo[placed + 1][left + 1], prev + next.happiness(left));
			}
		}

		long max = 0;

		for (long l : memo[N]) {
			max = Math.max(max, l);
		}

		System.out.println(max);
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