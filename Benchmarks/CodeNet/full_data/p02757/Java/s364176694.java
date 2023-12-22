import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), p = fs.nextInt();
		String s = fs.next();
		char c[] = s.toCharArray();
		int a[] = new int[n];
		for(int i=0;i<n;i++)a[i] = c[i] - '0';
		
		HashMap<Integer,Long> map = new HashMap<>();
		HashMap<Integer,Long> nmap = new HashMap<>();
		HashMap<Integer,Long> tmp = new HashMap<>();
		
		long ans = 0;
		
		
		for(int i=0;i<n;i++) {
			tmp = nmap;
			nmap = map;
			map = tmp;
			nmap.clear();
			//nmap = new HashMap<>();
			
			//一個前の数字を使うときのあまりがわかっていればいい
			int now = a[i];
			
			for(int key:map.keySet()) {
				long v = map.get(key);
				int rem = (key + now) % p;
				if(rem==0) {
					ans += v;
				}
				int nrem = (key + now)*10 %p;
				nmap.put(nrem, nmap.getOrDefault(nrem, 0L) + v);
			}
			//自分だけ
			int rem = now%p;
			if(rem==0)ans += 1;
			int nrem = now * 10 % p;
			nmap.put(nrem, nmap.getOrDefault(nrem, 0L) + 1);
			
		}
		System.out.println(ans);
	}

	//MOD culculations
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}

	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
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