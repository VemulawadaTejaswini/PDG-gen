import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	static int n, a, b, c, l[];
	static int inf = Integer.MAX_VALUE/2;
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt(); 
		a = fs.nextInt();
		b = fs.nextInt();
		c = fs.nextInt();
		l = new int[n];
		for(int i=0;i<n;i++)l[i] = fs.nextInt();
		
		int ans = dfs(0, new int[n]);
		System.out.println(ans);
		
	}
	static int dfs(int t, int ar[]) {
		if(t==n) return calc(ar);
		int res = inf;
		for(int i=0;i<4;i++) {
			ar[t]=i;
			res = Math.min(res, dfs(t+1, ar));
		}
		return res;
	}
	
	static int calc(int ar[]) {
		int al = 0 , bl = 0, cl = 0;
		int acnt = 0, bcnt = 0, ccnt = 0;
		for(int i=0;i<n;i++) {
			if(ar[i]==0) {
				al += l[i];
				acnt++;
			}
			if(ar[i]==1) {
				bl += l[i];
				bcnt++;
			}
			if(ar[i]==2) {
				cl += l[i];
				ccnt++;
			}
			if(ar[i]==3) ;
		}
		if(al==0||bl==0||cl==0) return inf;
		int ans = (acnt - 1) * 10;
		ans += (bcnt - 1) * 10;
		ans += (ccnt - 1) * 10;
		ans += Math.abs(al-a);
		ans += Math.abs(bl-b);
		ans += Math.abs(cl-c);
		return ans;
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