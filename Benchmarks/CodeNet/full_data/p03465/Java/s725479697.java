import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n = in.nextInt();
		int sum = 0;
		int max = (2000 * 2000 + 63) / 64;
		long[] bs = new long[max + 40];
		long[] tmp = new long[bs.length];
		bs[0] = tmp[0] = 1;

		for (int i = 0; i < n; i++) {
			int val = in.nextInt();
			sum += val;

			int big = val / 64;
			int small = val % 64;
			for (int j = 0; j < max; j++) {
				tmp[j + big] |= bs[j] << small;
			}
			if (small != 0) {
				for (int j = 0; j < max; j++) {
					tmp[j + big + 1] |= bs[j] >>> (64 - small);
				}
			}
			System.arraycopy(tmp, 0, bs, 0, max);
		}
		for (int i = (sum + 1) / 2; i <= sum; i++) {
			if ((bs[i >> 6] & (1L << (i & 63))) != 0) {
				out.println(i);
				return;
			}
		}
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
