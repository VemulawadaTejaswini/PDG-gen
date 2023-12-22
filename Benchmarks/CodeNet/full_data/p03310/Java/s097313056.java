import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int N = fs.nextInt();
		int A[] = fs.nextIntArray(N);
		long sum[] = new long[N+1];
		sum[0] = 0;
		for(int i=0;i<N;i++) sum[i+1]=sum[i]+A[i];
		
		long ans = Long.MAX_VALUE/2;
		for(int center=3;center<N;center++) {
			//左のPとQ
			long suml = sum[center-1];
			long hsuml = suml/2;
			//左の配列について二分探索
			int l = -1, r = center;
			while(l+1<r) {
				int c = (l + r)/2;
				if(sum[c]<hsuml)l=c;
				else r = c;
			}
			long P1 = sum[l];
			long Q1 = suml - P1;
			long P2 = sum[r];
			long Q2 = suml - P2;
			
			//右のRとS
			long sumr = sum[N]-suml;
			long hsumr = sumr/2;
			//右の配列について二分探索
			l = center-1; r = N+1; 
			while(l+1<r) {
				int c = (l + r)/2;
				if(sum[c]<hsumr+sum[center-1])l=c;
				else r = c;
			}
			if(l==center-1) {
				l++;r++;
			}
			long R1 = sum[l]-sum[center-1];
			long S1 = sumr - R1;
			long R2 = sum[r]-sum[center-1];
			long S2 = sumr - R2;
			
			ans = Math.min(ans, absmax(P1,Q1,R1,S1));
			ans = Math.min(ans, absmax(P1,Q1,R2,S2));
			ans = Math.min(ans, absmax(P2,Q2,R1,S1));			
			ans = Math.min(ans, absmax(P2,Q2,R2,S2));			
			
		}
		System.out.println(ans);
	}
	static long absmax(long P, long Q, long R, long S) {
		long t[] = {P,Q,R,S};
		Arrays.sort(t);
		long res = t[3] - t[0];
		return res;
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