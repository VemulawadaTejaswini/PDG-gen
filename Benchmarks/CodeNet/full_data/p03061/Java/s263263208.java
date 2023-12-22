import java.util.*;
import java.io.*;

public class Main {
	static final int mod = (int) 1e9 + 7;
	static final int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	static final String nextLine = "\n";

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		long r = fs.nextInt(), g = fs.nextInt(), b = fs.nextInt();
		long res = LINF;
		for(int i=-299;i<=299;i++) {
			long right = i + g - 1;
			if(right>299)break;
			
			long ans = 0;
			if(i * right <= 0) {
				ans += align(i) + align(right);
			}
			else {
				continue;
			}
			
			if(right<100-(b-1)/2) {
				b--;
				ans += align(b/2) + align(b - b/2);
				b++;
			}
			else if(right<100){
				b--;
				ans += align(100-right-1) + align(b - (100 - right -1));
				b++;
			}
			else{
				ans +=  - align(right-100) + align(b + right - 100);
			}
			
			if(i>-100+(r-1)/2) {
				r--;
				ans += align(r/2) + align(r - r/2);
				r++;
			}
			else if(i>-100){
				r--;
				ans += align(100+i-1) + align(r - (100 + i -1));
				r++;
			}
			else{
				ans +=  - align(-i-100) + align(r - i - 100);
			}
			
			res = Math.min(res,ans);

		}
		System.out.println(res);
		
	}
	static long align(long x) {
		if(x<0)x = -x;
		return x * (x + 1) / 2;
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