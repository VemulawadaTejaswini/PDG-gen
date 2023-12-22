import java.lang.reflect.Array;
import java.util.Scanner;

@FunctionalInterface
interface ObjIntPredicate<T> {
	boolean test(T t, int value);
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] X = new int[N];
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		int nonNeg = binarySearch(X, (a, i) -> a[i] >= 0);
		if (nonNeg == 0) {
			System.out.println(X[K - 1]);
			return;
		} else if (nonNeg == N) {
			System.out.println(X[N - K + 1]);
			return;
		}
		int minCost = Integer.MAX_VALUE;
		for (int offset = 0; offset <= nonNeg; offset++) {
			int to = offset + K - 1;
			if (to >= N) break;
			if (X[nonNeg] == 0 ? to < nonNeg : to < nonNeg - 1) continue;
			int plusCost = X[to];
			int minusCost = Math.abs(X[offset]);
			int twicePlus = plusCost * 2 + minusCost;
			int twiceMinus = minusCost * 2 + plusCost;
			int cost = Math.min(twiceMinus, twicePlus);
			minCost = Math.min(cost, minCost);
		}
		System.out.println(minCost);
	}

	<T> int binarySearch(T array, ObjIntPredicate<T> predicate) {
		int l = -1;
		int r = Array.getLength(array);
		while (r - l > 1) {
			int bound = l + (r - l) / 2;
			if (predicate.test(array, bound)) r = bound;
			else l = bound;
		}
		return r;
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}