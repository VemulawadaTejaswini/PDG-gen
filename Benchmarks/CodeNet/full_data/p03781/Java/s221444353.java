import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// 1 2 3 4 5
public class Main {






	public static void main(String[]args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(); int k = sc.nextInt();
		int maxSum = k * 3 + 1;
		int dp1[][] = new int[n][maxSum + 1];
		int dp2[][] = new int[n][maxSum + 1];
		int a[] = new int[n];
		for (int i = 0 ; i < n ; ++i) {
			a[i] = sc.nextInt();
		}
		dp1[0][0] = 1;
		dp1[0][Math.min(maxSum,a[0])] = 1;
		for (int i = 0  ; i < n - 1 ; ++i) {
			for (int cur = 0 ; cur <= maxSum; ++cur) {
				dp1[i + 1][Math.min(maxSum , a[i + 1] + cur)] += dp1[i][cur];
				dp1[i + 1][cur] += dp1[i][cur];
			}
		}
		int res = 0;
		for (int i = 0 ; i < n ; ++i) {
			for (int cur = 0 ; cur <= maxSum ; ++cur) {
				dp2[i][cur] = dp1[n - 1][cur];
				if (cur - a[i] >= 0) {
					dp2[i][cur] -= dp2[i][cur - a[i]];

				}

			}

		}
		for (int i = 0 ; i < n ; ++i) {
			boolean ok = false;
			for (int cur = 0 ; cur < k ; ++cur) {
				if (dp2[i][cur] > 0 && cur + a[i] >= k && dp2[i][Math.min(maxSum,cur + a[i])] == 0) {
					ok = true;
				}
			}
			if (!ok) {
				++res;
			}
		}
		System.out.println(res);
		out.flush();
		out.close();
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
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
