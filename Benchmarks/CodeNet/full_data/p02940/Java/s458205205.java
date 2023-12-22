import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

public class Main {
	FastScanner in;
	PrintWriter out;
	boolean systemIO = true;

	public class Pair implements Comparable<Pair> {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Pair o) {
			if (x != o.x) {
				return x - o.x;
			}
			return y - o.y;
		}
	}

	public int[] sort(int[] a, int l, int r) {
		if (r < l) {
			return new int[0];
		}
		if (l == r) {
			int[] ans = { a[l] };
			return ans;
		}
		int m = (l + r) / 2;
		int[] left = sort(a, l, m);
		int[] right = sort(a, m + 1, r);
		return merge(left, right);
	}

	public int[] merge(int[] a, int[] b) {
		int i = 0;
		int j = 0;
		int[] ans = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				ans[i + j] = a[i];
				i++;
			} else {
				ans[i + j] = b[j];
				j++;
				perm += a.length - i;
			}
		}
		while (i < a.length) {
			ans[i + j] = a[i];
			i++;
		}
		while (j < b.length) {
			ans[i + j] = b[j];
			j++;
		}
		return ans;
	}

	long perm = 0;
	
	long mod = 998244353;
	
	public void solve() {
		int n = in.nextInt();
		String s = in.next();
		int[] a = new int[3 * n];
		for (int i = 0; i < a.length; i++) {
			if (s.charAt(i) == 'G') {
				a[i] = 1;
			} else if (s.charAt(i) == 'B') {
				a[i] = 2;
			}
			a[i]++;
		}
		long ans = 1;
		for (int i = 1; i <= n; i++) {
			ans *= i;
			ans %= mod;
		}
		int r = 0;
		int g = 0;
		int b = 0;
		int rg = 0;
		int rb = 0;
		int gb = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				if (gb > 0) {
					ans *= gb;
					ans %= mod;
					gb--;
				} else if (g > 0) {
					ans *= g;
					ans %= mod;
					g--;
					rg++;
				} else if (b > 0) {
					ans *= b;
					ans %= mod;
					b--;
					rb++;
				} else {
					r++;
				}
			} else if (a[i] == 2) {
				if (rb > 0) {
					ans *= rb;
					ans %= mod;
					rb--;
				} else if (r > 0) {
					ans *= r;
					ans %= mod;
					r--;
					rg++;
				} else if (b > 0) {
					ans *= b;
					ans %= mod;
					b--;
					gb++;
				} else {
					g++;
				}
			} else {
				if (rg > 0) {
					ans *= rg;
					ans %= mod;
					rg--;
				} else if (r > 0) {
					ans *= r;
					ans %= mod;
					r--;
					rb++;
				} else if (g > 0) {
					ans *= g;
					ans %= mod;
					g--;
					gb++;
				} else {
					b++;
				}
			}
		}
		out.print(ans);
	}

	public void run() {
		try {
			if (systemIO) {
				in = new FastScanner(System.in);
				out = new PrintWriter(System.out);
			} else {
				in = new FastScanner(new File("segments.in"));
				out = new PrintWriter(new File("segments.out"));
			}
			solve();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
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

	}

	// AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	public static void main(String[] arg) {
		new Main().run();
	}
}