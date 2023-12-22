import java.util.*;
import java.io.*;

class EratosSieve{
	//0~xまでの篩の配列を返す。配列値は素数なら-1。素数でなければ、最大の素因数。
	int[] getSieve(int x) {
		int sieve[] = new int[x+1];
		Arrays.fill(sieve, -1);
		for(int i=2;i<=x;i++) {
			if(sieve[i]>=0)continue;
			for(int j=i+i;j<=x;j+=i) {
				sieve[j] = i;
			}
		}
		return sieve;
	}
	//0~xまでの、素数のSetを返す
	Set<Integer> getPrimeSet(int x){
		Set<Integer> primeSet = new HashSet<>();
		int sieve[] = getSieve(x);
		for(int i=2;i<sieve.length;i++) {
			if(sieve[i] < 0)primeSet.add(sieve[i]);
		}
		return primeSet;
	}
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int a[] = fs.nextIntArray(n);
		Map<Integer, Long> map = new HashMap<>();

		EratosSieve es = new EratosSieve();
		int sieve[] = es.getSieve(1000000);
		
		for(int i=0;i<n;i++) {
			int now = a[i];
			
			Map<Integer, Long> tmap = new HashMap<>();
			while(sieve[now]>0) {
				tmap.put(sieve[now], tmap.getOrDefault(sieve[now], 0L) + 1);
				now = now/sieve[now];
			}
			tmap.put(now, tmap.getOrDefault(now, 0L) + 1);			
			for(int key : tmap.keySet()) {
				map.put(key, Math.max(map.getOrDefault(key, 0L), tmap.get(key)));
			}
		}
		
		long t = 1;
		for(int key:map.keySet()) {
			long value = map.get(key);
			t = mul(t, modpow(key, value));
		}
		
		long ans = 0;
		for(int i=0;i<n;i++) {
			long tmp = div(t, a[i]);
			ans = plus(ans, tmp);
		}
		System.out.println(ans);
	}
	

	
	//MOD culculations
	static long plus(long x, long y) {
		return (x + y) % mod;
	}

	static long sub(long x, long y) {
		return (x - y + mod) % mod;
	}

	static long mul(long x, long y) {
		return (x * y) % mod;
	}

	static long div(long x, long y) {
		return x * modpow(y, mod - 2) % mod;
	}

	static long modpow(long x, long y) {
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * modpow(x, y - 1)) % mod;
		long root = modpow(x, y / 2);
		return root * root % mod;
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