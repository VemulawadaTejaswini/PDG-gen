import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n=  in.nextInt();
		int[] b = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			b[i] = b[i - 1] + in.nextInt();
		}
		
		int q = in.nextInt();
		List<Integer>[] left = new List[n + 1];
		for (int i = 0; i < left.length;i++) {
			left[i] = new ArrayList<>();
		}
		for (int i = 0; i < q; i++) {
			int l = in.nextInt(), r=  in.nextInt();
			left[r].add(l);
		}
		
		int[] dp = new int[n + 1];
		dp[0] = 0;
		
		for (int i = 1; i <= n; i++) {
			dp[i] = dp[i - 1] + ((b[i] - b[i - 1]) == 0 ? 0 : 1);
			for (int l : left[i]) {
				int sum = b[i] - b[l - 1];
				int dist = i - l + 1 - sum;
				dp[i] = Math.min(dp[i], dp[l - 1] + dist);
			}
		}
		out.println(dp[n]);
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
