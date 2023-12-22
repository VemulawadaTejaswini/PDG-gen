import java.util.*;
import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static long mod = 998244353;
	static int inf = (int) 1e15;
	static ArrayList<Integer>[] ad;
	static int n, k;
	static long[][] memo;
	static char[][] g;
	static boolean[] vis;
	static long ans, tem;
	static long[] a;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		int[][] a = new int[h][w];
		for (int i = 0; i < h; i++) {
			char[] g = sc.nextLine().toCharArray();
			for (int j = 0; j < w; j++) {
				a[i][j] = g[j] - '0';
			}
		}
		// System.out.println("ad");
		for (int i = 0; i < w; i++)
			for (int j = h - 2; j >= 0; j--)
				a[j][i] += a[j + 1][i];
		int ans = Integer.MAX_VALUE;
		int ti = (1 << (h ));
		//ti=1;
	//	System.out.println(k);
		//for(int []y:a)
	//		System.out.println(Arrays.toString(y));
		while (ti >= 0) {
			int tem = 0;
			ArrayList<Integer> open = new ArrayList<>();
			ArrayList<Integer> close = new ArrayList<>();
			open.add(0);
			for (int i = 1; i < h; i++) {
				if ((ti & (1 << i)) != 0 && (ti & (1 << (i - 1))) == 0) {
					close.add(i - 1);
					open.add(i);
					tem++;
				} else if ((ti & (1 << i)) == 0 && (ti & (1 << (i - 1))) != 0) {
					close.add(i - 1);
					open.add(i);
					tem++;
				}
			}
			close.add(h - 1);
	//		System.out.println(open);
		//	System.out.println(close);
			//System.out.println(ti+" "+tem);
			all: for (int i = 0; i < open.size(); i++) {
				int sum = 0;
				int op = open.get(i);
				int cl = close.get(i);
				for (int j = 0; j < w; j++) {
					int add = a[op][j];
			//		System.out.println(add+" "+sum+" "+j);
					if (cl != h - 1)
						add -= a[cl+1][j];
					if (add > k) {
						tem = 10000000;
						break all;
					}
					if (sum + add > k) {
						tem++;
						sum = add;
					} else {
						sum += add;
					}
				}
			//	System.out.println(tem+" ti");
			}
		//	System.out.println(tem);
			ans = Math.min(ans, tem);
			ti--;
		}
		System.out.println(ans);
		out.close();
	}

	static long cal(int i, int u, int p) {
		if (memo[i][u] != -1)
			return memo[i][u];
		long ans = 1;
		for (int v : ad[i]) {
			if (v == p)
				continue;
			if (u == 0) {
				long tem = 0;
				tem = (2 * cal(v, 0, i)) % mod;
				tem = (tem + 2 * cal(v, 1, i)) % mod;
				tem = (tem - cal(v, 2, i) + mod) % mod;
				ans = ans * tem % mod;
			} else if (u == 1) {
				long tem = 0;
				tem = (2 * cal(v, 0, i)) % mod;
				tem = (tem + cal(v, 1, i)) % mod;
				tem = (tem - cal(v, 2, i) + mod) % mod;
				ans = ans * tem % mod;
			} else {
				long tem = 0;
				tem = cal(v, 0, i) % mod;
				tem = (tem + cal(v, 1, i)) % mod;
				tem = (tem - cal(v, 2, i) + mod) % mod;
				ans = ans * tem % mod;
			}
		}
		return memo[i][u] = ans;
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