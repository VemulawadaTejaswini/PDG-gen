import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		assert solve(3, new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } }) == 15;
		assert solve(3, new int[][] { { 1010, 10 }, { 1000, 1 }, { 20, 1020 } }) == 380;
		assert solve(2, new int[][] { { 1, 1 }, { 1000000000, 1000000000 } }) == 999999998000000001L;
		int n = cin.nextInt();
		int[][] xys = new int[n][];
		for (int i = 0; i < n; i++)
			xys[i] = new int[] { cin.nextInt(), cin.nextInt() };
		long ans = -1;
		ans = solve(n, xys);
		cout.println(ans);
	}

	private static long solve(int n, int[][] xys) {
		if (n == 1)
			return 0;
		int[][] balls = new int[2 * n][];
		for (int i = 0; i < n; i++) {
			balls[2 * i] = new int[] { xys[i][0], i };
			balls[2 * i + 1] = new int[] { xys[i][1], i };
		}
		Arrays.sort(balls, (ball1, ball2) -> Integer.compare(ball1[0], ball2[0]));

		int[] notFound = new int[n];
		int toFind = 0;

		long[] maxOfMin = new long[2];
		for (int j = 0; j < 2; j++) {
			Arrays.fill(notFound, 1);
			toFind = n;
			for (int i = j; i < balls.length; i++) {
				if (toFind == 0)
					break;
				toFind -= notFound[balls[i][1]];
				notFound[balls[i][1]] = 0;
				maxOfMin[j] = balls[i][0];
			}
		}

		long[] minOfMax = new long[2];
		for (int j = 0; j < 2; j++) {
			Arrays.fill(notFound, 1);
			toFind = n;
			for (int i = balls.length - 1 - j; i >= 0; i--) {
				if (toFind == 0)
					break;
				toFind -= notFound[balls[i][1]];
				notFound[balls[i][1]] = 0;
				minOfMax[j] = balls[i][0];
			}
		}

		long ans = Long.MAX_VALUE;
		// min-allpairs, max-allpairs
		ans = Math.min(ans, (maxOfMin[0] - balls[0][0]) * (balls[balls.length - 1][0] - minOfMax[0]));
		// min-max, 2ndlargest-allpairs
		ans = Math.min(ans, (balls[balls.length - 1][0] - balls[0][0]) * (balls[balls.length - 2][0] - minOfMax[1]));
		// min-max, 2ndsmallest-allpairas
		ans = Math.min(ans, (balls[balls.length - 1][0] - balls[0][0]) * (maxOfMin[1] - balls[1][0]));
		return ans;
	}

	/**
	 * How to read input in Java — tutorial <br />
	 * By Flatfoot<br />
	 * http://codeforces.com/blog/entry/7018
	 */
	static class FastScanner {
		private BufferedReader br;
		private StringTokenizer st;

		FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			return st.nextToken();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			return str;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
