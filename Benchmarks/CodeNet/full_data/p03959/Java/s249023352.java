import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n = in.nextInt();
		long mod = 1000000007;
		int[] a = new int[n], b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = in.nextInt();
		}
		
		
		int mxA = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] > a[mxA]) {
				mxA = i;
			}
		}
		int mxB = n - 1;
		for (int i = n - 1; i >= 0; i--) {
			if (b[i] > b[mxB]) {
				mxB = i;
			}
		}
		
		if (mxA > mxB) {
			out.println(0);
			return;
		}
		if (a[mxA] != b[mxB]) {
			out.println(0);
			return;
		}
		for (int t = mxA; t <= mxB; t++) {
			if (a[t] != a[mxA] || b[t] != b[mxB]) {
				out.println(0);
				return;
			}
		}
		
		long result = 1;
		for (int t = mxA + 1; t < mxB; t++) {
			result = result * a[t] % mod;
		}
		
		for (int i = 0; i < mxA; i++) {
			if (i == 0 || a[i] != a[i - 1]) {
				continue;
			}
			result = result * a[i] % mod;
		}
		for (int j = n - 1; j > mxB; j--) {
			if (j == n - 1 || b[j] != b[j + 1]) {
				continue;
			}
			result = result * b[j] % mod;
		}
		out.println(result);
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
