import java.util.*;
import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 1000000007;
	static int inf = (int) 1e15;
	static ArrayList<Integer>[] ad;
	static int n, s;
	static int[][][] memo;
	static int[] a;
	static long[] size, ans1, ans2, fac;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		n = sc.nextInt();
		ad = new ArrayList[n];
		for (int i = 0; i < n; i++)
			ad[i] = new ArrayList<>();
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			ad[a].add(b);
			ad[b].add(a);
		}
		fac = new long[200000];
		ans1 = new long[n];
		ans2 = new long[n];
		fac[0] = 1;
		size = new long[n];
		for (int i = 1; i < 200000; i++)
			fac[i] = i * fac[i - 1] % mod;

		sol(0, -1);
		ans2[0] = ans1[0];
		//		System.out.println(Arrays.toString(ans1));
		reroot(0, -1);
		for (int i = 0; i < n; i++)
			out.println(ans2[i]);
		out.close();
	}

	static void reroot(int u, int p) {
		if (p != -1) {
			ans2[u] = ans1[u] * modPow(fac[(int) size[u] - 1], mod - 2) % mod;
			ans2[u] = ans2[u] * fac[n - 1] % mod;
			ans2[u] = ans2[u] * modPow(fac[(int) (n - size[u])], mod - 2) % mod;
			long dp = ans2[p] * modPow(ans1[u], mod - 2) % mod;
			dp = dp * fac[(int) size[u]] % mod;

			dp = dp * modPow(fac[n-1], mod - 2) % mod;
			dp = dp * fac[(int) (n - size[u]-1)]% mod;

			ans2[u] = ans2[u] * dp % mod;
		}
		for (int v : ad[u])
			if (v != p)
				reroot(v, u);
	}

	static long modPow(long a, long e)

	{
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res = (res * a) % mod;
			a = (a * a) % mod;
			e >>= 1;
		}
		return res;
	}

	static void sol(int u, int p) {
		ans1[u] = 1;
		size[u] = 1;
		for (int v : ad[u]) {
			if (v != p) {
				sol(v, u);
				ans1[u] = ans1[u] * modPow(fac[(int) size[v]], mod - 2) % mod;
				ans1[u] = ans1[u] * ans1[v] % mod;
				size[u] += size[v];
			}
		}
		ans1[u] = ans1[u] * fac[(int) size[u] - 1] % mod;
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public int[] nextArrInt(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextArrLong(int n) throws IOException {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
