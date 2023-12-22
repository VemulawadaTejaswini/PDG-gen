import java.util.*;
import java.io.*;

public class Main {
	static int mod = 998244353;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int p[][] = new int[n][2];
		for(int i=0;i<n;i++) {
			p[i][0] = fs.nextInt();
			p[i][1] = fs.nextInt();
		}
		//座標圧縮
		//x方向
		TreeMap<Integer,Integer> tm = new TreeMap<>();
		for(int i=0;i<n;i++)tm.put(p[i][0], 0);
		int cnt = 0;
		for(int key:tm.keySet()) {
			 tm.put(key, cnt++);
		}
		for(int i=0;i<n;i++) {
			p[i][0] = tm.get(p[i][0]);
		}
		//y方向
		tm = new TreeMap<>();
		for(int i=0;i<n;i++)tm.put(p[i][1], 0);
		cnt = 0;
		for(int key:tm.keySet()) {
			 tm.put(key, cnt++);
		}
		for(int i=0;i<n;i++) {
			p[i][1] = tm.get(p[i][1]);
		}
		
		long ans = 0;

		BIT bit = new BIT(n);
		Arrays.sort(p, (p1,p2)->p1[0]-p2[0]);
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = bit.sum(p[i][1]+1);
			b[i] = i - a[i];
			bit.add(p[i][1]+1,1);//0は入れられないので全てインクリメントする
		}
		bit = new BIT(n);
		int c[] = new int[n];
		int d[] = new int[n];
		for(int i=n-1;i>=0;i--) {
			c[i] = bit.sum(p[i][1]+1);
			d[i] = n-1-i - c[i];
			bit.add(p[i][1]+1, 1);
		}
		
		
		//左下かつ右上｜｜左上かつ右下
		for(int i=0;i<n;i++) {
			long s = mul(modpow(2,b[i])-1,modpow(2,c[i])-1);
			s = mul(s,modpow(2,(a[i]+d[i])));
			long t = mul(modpow(2,a[i])-1,modpow(2,d[i])-1);
			t = mul(t,modpow(2,(b[i]+c[i])));
			long st = mul(modpow(2,a[i])-1,modpow(2,d[i])-1);
			st = mul(st, modpow(2,b[i])-1);
			st = mul(st, modpow(2,c[i])-1);
			
			long res = sub(plus(s,t),st);
			ans = plus(ans,res);
			ans = plus(ans, modpow(2,n-1));
		}
		
		System.out.println(ans);
		
		
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

//BIT Tree
class BIT {
	int n;
	long bit[];

	public BIT(int n) {
		this.n = n;
		bit = new long[n + 1];
	}

	int sum(int i) {
		int s = 0;
		while (i > 0) {
			s += bit[i];
			i -= i & -i;
		}
		return s;
	}

	void add(int i, long x) {
		while (i <= n) {
			bit[i] += x;
			i += i & -i;
		}
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