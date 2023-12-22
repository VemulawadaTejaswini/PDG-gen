import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.function.LongSupplier;
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
		int[] ans = new int[q];

		// TODO 高速化

		for (int i = 0; i < q; i++) {
			int t = tas[i][0];
			int a = tas[i][1];
			int v = -1;
			int u;

			u = Math.min(r[0], t);
			t -= u;
			a = Math.max(0, a + v * u);
			for (int j = 1; j < k; j++) {
				v *= -1;
				u = Math.min(r[j] - r[j - 1], t);
				t -= u;
				if (v == -1)
					a = Math.max(0, a + v * u);
				else
					a = Math.min(x, a + v * u);
			}
			v *= -1;
			u = Math.max(0, Math.min(tas[i][0] - r[k - 1], t));
			t -= u;
			if (v == -1)
				a = Math.max(0, a + v * u);
			else
				a = Math.min(x, a + v * u);
			ans[i] = a;
		}

		return ans;
	}

	private static int[] solveSlow(int x, int k, int[] r, int q, int[][] tas) {
		assert 0 == tr(x, k, r, q, tas);
		int[] ans = new int[q];

		// TODO

		return ans;
	}

}
