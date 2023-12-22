import java.util.*;

import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static long mod = 1000000007;
	static int inf = (int) 1e15;
	static ArrayList<Integer>[] adL, adH;
	static int n, q;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] f = new long[1000000];
		f[0] = 1;
		long ans = 0;
		for (int i = 1; i < 1000000; i++)
			f[i] = i * f[i - 1] % mod;
		for(int i=0;i<=Math.min(n-1, k);i++) {
			long tem=f[n]*modPow(f[i], mod-2)%mod;
			tem*=modPow(f[n-i], mod-2);
			tem%=mod;
			long t=f[n-1]*modPow(f[i], mod-2)%mod;
			t*=modPow(f[n-i-1], mod-2);
			t%=mod;
			ans+=t*tem%mod;
			ans%=mod;
	//		System.out.println(f[n]+" "+f[n-1]+" "+modPow(i, mod-2));
		//	System.out.println(i+" "+t+" "+tem);
		}
		System.out.println(ans);
		out.flush();
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

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}