import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int a[] = fs.nextIntArray(n);
		
		Map<Integer,Integer> p = new HashMap<>();;
		for(int i=0;i<n;i++) {
			int now = a[i];
			Map<Integer,Integer> map = new HashMap<>();
			for(int j=2;j*j<=now;j++) {
				if(now%j==0) {
					if(map.containsKey(j))map.put(j, map.get(j)+1);
					else map.put(j, 1);	
					now /= j;
				}
			}
			if(now!=1) {
				if(map.containsKey(now))map.put(now, map.get(now)+1);
				else map.put(now, 1);	
			}
			for(Integer key : map.keySet()) {
				int v = map.get(key);
				if(p.containsKey(key)) {
					if(p.get(key)<map.get(key)) {
						p.put(key, map.get(key));
					}
				}
				else {
					p.put(key, v);
				}
			}
		}
		long ans = 0;
		for(int i=0;i<n;i++) {
			long tmp = 1;
			int now = a[i];
			for(Integer key:p.keySet()) {
				int v = p.get(key);
				for(int j=0;j<v;j++) {
					if(now%key==0) {
						now/=key;
					}else {
						tmp = mul(tmp, modpow(key,v-j)); 
						break;
					}
				}
			}
			ans = plus(ans, tmp);
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