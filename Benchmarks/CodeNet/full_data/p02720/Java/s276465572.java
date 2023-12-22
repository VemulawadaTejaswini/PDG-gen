import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int n, k;
	static long mod = 998244353;
	static int[][] memo, val;
	static String s;
	static HashSet<Integer> nodes;
	static ArrayList<Integer>[] ad, tree;
	static boolean[] vis, taken;
	static int[] a;
	static TreeSet<Long> al;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		al = new TreeSet<>();
		gen(0, 0);
		long ans=0;
		int n=sc.nextInt()+1;
		for(long k:al) {
			n--;
			ans=k;
			if(n==0)
				break;
		}
		System.out.println(ans);
		out.flush();
	}

	static long num;

	static void gen(int i, int l) {
		al.add(num);
		if (i == 12) {
			al.add(num);
			return;
		}
		if (i == 0) {
              for(int j=0;j<=9;j++) {
            	  num=j;
            	  gen(i+1, j);
              }
		} else {
			int ll = l;
			num = num + (long) (Math.pow(10, i) * ll);
			gen(i + 1, ll);
			num = num - (long) (Math.pow(10, i) * ll);
			if (ll != 9) {
				num = num + (long) (Math.pow(10, i) * (ll + 1));
				gen(i + 1, ll + 1);
				num = num - (long) (Math.pow(10, i) * (ll + 1));
			}
			if (ll != 0) {
				num = num + (long) (Math.pow(10, i) * (ll - 1));
				gen(i + 1, ll - 1);
				num = num - (long) (Math.pow(10, i) * (ll - 1));
			}
		}
	}

	static int[] si;
	static ArrayList<Integer> primes;

	static long phi(long N) {
		long ans = N;
		int idx = 0, p = primes.get(0);
		while (p * p <= N) {
			if (N % p == 0)
				ans -= ans / p;
			while (N % p == 0)
				N /= p;
			p = primes.get(++idx);
		}

		if (N != 1)
			ans -= ans / N;
		return ans;
	}

	static void seive(int N) {
		si = new int[N];
		primes = new ArrayList<>();
		si[1] = 1;
		for (int i = 2; i < N; i++) {
			if (si[i] == 0) {
				si[i] = i;
				primes.add(i);
			}
			for (int j = 0; j < primes.size() && primes.get(j) <= si[i] && (i * primes.get(j)) < N; j++)
				si[primes.get(j) * i] = primes.get(j);
		}
	}

	static long gcd(long a, long b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static class pair implements Comparable<pair> {
		int to;
		int number;

		pair(int n, int t) {
			number = n;
			to = t;
		}

		public String toString() {
			return to + " " + number;
		}

		@Override
		public int compareTo(pair o) {
			return number - o.number;
		}

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