import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) { new Main(); }
	FS in = new FS();
	PrintWriter out = new PrintWriter(System.out);

	
	Main() {
		int n = in.nextInt();
		int m = in.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextLong();
		sort(a);

		long[] cs = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			cs[i] = cs[i - 1];
			cs[i] += a[i - 1];
		}

		int ptr = n - 1;
		long ans = 0;
		while (m > 0) {
			ans += (2 * a[ptr]);
			if (--m == 0) break;

			int min = min(2 * ptr, m);
			if (min < m) { // min == 2 * ptr
				ans += (min * a[ptr]);
				ans += (2 * cs[ptr]);
			}
			else { // min = m
				int q = min / 2, r = min % 2;
				ans += (min * a[ptr]);
				ans += 2 * (cs[ptr] - cs[ptr - q]);
				if (r == 1)
					ans += a[ptr - q - r];
			}
			m -= min;
			ptr--;
		}

		out.println(ans);
		out.close();
	}

	void sort(long[] x) {
		int sz = x.length, j;
		Random r = new Random();
		for (int i = 0; i < sz; i++) {
			j = r.nextInt(i + 1);
			x[i] = x[j]^(x[i]^(x[j] = x[i]));
		} Arrays.sort(x);
	}
	
	int abs(int x) { if (x < 0) return -x; return x; }
	long abs(long x) { if (x < 0) return -x; return x; }
	int max(int x, int y) { if (x < y) return y; return x; }
	int min(int x, int y) { if (x > y) return y; return x; }
	long max(long x, long y) { if (x < y) return y; return x; }
	long min(long x, long y) { if (x > y) return y; return x; }

	class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (Exception e) {}
			} return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }

		void intArr(int sz, int[] x) { for (int i = 0; i < sz; i++) x[i] = nextInt(); }
		void longArr(int sz, long[] x) { for (int i = 0; i < sz; i++) x[i] = nextLong(); }
		void doubleArr(int sz, double[] x) { for (int i = 0; i < sz; i++) x[i] = nextDouble(); }
	}
}

