import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class E {
	static FastReader scan;
	static PrintWriter out;

	public static void main(String[] args) throws FileNotFoundException {
		Solver solver = new Solver();
		scan = new FastReader();
		out = new PrintWriter(System.out);
		int testCases = 1;
		for (int i = 1; i <= testCases; i++) {
			// out.print("Case #" + i + ": ");
			solver.solve();
		}
		out.close();
	}

	static class Solver {
		
		static char[] a;
		static int d;
		static long[][][] dp;
		static final int MOD = (int) (1e9 + 7);

		void solve() {
			a = scan.next().toCharArray();
			d = scan.nextInt();
			dp = new long[a.length][d][2];
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < d; j++) Arrays.fill(dp[i][j], -1);
			}
			long ans = 0;
			for(int i = 0; i < a[0]-'0'; i++) ans = add(ans, go(0, i%d, 0), MOD);
			ans = add(ans, go(0, (a[0]-'0')%d, 1), MOD);
			ans = (ans-1+MOD)%MOD;
			out.println(ans);
		}
		
		static long go(int at, int m, int fixed) {
			if(dp[at][m][fixed] != -1) return dp[at][m][fixed];
			if(at == a.length-1) return dp[at][m][fixed] = m == 0 ? 1 : 0;
			long ans = 0;
			for(int i = 0; i <= 9; i++) {
				if(fixed == 0 || i < a[at+1]-'0') {
					ans = add(ans, go(at+1,(int)add(m,i,d),0), MOD);
				}
				else if(i == a[at+1]-'0') {
					ans = add(ans, go(at+1,(int)add(m,i,d),1), MOD);
				}
			}
			return dp[at][m][fixed] = ans;
		}
		
		static long add(long a, long b, long mod) {
			return (a+b)%mod;
		}

	}

	// Sathvik's Template Stuff BELOW!!!!!!!!!!!!!!!!!!!!!!

	static class DSU {
		int[] root, size;
		int n;

		DSU(int n) {
			this.n = n;
			root = new int[n];
			size = new int[n];
			for (int i = 0; i < n; i++) {
				root[i] = i;
				size[i] = 1;
			}
		}

		int findParent(int idx) {
			while (root[idx] != idx) {
				root[idx] = root[root[idx]];
				idx = root[idx];
			}
			return idx;
		}

		boolean union(int x, int y) {
			int parX = findParent(x);
			int parY = findParent(y);
			if (parX == parY)
				return false;
			if (size[parX] < size[parY]) {
				root[parY] = parX;
				size[parX] += size[parY];
			} else {
				root[parX] = parY;
				size[parY] += size[parX];
			}
			return true;
		}
	}

	static class Extra {
		static void sort(int[] a) {
			Integer[] aa = new Integer[a.length];
			for (int i = 0; i < aa.length; i++)
				aa[i] = a[i];
			Arrays.sort(aa);
			for (int i = 0; i < aa.length; i++)
				a[i] = aa[i];
		}

		static void sort(long[] a) {
			Long[] aa = new Long[a.length];
			for (int i = 0; i < aa.length; i++)
				aa[i] = a[i];
			Arrays.sort(aa);
			for (int i = 0; i < aa.length; i++)
				a[i] = aa[i];
		}

		static void sort(double[] a) {
			Double[] aa = new Double[a.length];
			for (int i = 0; i < aa.length; i++)
				aa[i] = a[i];
			Arrays.sort(aa);
			for (int i = 0; i < aa.length; i++)
				a[i] = aa[i];
		}

		static void sort(char[] a) {
			Character[] aa = new Character[a.length];
			for (int i = 0; i < aa.length; i++)
				aa[i] = a[i];
			Arrays.sort(aa);
			for (int i = 0; i < aa.length; i++)
				a[i] = aa[i];
		}

		static long gcd(long a, long b) {
			while (b > 0) {
				long temp = b;
				b = a % b;
				a = temp;
			}
			return a;
		}

		static long lcm(long a, long b) {
			return a * (b / gcd(a, b));
		}

		static boolean isPrime(long n) {
			if (n <= 1)
				return false;
			if (n <= 3)
				return true;
			if (n % 2 == 0 || n % 3 == 0)
				return false;
			for (long i = 5; i * i <= n; i = i + 6) {
				if (n % i == 0 || n % (i + 2) == 0)
					return false;
			}
			return true;
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

		int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] a = new double[n];
			for (int i = 0; i < n; i++)
				a[i] = nextDouble();
			return a;
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