import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int m = 2000;
		char a[] = fs.next().toCharArray();
		char b[] = fs.next().toCharArray();
		char c[] = fs.next().toCharArray();
		
		boolean ab[] = new boolean[20000];
		boolean ac[] = new boolean[20000];
		boolean bc[] = new boolean[20000];
		int A = a.length;
		int B = b.length;
		int C = c.length;
		
		char ta[] = new char[3 * m];
		Arrays.fill(ta,'?');
		for(int i=0;i<A;i++) {
			ta[m+i] = a[i];
		}
		
		//aの開始位置とbの開始位置を全探索
		for(int i=-m;i<=m;i++) {
			char tb[] = new char[3 * m];
			Arrays.fill(tb,'?');
			for(int j=0;j<B;j++) {
				tb[m+i+j] = b[j];
			}
			for(int j=m;j<m+A;j++) {
				if(!match(ta[j],tb[j])) ab[i+10000] = true;
			}
		}
		//aの開始位置とcの開始位置を全探索
		for(int i=-m;i<=m;i++) {
			char tc[] = new char[3 * m];
			Arrays.fill(tc,'?');
			for(int j=0;j<C;j++) {
				tc[m+i+j] = c[j];
			}
			for(int j=m;j<m+A;j++) {
				if(!match(ta[j],tc[j])) ac[i+10000] = true;
			}
		}
		//bの開始位置とcの開始位置を全探索(bに対するcのズレ)
		char tb[] = new char[3 * m];
		Arrays.fill(tb,'?');
		for(int i=0;i<B;i++) {
			tb[m+i] = b[i];
		}
		for(int i=-m;i<=m;i++) {
			char tc[] = new char[3 * m];
			Arrays.fill(tc,'?');
			for(int j=0;j<C;j++) {
				tc[m+i+j] = c[j];
			}
			for(int j=m;j<m+B;j++) {
				if(!match(tb[j],tc[j])) bc[i+10000] = true;
			}
		}
		
		int ans = A+B+C;
		
		//  a-b-cみたいな並びの時は、aの末尾から4000離れる可能性がある
		for(int i=-2*m;i<=2*m;i++) {
			int l = INF, r = -INF;
			//aとbをチェック
			if(ab[i+10000]) continue;
			for(int j=-2*m;j<=2*m;j++) {
				//aとcをチェック
				if(ac[j+10000]) continue;
				//bとcをチェック(bに対するcのずれなので、j-i)	
				if(bc[j-i+10000]) continue;					
				l = Math.min(i, j);
				l = Math.min(l, 0);
				r = Math.max(i+B, j+C);
				r = Math.max(r, A);
				ans = Math.min(ans,r - l);
			}
		}
		System.out.println(ans);
	}
	
	static boolean match(char c1, char c2) {
		return (c1=='?'||c2=='?'||c1==c2); 
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