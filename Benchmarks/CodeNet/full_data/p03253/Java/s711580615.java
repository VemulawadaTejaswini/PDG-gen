import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), m = fs.nextInt();
		Map<Integer,Integer> map = new HashMap<>();
		int t = m;
		for(int i=2;i*i<=m;i++) {
			while(t%i==0) {
				t/=i;
				map.put(i, map.getOrDefault(i, 0)+1);
			}
		}
		if(t!=1)map.put(t, 1);
		
		pre_factrials(100100);
		
		long ans = 1;
		for(int key:map.keySet()) {
			int v = map.get(key);
			ans = mul(ans, fastFermatComb(v + n - 1, v));
		}
		System.out.println(ans);
	}
	
	
	
	//Fast Fermat Combination
	static long factorials[];
	static long factorialDivs[];

	static void pre_factrials(int n) {
		factorials = new long[n + 1];
		factorialDivs = new long[n + 1];
		factorials[0] = 1;
		for (int i = 0; i < n; i++) {
			factorials[i + 1] = mul(i + 1, factorials[i]);
		}
		factorialDivs[n] = div(1, factorials[n]);
		for (int i = n - 1; i >= 0; i--) {
			factorialDivs[i] = mul(factorialDivs[i + 1], i + 1);
		}
	}

	static long fastFermatComb(int a, int b) {
		if (factorials.length == 0)
			System.err.println("error : factorials has not been culculated!! do [pre_factorial] method");
		long af = factorials[a];
		long bf = factorialDivs[b];
		long abf = factorialDivs[a - b];
		long res = mul(mul(af, bf), abf);
		return res;
	}

	//MOD culculations
	static long plus(long x, long y) {
		x %= mod;
		y %= mod;
		long res = (x + y) % mod;
		return res;
	}

	static long sub(long x, long y) {
		x %= mod;
		y %= mod;
		long res = (x - y + mod) % mod;
		return res;
	}

	static long mul(long x, long y) {
		x %= mod;
		y %= mod;
		long res = x * y % mod;
		return res;
	}

	static long div(long x, long y) {
		x %= mod;
		y %= mod;
		long res = x * modpow(y, mod - 2) % mod;
		return res;
	}

	//modの元での高速pow()
	static long modpow(long a, long p) {
		if (p == 0)
			return 1;
		if (p % 2 == 0) {
			long halfP = p / 2;
			long root = modpow(a, halfP);
			return root * root % mod;
		} else
			return a * modpow(a, p - 1) % mod;
	}

	
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}