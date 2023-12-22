import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt() , k = fs.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = fs.nextInt();
		}
		
		int rdp[][] = new int[n+1][5001];
		
		rdp[0][0] = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<5001;j++) {
				if(rdp[i][j]>0)rdp[i+1][j]=1;
				if(j+a[n-1-i]<5000) {
					if(rdp[i][j]>0)rdp[i+1][j+a[n-1-i]]=1;
				}
			}	
		}
		
		//累積和にする
		for(int i=0;i<n+1;i++) {
			for(int j=5000;j>=1;j--) {
				rdp[i][j-1] += rdp[i][j];
			}
		}
		
		int ans = n;
		boolean dp[][] = new boolean[2][5001];
		dp[0][0] = true;
		for(int i=0;i<n;i++) {
			for(int j=0;j<5001;j++) {
				dp[(i+1)&1][j] |= dp[i&1][j];
				if(j+a[i]>5000) {
					dp[(i+1)&1][5000]|=dp[i&1][j];
				}
				else {
					dp[(i+1)&1][j+a[i]]|=dp[i&1][j];
				}
			}	
			for(int j=0;j<=k;j++) {
				if(dp[i&1][j]) {
					if(rdp[n-i-1][(int)Math.max(0,k-j-a[i])] - rdp[n-i-1][k-j]>0) {
						ans--;
						break;
					}
				}
			}
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


