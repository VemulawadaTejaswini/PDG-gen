import java.util.*;
import java.io.*;

class Med{
	int a, b, c;

	public Med(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), ma = fs.nextInt(), mb = fs.nextInt();
		Med ms[] = new Med[n];
		for(int i=0;i<n;i++) {
			int a = fs.nextInt(), b = fs.nextInt(), c = fs.nextInt();
			ms[i] = new Med(a,b,c);
		}
		//半分全列挙で解けそう。
		//0~N/2個の薬の組み合わせ
		
		int inf = Integer.MAX_VALUE/2;
		int ans = inf;
		
		int m = n/2;
		Map<Integer,Integer> mp = new HashMap<>();
		for(int i=1;i<(1<<m);i++) {
			int ta = 0, tb = 0, tc = 0;
			for(int j=0;j<m;j++) {
				if((i>>j&1)==1) {
					ta += ms[j].a;
					tb += ms[j].b;
					tc += ms[j].c;
				}
			}
			int t = ta*mb-tb*ma;
			if(t == 0) ans = Math.min(ans, tc);
			if(mp.get(t)==null)mp.put(t, tc);
			else {
				if(mp.get(t)>tc)mp.put(t, tc);
			}
		}
		
		int k = m;
		m = n-m;

		for(int i=1;i<(1<<m);i++) {
			int ta = 0, tb = 0, tc = 0;
			for(int j=0;j<m;j++) {
				if((i>>j&1)==1) {
					ta += ms[k+j].a;
					tb += ms[k+j].b;
					tc += ms[k+j].c;
				}
			}
			int t = -(ta*mb-tb*ma);
			if(t == 0) ans = Math.min(ans, tc);
			if(mp.get(t)==null)continue;
			else {
				int res = mp.get(t) + tc;
				ans = Math.min(ans, res);
			}
		}
		
		for(Med t :ms) {
			if(t.a * mb - t.b * ma == 0) {
				ans = Math.min(ans, t.c);
			}
		}
		
		if(ans == inf)System.out.println(-1);
		else System.out.println(ans);
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