import java.io.InputStream;
import java.io.PrintStream;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Scanner;

class Pair<L, R> extends AbstractMap.SimpleEntry<L, R> {
	public Pair(L l, R r) {
		super(l, r);
	}
}

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	HashMap<Pair<Integer, Integer>, Integer> memo = new HashMap<>();

	int rec(int i, int j) { // i以降でj以下の重さの場合の最大のv
		Pair<Integer, Integer> memoKey = new Pair<>(i, j);

		Integer result = memo.get(memoKey);

		if (result != null) {
			return result;
		}

		if (i == N) {
			return 0;
		}

		if (j < w[i]) {
			result = rec(i + 1, j);
		} else {
			result = Math.max(
					rec(i + 1, j),
					rec(i + 1, j - w[i]) + v[i]);
		}

		memo.put(memoKey, result);
		return result;

	}

	int[] w, v;
	int N, W;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		W = sc.nextInt();

		w = new int[N];
		v = new int[N];

		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}

		out.println(rec(0, W));

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
