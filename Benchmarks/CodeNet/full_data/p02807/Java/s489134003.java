import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int x[] = fs.nextIntArray(n);
		long d[] = new long[n-1];
		
		for(int i=0;i<n-1;i++) {
			d[i] = x[i+1]-x[i];
		}

		long c[] =  new long[n-1];
		c[0]=1;
		for(int i=1;i<n-1;i++) {
			c[i]= mplu(c[i-1] , mdiv(1,i+1)) ;
		}
		
		long ans = 0;
		for(int i=0;i<n-1;i++) {
			ans = mplu(ans, mmul(c[i],d[i]));
		}
		
		for(int i=0;i<n-1;i++) {
			ans = mmul(ans, n-i-1);
		}
		System.out.println(ans);
		
	}
	
	static long mplu(long x, long y) {
		x %= mod;
		y %= mod;
		long res = (x + y) % mod;
		return res;		
	}
	
	static long mdif(long x, long y) {
		x %= mod;
		y %= mod;
		long res = (x - y + mod) % mod;
		return res;		
	}
	
	static long mmul(long x, long y) {
		x %= mod;
		y %= mod;
		long res = x * y % mod;
		return res;		
	}
	
	static long mdiv(long x, long y) {
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