

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]) throws Exception {

		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		String s = sc.next();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int Z = 8003;
		int N = 2 * Z + 1;
		int dp[][][] = new int[2][2][N];
		int n = s.length();
		int pos = 0;
		dp[0][0][Z] = dp[1][0][Z] = 1;
		while (pos < n && s.charAt(pos) == 'F') {
			pos++;
			x--;
		}
		int t = 0;
		while (pos < n) {
			pos++;
			t ^= 1;
			int L = 0;
			while (pos < n && s.charAt(pos) == 'F') {
				pos++;
				L++;
			}
			for (int i = 0; i < N; i++)
				dp[t][1][i] = 0;
			for (int i = 0; i < N; i++) {
				if (dp[t][0][i] == 0)
					continue;
				dp[t][1][i - L] = dp[t][1][i + L] = 1;
			}
			for (int i = 0; i < N; i++)
				dp[t][0][i] = dp[t][1][i];
		}
		if (dp[0][0][Z + x] == 1 && dp[1][0][Z + y] == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		out.close();

	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
