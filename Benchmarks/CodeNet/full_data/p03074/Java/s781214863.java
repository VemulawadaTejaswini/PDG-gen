import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), k = fs.nextInt();
		char c[] = fs.next().toCharArray();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = c[i] - '0';
		}
		boolean zerostart = false;
		if(a[0] == 0)zerostart = true;
		
		List<Integer> ls = new ArrayList<>();
		int cnt = 0;
		int before = -1;
		for(int i = 0;i<n;i++) {
			if(a[i] == before)cnt++;
			else {
				if(i!=0)ls.add(cnt);
				cnt = 1;
				before = a[i];
			}
		}
		ls.add(cnt);
		int len = ls.size();
		int zeronum = 0;
		if(zerostart) {
			zeronum = (len+1)/2;
		}
		else {
			zeronum = len/2;
		}
		
		if(zeronum <= k) {
			System.out.println(n);
			return;
		}
		
		int sum[] = new int[len+1];
		for(int i=0;i<len;i++) sum[i+1] = sum[i] + ls.get(i);
		
		int ans = 0;
		if(!zerostart) {
			for(int i=0;i<len;i+=2) {
				if(i + 2 * k < len) {
					ans = Math.max(ans, sum[2 * k + i + 1] - sum[i]);
				}
			}
		}
		else {			
			//先頭の0を含む場合
			ans = Math.max(ans, sum[2 * k]);
			//先頭の0を含まない場合
			for(int i=1;i<len;i+=2) {
				if(i + 2 * k < len) {
					ans = Math.max(ans, sum[2 * k + i + 1] - sum[i]);
				}
			}
			
		}
		
		//末尾が0で終わる場合
		if(a[n-1]==0) {
			ans = Math.max(ans, sum[len] - sum[len-2*k]);
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