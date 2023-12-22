import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int t[] = new int[n];
		int v[] = new int[n];
		for(int i=0;i<n;i++)t[i] = fs.nextInt();
		for(int i=0;i<n;i++)v[i] = fs.nextInt();
		
		int tsum[] = new int[n+1];
		for(int i=0;i<n;i++)tsum[i+1]=tsum[i]+t[i];
		int total = 0;
		for(int i=0;i<n;i++) total += t[i];
		//0.5ずつ速度を求める。
		
		double maxV[] = new double[2*total+3];
		Arrays.fill(maxV, 1e9);
		for(int i=0;i<n;i++) {
			if(i==0) {
				for(int j=0;j<tsum[i+1];j++) {
					maxV[2*j] = Math.min(maxV[2*j],v[i]);
					maxV[2*j+1] = Math.min(maxV[2*j+1],v[i]);
					maxV[2*j+2] = Math.min(maxV[2*j+2],v[i]);
				}
			}
			else {
				for(int j=tsum[i];j<tsum[i+1];j++) {
					maxV[2*j] = Math.min(maxV[2*j],v[i]);
					maxV[2*j+1] = Math.min(maxV[2*j+1],v[i]);
					maxV[2*j+2] = Math.min(maxV[2*j+2],v[i]);
				}
			}
		}
		
		
		
		maxV[0]=0;
		for(int i=1;i<=2*total;i++) {
			maxV[i] = Math.min(maxV[i], maxV[i-1]+0.5); 
		}
		maxV[2*total]=0;
		for(int i=2*total;i>0;i--) {
			maxV[i-1] = Math.min(maxV[i-1], maxV[i]+0.5);  
		}
		
		double ans = 0;
		for(int i=0;i<2*total;i++) {
			double max = Math.max(maxV[i], maxV[i+1]);
			double min = Math.min(maxV[i], maxV[i+1]);
			double square = 0.5 * min;
			double triangle = 0.5 * 0.5 * (max - min);
			double s = square + triangle; //台形の面積
			ans += s;
		}
		System.out.println(ans);
		
		
		
		System.out.println();
		
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