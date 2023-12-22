import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int[] L = new int[N];
		Arrays.setAll(L, $ -> Integer.parseInt(sc.get()));
		Arrays.sort(L);

		int sum = 0;
		for (int i = 0; i < L.length; i++) {
			for (int j = i + 1; j < L.length; j++) {
				int a = L[i];
				int b = L[j];
				int upper = maximum(k -> k < a + b, L);
				int lower = Math.max(minimum(k -> a - b < k, L), minimum(k -> b - a < k, L));
				int result = upper - lower + 1;
				if (lower <= i && i <= upper) result -= 1;
				if (lower <= j && j <= upper) result -= 1;
				sum += Math.max(0, result);
			}
		}
		System.out.println(sum / 3);
	}

	int minimum(IntPredicate predicate, int[] array){
		int l = -1;
		int r = array.length;
		while (Math.abs(r - l) > 1) {
			int mid = (l + r) / 2;
			if (predicate.test(array[mid])) r = mid;
			else l = mid;
		}
		return r;
	}

	int maximum(IntPredicate predicate, int[] array){
		int l = array.length;
		int r = -1;
		while (Math.abs(r - l) > 1) {
			int mid = (l + r) / 2;
			if (predicate.test(array[mid])) r = mid;
			else l = mid;
		}
		return r;
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
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