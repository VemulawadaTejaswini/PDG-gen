import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
    	FastScanner fs = new FastScanner(System.in);
    	String S = fs.next();
    	int len = S.length();
    	int k = (len+1)/2;
    	int l, r;
    	l = len/2 - 1;
    	if(len % 2 == 0) r = len/2;
    	else r = len/2 + 1;
    	
    	if(len %2 == 1) {
    		if(S.charAt(l)!=S.charAt(l+1)||S.charAt(l+1)!=S.charAt(r)) {
    			System.out.println(k);
    			return;
    		}
    	}
    	while(l>=0&&S.charAt(l) == S.charAt(r)) {
    		k ++;
    		l --;
    		r ++;
    	}
    	System.out.println(k);
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
