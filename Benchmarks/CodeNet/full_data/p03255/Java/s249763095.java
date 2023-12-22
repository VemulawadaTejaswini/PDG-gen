import java.io.*;
import java.util.*;

public class Main {

	static long INF = Long.MAX_VALUE;
	static long[][] cost;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), X = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++)
			a[i] = sc.nextInt();
		long[] dp = new long[n + 1];
		cost = new long[n + 1][n + 1];
		for (int r = n; r > 0; r--) {
			long curr = 0;
			for (int l = r - 1; l > 0; l--) {
				long len = r - l + 1;
				curr += len * len * (a[l + 1] - a[l]);
				cost[l][r] = curr;
			}
		}
		for (int r = 1; r <= n; r++) {
			long ans = INF;
			for (int l = r; l > 0; l--) {
				long carry = r - l + 1;
				long curr = dp[l - 1] + cost[l][r] + a[l] * 1l * (carry + 1) * (carry + 1);
				ans = Math.min(ans, curr);
			}
			dp[r] = ans + X + a[r];
		}

		out.println(dp[n] + n * 1L * X);

		out.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

	static void sort(int[] a) {
		shuffle(a);
		Arrays.sort(a);
	}

	static void shuffle(int[] a) {
		int n = a.length;
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			int tmpIdx = rand.nextInt(n);
			int tmp = a[i];
			a[i] = a[tmpIdx];
			a[tmpIdx] = tmp;
		}
	}

}