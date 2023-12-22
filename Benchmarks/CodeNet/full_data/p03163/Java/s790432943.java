
import java.util.*;
import java.io.*;
public class Main {
	static long[] w, v;
	static int n, s;
	static long[][] dp;
	static StringBuilder sb;
	public static long dp(int idx, long remw) {
		if (remw < 0) {
			return -(int) 1e9;
		}
		if (idx == n) {
			return 0;
		}
		if (dp[idx][(int) remw] != -1) {
			return dp[idx][(int) remw];
		}
		long take = v[idx] + dp(idx + 1, remw - w[idx]);
		long leave = dp(idx + 1, remw);
		return dp[idx][(int) remw] = Math.max(take, leave);
	}


	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		n = sc.nextInt();
		s = sc.nextInt();
		v = new long[n];
		w = new long[n];
		for(int i=0; i<n;i++) {
			w[i]= sc.nextInt();
			v[i]= sc.nextInt();
		}
		dp = new long[n + 1][s + 1];
		for (long[] x : dp)
			Arrays.fill(x, -1);

		pw.println(dp(0, s));
		sb = new StringBuilder();

		pw.close();
	}
	static class Scanner {
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
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
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}
	}
}