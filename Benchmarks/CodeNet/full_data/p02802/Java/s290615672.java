import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), m = fs.nextInt();
		int P[] = new int[m];
		String[] S = new String[m];
		for(int i=0;i<m;i++) {
			P[i] = fs.nextInt() - 1;
			S[i] = fs.next();
		}
		int ac[] = new int[n];
		int wa[] = new int[n];
		for(int i=0;i<m;i++) {
			int p = P[i];
			String s = S[i];
			if("AC".equals(s)){
				ac[p]=1;
			}
			else {
				if(ac[p]!=1) {
					wa[p]++;
				}
			}
		}
		
		int ansac = 0;
		int answa = 0;
		for(int i=0;i<n;i++) {
			if(ac[i]==1) {
				ansac++;
				answa += wa[i];
			}
		}
		System.out.println(ansac + " " + answa);
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