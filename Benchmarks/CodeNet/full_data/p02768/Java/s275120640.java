import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	static long mod = (long) (1e9 + 7);

	public static long facn(long n, long x) {
		long ans = 1;
		for (int i = 1; i <= x; i++) {
			ans *= n;
			ans %= mod;
			n--;
		}
		long k = 1;
		long t = x;
		for (int i = 1; i <= t; i++) {
			k *= x;
			k %= mod;
			x--;
		}
//		BigInteger b = BigInteger.valueOf((k)).modInverse(BigInteger.valueOf((mod)));
		long b=modPow(k, mod-2, mod);
		return ((b%mod)*ans)%mod;

	}

	public static long modInverse(long a, long m) {
		a = a % m;
		for (int x = 1; x < m; x++)
			if ((a * x) % m == 1)
				return x;
		return 1;
	}

	static long modPow(long a, long e, long mod) // O(log e)
	{
		a %= mod;
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res = (res * a) % mod;
			a = (a * a) % mod;
			e >>= 1;
		}
		return res%mod;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		// pw=new PrintWriter("C:\\Users\\Hp\\Desktop\\outt.txt");
		long n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		 pw.println(facn(4, 3));

		pw.print(((modPow(2, n, mod) - 1 -( facn(n, a) + facn(n, b))%mod) % mod));
		pw.close();
	}

	public static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException, IOException {
			return br.ready();
		}

	}
}