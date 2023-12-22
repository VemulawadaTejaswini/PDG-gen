import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader scan = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		Task solver = new Task();
		int t = 1;
		while (t --> 0) solver.solve(1, scan, out);
		out.close();
	}

	static class Task {
		
		public void solve(int testNumber, FastReader scan, PrintWriter out) {
			char[] s = scan.next().toCharArray();
			long k = scan.nextLong();
			long[][] dp = new long[s.length][2];
			dp[0][1] = 1;
			for(int i = 1; i < s.length; i++) {
				dp[i][0] = s[i] == s[i-1] ? dp[i-1][1] : Math.min(dp[i-1][0], dp[i-1][1]);
				dp[i][1] = 1+Math.min(dp[i-1][0], dp[i-1][1]);
				if(s[i]==s[i-1] || (i == s.length-1 && s[i] == s[0])) {
					dp[i][0] = dp[i-1][1];
				}
				else dp[i][0] = Math.min(dp[i-1][0], dp[i-1][1]);
			}
			long a = dp[s.length-1][0]*k;
			long b = dp[s.length-1][1]*k;
			if(s.length > 2 && s[s.length-1] != s[s.length-2]) b--;
			out.println(Math.min(a, b));
		}
	}

	static void shuffle(int[] a) {
		Random get = new Random();
		for (int i = 0; i < a.length; i++) {
			int r = get.nextInt(a.length);
			int temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}

	static void shuffle(long[] a) {
		Random get = new Random();
		for (int i = 0; i < a.length; i++) {
			int r = get.nextInt(a.length);
			long temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastReader(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
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