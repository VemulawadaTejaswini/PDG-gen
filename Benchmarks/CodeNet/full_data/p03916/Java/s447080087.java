import java.io.*;
import java.util.*;

public class Main {
	FastScanner in;
	PrintWriter out;

	int[] a;
	long[][] dp;
	long[] sum;

	long getAns(int pos, int value) {
		if (pos == 1) {
			return value;
		}
		if (value <= a[pos]) {
			return dp[pos][value];
		}
		int l = 1, r = pos;
		while (r - l > 1) {
			int mid = (l + r) >> 1;
			long su = sum[pos] - sum[mid - 1];
			if (su < value) {
				r = mid;
			} else {
				l = mid;
			}
		}
		return getAns(l, (int) (value - (sum[pos] - sum[l])));
	}

	void solve() {
		int n = in.nextInt();
		a = new int[n];
		for (int i = 0; i + 1 < n; i++) {
			a[i] = in.nextInt();
		}
		sum = new long[n];
		sum[0] = a[0];
		for (int i = 1; i < n; i++) {
			sum[i] = sum[i - 1] + a[i];
		}
		int m = in.nextInt();
		dp = new long[n][];
		for (int x = 2; x + 1 < n; x++) {
			dp[x] = new long[a[x] + 1];
			for (int y = 0; y <= a[x]; y++) {
				dp[x][y] = getAns(x - 1, a[x] - y);
			}
		}
		for (int i = 0; i < m; i++) {
			int value = in.nextInt();
			out.println(getAns(n - 2, value) + a[0] - a[1]);
		}
	}

	void run() {
		try {
			in = new FastScanner(new File("object.in"));
			out = new PrintWriter(new File("object.out"));

			solve();

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void runIO() {

		in = new FastScanner(System.in);
		out = new PrintWriter(System.out);

		solve();

		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return null;
				st = new StringTokenizer(s);
			}
			return st.nextToken();
		}

		boolean hasMoreTokens() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return false;
				st = new StringTokenizer(s);
			}
			return true;
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
	}

	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			public void run() {
				new Main().runIO();
			}
		}, "1", 1 << 26).start();
	}
}