import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		ConsoleScanner cin = new ConsoleScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(ConsoleScanner cin, PrintWriter cout) {
		for (int i = 1; i <= 100; i++)
			assert null != System.out.format("%d %d\n", i, solve(i));

		int n = cin.nextInt();

		long millis = System.currentTimeMillis();

		int ans = solve(n);

		cout.println(ans);
		assert null != cout.format("%d elapsed", System.currentTimeMillis() - millis);
	}

	private static int solve(int n) {
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < 30; i++)
			if (n >> i != 0)
				ans = Math.min(ans, (n >> i) << i);
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
	}

}
