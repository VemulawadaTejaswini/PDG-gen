import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main{ // 

	public static void main(String args[]) {
		ConsoleScanner cin = new ConsoleScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	static long now() {
		return System.currentTimeMillis();
	}

	static void trace(Object... objects) {
		assert null != System.out.format("trace:%s\n", Arrays.deepToString(objects));
	}

	private static void solve(ConsoleScanner cin, PrintWriter cout) {
		// assert solve(1) == 1;

		int n = cin.nextInt();

		int[] p = new int[n];
		for (int i = 0; i < p.length; i++)
			p[i] = cin.nextInt();

		long start = now();

		int[] ans = solve(n, p);
		String ansstr = Arrays.stream(ans).mapToObj(Objects::toString).collect(Collectors.joining(" "));
		cout.println(ansstr);

		trace("elapsed", now() - start);
	}

	private static int[] solve(int n, int[] p) {
		int[] pos = new int[n + 1];
		for (int i = 0; i < n; i++)
			pos[p[i]] = i;

		Comparator<int[]> lexico = (p1, p2) -> {
			for (int i = 0; i < p1.length; i++)
				if (p1[i] != p2[i])
					return Integer.compare(p1[i], p2[i]);
			return 0;
		};
		int[] infPair = { Integer.MAX_VALUE, Integer.MAX_VALUE };

		Function<int[], Deque<int[]>> divideAndConquer = new Function<int[], Deque<int[]>>() {

			@Override
			public Deque<int[]> apply(int[] t) {
				int l = t[0];
				int r = t[1];

				Deque<int[]> ans = new ArrayDeque<>();

				if (l + 1 >= r)
					return ans;

				// 1組を選ぶ。{偶数位置の最小, それより右の奇数位置の最小}
				int mnEven = Integer.MAX_VALUE;
				for (int i = l; i < r; i += 2)
					mnEven = Math.min(mnEven, p[i]);
				int mid1 = pos[mnEven];
				int mnOdd = Integer.MAX_VALUE;
				for (int i = mid1 + 1; i < r; i += 2)
					mnOdd = Math.min(mnOdd, p[i]);
				int mid2 = pos[mnOdd];
				ans.add(new int[] { mnEven, mnOdd });

				if (l + 2 == r)
					return ans;

				// 上で選んだ1組で、配列が三分割される。部分問題を解いてマージ
				List<Deque<int[]>> subanses = new ArrayList<>();
				Deque<int[]> subans;
				subans = this.apply(new int[] { l, mid1 });
				subanses.add(subans);
				subans = this.apply(new int[] { mid1 + 1, mid2 });
				subanses.add(subans);
				subans = this.apply(new int[] { mid2 + 1, r });
				subanses.add(subans);
				int sz = subanses.stream().mapToInt(sa -> sa.size()).sum();
				for (int i = 0; i < sz; i++) {
					int[] minp = infPair;
					for (Deque<int[]> sa : subanses)
						if (sa.size() > 0 && lexico.compare(minp, sa.peekFirst()) > 0)
							minp = sa.peekFirst();
					for (Deque<int[]> sa : subanses)
						if (sa.size() > 0 && lexico.compare(minp, sa.peekFirst()) == 0)
							minp = sa.removeFirst();
					ans.addLast(minp);
				}
				// trace(t);
				// trace(ans.toArray(new int[0][]));
				return ans;
			}

		};
		Deque<int[]> pairs = divideAndConquer.apply(new int[] { 0, n });
		int[] ans = new int[n];
		for (int i = 0; i < n; i += 2) {
			int[] pair = pairs.removeFirst();
			ans[i] = pair[0];
			ans[i + 1] = pair[1];
		}
		return ans;
	}

	static class ConsoleScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			try {
				while (!st.hasMoreElements())
					st = new StringTokenizer(br.readLine());
				return st.nextToken();
			} catch (IOException e) {
				throw new AssertionError(e);
			}
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
