    import static java.lang.Math.*;
    import static java.util.Arrays.*;
     
    import java.util.*;
    import java.io.*;
    import java.math.BigInteger;
     
    import static java.math.BigInteger.*;
     
    public class Main {
     
    	static final int MAX_N = 100000 + 10;
    	boolean[] isPrime = new boolean[MAX_N];
    	int[] primes;
    	void makePrimes(){
    		if (primes != null) return;
    		for (int i = 0; i < isPrime.length; i++) isPrime[i] = true;
    		isPrime[0] = isPrime[1] = false;
    		for (int i = 2; i * i < isPrime.length; i++)
    			if (isPrime[i])
    				for(int j = i * i; j < isPrime.length; j += i)
    					isPrime[j] = false;
    		int p = 0;
    		for (int i = 2; i < isPrime.length; i++) p += isPrime[i] ? 1 : 0;
    		primes = new int[p];
    		p = 0;
    		for (int i = 2; i < isPrime.length; i++) if (isPrime[i]) primes[p++] = i;
    	}
    	
    	long root(long x) {
    		long res = 1;
    		for (int p : primes) {
    			if ((long) p * p * p > x) break;
    			if (x % p == 0) {
    				int times = 0;
    				do {
    					times++;
    					x /= p;
    				} while (x % p == 0);
    				times %= 3;
    				for (int i = 0; i < times; i++) res *= p;
    			}
    		}
    		res *= x;
    		return res;
    	}
    	
    	static final long BIG = (long)1e10;
    	long pair(long x) {
    		long res = 1;
    		for (int p : primes) {
    			if ((long) p * p * p > x) break;
    			if (x % p == 0) {
    				int times = 0;
    				do {
    					times++;
    					x /= p;
    				} while (x % p == 0);
    				times %= 3;
    				times = (3 - times) % 3;
    				for (int i = 0; i < times; i++) { res *= p; if (res > BIG) return -1; }
    			}
    		}
    		if (x == 1)
    			return res;
    		
    		long[] fs = factorize(x);
    		if (fs.length == 1) {
    			if ((double)res * fs[0] * fs[0] > BIG) return -1;
    			res *= fs[0] * fs[0];
    		}
    		else if (fs.length == 2) {
    			if (fs[0] == fs[1]) {
    				res *= fs[0];
    				if (res > BIG) return -1;
    			} else {
    				if ((double)res * fs[0] * fs[0] > BIG) return -1;
    				res *= fs[0] * fs[0]; 
    				if ((double)res * fs[1] * fs[1] > BIG) return -1;
    				res *= fs[1] * fs[1];
    			}
    		}
    		else {
    			throw new RuntimeException("orz");
    		}
    		
    		return res;
    	}
    	void solve() {
    		makePrimes();
    		int N = sc.nextInt();
    		HashMap<Long, Integer> count = new HashMap<>(N * 4 / 3 + 10);
    		for (int i = 0; i < N; i++) {
    			long x = sc.nextLong();
    			long r = root(x);
    			count.put(r, count.getOrDefault(r, 0) + 1);
    		}
    //		tr(count);
    		long ans = 0;
    		for (long x : new ArrayList<>(count.keySet())) {
    			if (x == 1) { ans++; continue; }
    			int gx = count.get(x);
    			if (gx == 0) continue;
    			long y = pair(x);
    //			tr(x, y);
    			ans += Math.max(gx, count.getOrDefault(y, 0));
    			if (gx > 0) count.put(x, 0);
    			if (count.containsKey(y)) count.put(y, 0);
    		}
    		out.println(ans);
    	}
    	
     
    	long gcd(long a, long b) {
    		while (b != 0) {
    			long t = a % b;
    			a = b;
    			b = t;
    		}
    		return a;
    	}
    	boolean isProbableComposite(long a, long N) {
    		long d = N - 1;
    		int R = 0;
    		while ((d & 1) == 0) {
    			++R;
    			d >>= 1;
    		}
    		long x = pow_mod(a, d, N);
    		if (x == 1) return false;
    		while (R-->0) {
    			if (x == N - 1) return false;
    			x = mod_mul(x, x, N);
    		}
    		return true;
    	}
     
    	boolean isProbablePrime(long N) {
    		if (N < MAX_N) return isPrime[(int)N];
    		for (int i = 0; i < 5; i++) {
    			long a = (long) (Math.random() * (N - 1) + 1);
    			if (isProbableComposite(a, N))
    				return false;
    		}
    		return true;
    	}
     
    	// a * b % m;
    	long mod_mul(long a, long b, long m) {
    		long res = 0;
    		while (b > 0) {
    			if ((b & 1) == 1) {
    				res += a;
    				if (res < 0 || m <= res) {
    					res = res - m;
    				}
    			}
    			b >>= 1;
    			a <<= 1;
    			if (a < 0 || m <= a) {
    				a = a - m;
    			}
    		}
    		return res;
    	}
     
    	long pow_mod(long a, long b, long p) {
    		long res = 1;
    		while (b > 0) {
    			if ((b & 1) == 1) res = mod_mul(res, a, p);
    			a = mod_mul(a, a, p);
    			b >>= 1;
    		}
    		return res;
    	}
     
    	/**
    	 * nの因数をひとつ求める．n が素数のときは無限ループするので事前に素数判定をしてから使う
    	 * @param n
    	 * @return
    	 */
    	long pollardRho(long n) {
    		LOOP:
    		for (int c = 1; ; ) {
    			if (c >= 5)
    				return n;
     
    			long x = 1, y = 0, p = 1;
    			long two = 1;
     
    			for (int i = 1; p == 1; i++) {
    				if (i == two) {
    					y = x;
    					two <<= 1;
    				}
    				x = mod_mul(x, x, n) + c;
    				if (x >= n) x -= n;
     
    				if (x == y) {
    					c++;
    					continue LOOP;
    				}
    				p = gcd(Math.abs(x - y), n);
    			}
    			return p;
    		}
    	}
     
     
    	long[] factorize(long n) {
    		if (isProbablePrime(n)) {
    			return new long[] { n };
    		}
     
    		long[] res = new long[80];
    		int len = 0;
     
    		final int NAIVE_BOUND = 1 << 3;
    		for (int i = 0; primes[i] < NAIVE_BOUND && primes[i] * primes[i] <= n; i++) {
    			final long p = primes[i];
    			while (n % p == 0) {
    				n /= p;
    				res[len++] = p;
    			}
    		}
     
    		if (n != 1) {
    			if (isProbablePrime(n)) {
    				res[len++] = n;
    			} else {
    				long p = pollardRho(n);
    				if (p == n) {
    					res[len++] = n;
    				} else {
    					for (long fi : factorize(p))
    						res[len++] = fi;
    					for (long fi : factorize(n / p))
    						res[len++] = fi;
    				}
    			}
    		}
     
    		res = Arrays.copyOf(res, len);
    		Arrays.sort(res);
    		return res;
     
    	}
    	static void tr(Object... os) { System.err.println(deepToString(os)); }
     
    	public static void main(String[] args) throws Exception {
    		new Main().run();
    	}
     
    	MyScanner sc = null;
    	PrintWriter out = null;
    	public void run() throws Exception {
    		sc = new MyScanner(System.in);
    		out = new PrintWriter(System.out);
    		for (;sc.hasNext();) {
    			solve();
    			out.flush();
    		}
    		out.close();
    	}
     
    	class MyScanner {
    		String line;
    		BufferedReader reader;
    		StringTokenizer tokenizer;
     
    		public MyScanner(InputStream stream) {
    			reader = new BufferedReader(new InputStreamReader(stream));
    			tokenizer = null;
    		}
    		public void eat() {
    			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
    				try {
    					line = reader.readLine();
    					if (line == null) {
    						tokenizer = null;
    						return;
    					}
    					tokenizer = new StringTokenizer(line);
    				} catch (IOException e) {
    					throw new RuntimeException(e);
    				}
    			}
    		}
    		public String next() {
    			eat();
    			return tokenizer.nextToken();
    		}
    		public String nextLine() {
    			try {
    				return reader.readLine();
    			} catch (IOException e) {
    				throw new RuntimeException(e);
    			}
    		}
    		public boolean hasNext() {
    			eat();
    			return (tokenizer != null && tokenizer.hasMoreElements());
    		}
    		public int nextInt() {
    			return Integer.parseInt(next());
    		}
    		public long nextLong() {
    			return Long.parseLong(next());
    		}
    		public double nextDouble() {
    			return Double.parseDouble(next());
    		}
    		public int[] nextIntArray(int n) {
    			int[] a = new int[n];
    			for (int i = 0; i < n; i++) a[i] = nextInt();
    			return a;
    		}
    	}
    }