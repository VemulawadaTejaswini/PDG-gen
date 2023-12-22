import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	//二分探索による解法
	//cを固定すると、bに対してaが複数存在してしまいややこしい。
	//bを固定する。(真ん中を固定するのが肝)
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int a[] = fs.nextIntArray(n);
		int b[] = fs.nextIntArray(n);
		int c[] = fs.nextIntArray(n);
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
				
		long ans = 0;
		for(int i=0;i<n;i++) {
			int now = b[i];
			int l = -1, r = n;
			while(l+1<r) {
				int m = (l+r)/2;
				if(a[m]<now)l=m;
				else r = m;
			}
			int memo = l;
			
			l = -1; r = n;
			while(l+1<r) {
				int m = (l+r)/2;
				if(now<c[m])r=m;
				else l=m;
			}
			ans += ((long)memo+1)*(n-r);
		}
		System.out.println(ans);
		
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