import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		long m = fs.nextLong();
		long a[] = fs.nextLongArray(n);

		for(int i=0;i<n;i++) {
			a[i] /= 2;
		}

		int cnt = 0;
		for(int i=0;i<n;i++) {
			int subcnt = 0;
			while(a[i]%2==0) {
				a[i]/=2;
				subcnt++;
			}
			if(i!=0 && cnt != subcnt) {
				System.out.println(0);
				return;
			}
			cnt = subcnt;
		}
		
		long lcm = 1;
		for(int i=0;i<n;i++) {
			lcm = lcm(a[i], lcm);
			if(lcm > m) {
				System.out.println(0);
				return;
			}		
		}
		
		long result = m / lcm;
		long ans = ( result + 1 )/ 2;
		
		System.out.println(ans);
		
	}
	
	static long lcm(long x, long y) {
		return x / gcd(x, y) * y;
	}
	
	static long gcd(long x, long y) {
        return y==0? x : gcd(y,x%y);
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
