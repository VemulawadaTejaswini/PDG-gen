import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.function.LongSupplier;
import java.util.function.ToIntBiFunction;
import java.util.stream.Collectors;

public class Main{ // 

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

	static LongSupplier now = new LongSupplier() {
		private long t = System.currentTimeMillis();

		@Override
		public long getAsLong() {
			long a = t;
			t = System.currentTimeMillis();
			long ans = t - a;
			return ans;
		}
	};

	public static void main(String args[]) {
		ConsoleScanner cin = new ConsoleScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	static int tr(Object... objects) {
		System.out.println("tr:" + Arrays.deepToString(objects));
		return 0;
	}

	private static void solve(ConsoleScanner cin, PrintWriter cout) {
		// assert solve(1) == 1;

		int x = cin.nextInt();
		int k = cin.nextInt();

		int[] r = new int[k];
		for (int i = 0; i < r.length; i++)
			r[i] = cin.nextInt();
		int q = cin.nextInt();

		int[][] tas = new int[q][];
		for (int i = 0; i < tas.length; i++)
			tas[i] = new int[] { cin.nextInt(), cin.nextInt() };

		now.getAsLong();

		int[] ans = solve(x, k, r, q, tas);
		String ansstr = Arrays.stream(ans).mapToObj(Objects::toString)
				.collect(Collectors.joining(System.lineSeparator()));
		cout.println(ansstr);

		assert 0 == tr("elapsed", now.getAsLong());
	}

	private static int[] solve(int x, int k, int[] r, int q, int[][] tas) {
		assert 0 == tr(x, k, r, q, tas);

		int[] rr = new int[k + 2];
		for (int i = 0; i < k; i++)
			rr[i + 1] = r[i];

		ToIntBiFunction<Integer, Integer> func = (t, a) -> {
			rr[k + 1] = Math.max(rr[k], t);
			int v = 1;
			for (int j = 1; j < k + 2; j++) {
				v *= -1;
				int u = Math.min(rr[j] - rr[j - 1], t);
				t -= u;
				if (v == -1)
					a = Math.max(0, a + v * u);
				else
					a = Math.min(x, a + v * u);
			}
			return a;
		};

		int[] ans = new int[q];
		for (int i = 0; i < q; i++) {
			int t = tas[i][0];

			int lt, rt;
			lt = 0;
			rt = 1000000000;
			int lans = func.applyAsInt(t, lt);
			int rans = func.applyAsInt(t, rt);
			if (lans == rans) {
				ans[i] = lans;
				continue;
			}
			while (lt + 1 != rt) {
				int md = (lt + rt) / 2;
				int mans = func.applyAsInt(t, md);
				if (lans == mans) {
					lt = md;
				} else {
					rt = md;
				}
			}
			int corn1 = lt;

			lt = corn1;
			rt = 1000000000;
			while (lt + 1 != rt) {
				int md = (lt + rt) / 2;
				int mans = func.applyAsInt(t, md);
				if (rans == mans) {
					rt = md;
				} else {
					lt = md;
				}
			}
			int corn2 = rt;

			int a = tas[i][1];
			if (a <= corn1) {
				ans[i] = lans;
			} else if (corn2 <= a) {
				ans[i] = rans;
			} else {
				ans[i] = (rans - lans) / Math.abs(rans - lans) * (a - corn1);
			}
		}

		return ans;
	}

}
