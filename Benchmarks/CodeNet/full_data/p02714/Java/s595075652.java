import java.io.*;
import java.math.BigInteger;
import java.util.*;

import javax.transaction.xa.Xid;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int n, m;
	static long mod = 998244353;
	static int[][] memo;
	static String s;
	static HashSet<Integer> nodes;
	static HashSet<Integer>[] ad, tree;
	static boolean[] vis, taken;
	static int[] a;
	static TreeSet<Long> al;
	static long[] val;
	static ArrayList<String> aa;
	static char[] b;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int n = sc.nextInt();
		String s = sc.nextLine();
		int[] r = new int[n + 1];
		int[] g = new int[n + 1];
		int[] b = new int[n + 1];
		for (int i = n - 1; i >= 0; i--) {
			r[i] += r[i + 1];
			g[i] += g[i + 1];
			b[i] += b[i + 1];
			if (s.charAt(i) == 'R') {
				r[i]++;
			} else if (s.charAt(i) == 'G') {
				g[i]++;
			} else {
				b[i]++;
			}
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int diff = j - i;
				if (s.charAt(i) == 'R') {
					if (s.charAt(j) == 'G') {
                               ans+=b[j+1];
                               if(j+diff<n && s.charAt(j+diff)=='B')
                            	   ans--;
					}
					if (s.charAt(j) == 'B') {
						 ans+=g[j+1];
                         if(j+diff<n && s.charAt(j+diff)=='G')
                      	   ans--;
					}
				}
				if (s.charAt(i) == 'G') {
					if (s.charAt(j) == 'R') {
						 ans+=b[j+1];
                         if(j+diff<n && s.charAt(j+diff)=='B')
                      	   ans--;
					}
					if (s.charAt(j) == 'B') {
						 ans+=r[j+1];
                         if(j+diff<n && s.charAt(j+diff)=='R')
                      	   ans--;
					}
				}
				if (s.charAt(i) == 'B') {
					if (s.charAt(j) == 'G') {
						 ans+=r[j+1];
                         if(j+diff<n && s.charAt(j+diff)=='R')
                      	   ans--;
					}
					if (s.charAt(j) == 'R') {
						 ans+=g[j+1];
                         if(j+diff<n && s.charAt(j+diff)=='G')
                      	   ans--;
					}
				}
			}
		}
		System.out.println(ans);
		out.flush();
	}

	static long gcd(long a, long b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
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