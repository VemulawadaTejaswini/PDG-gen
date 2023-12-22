import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
//TOP BOTTOM 

public class knapsack {
	static int[] v, w;
	static int n, s; // Length el elements w hgm l shanta ele m3ak
	static long dp[][];

	public static long dp(int idx, int rem) {
		if (rem < 0) {
			return -(int) 1e9; // infinty value
		}
		if (idx == n) {
			return 0;
		}
		if (dp[idx][rem] != -1) {
			return dp[idx][rem];
		}

		long take = v[idx] + dp(idx + 1, rem - w[idx]);
		long leave = dp(idx + 1, rem);
		return dp[idx][rem] = Math.max(take, leave); // Da keda mn gher dp da tkrar tbe3e gddn !

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		n = sc.nextInt();
		s = sc.nextInt();

		w = new int[n];
		v = new int[n];

		for (int i = 0; i < w.length; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();

		}

		dp = new long[n][s + 1]; // tagnab l outof range
		for (long[] x : dp) {
			Arrays.fill(x, -1);
		}
		pw.println(dp(0, s));
		pw.close();

	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}

}
