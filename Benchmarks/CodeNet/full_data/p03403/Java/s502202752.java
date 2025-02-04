import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int all = 0, b = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			all += Math.abs(a[i] - b);
			b = a[i];
		}
		all += Math.abs(a[n-1]);
		int be = 0;
		for(int i = 0; i < n-1; i++) {
			if((a[i] <= a[i+1] && be <= a[i])||(a[i] >= a[i+1] && be >= a[i])) {
				System.out.println(all);
			}else {
				int now = all - (Math.abs(a[i]-b)+Math.abs(a[i+1]-a[i]))+Math.abs(a[i+1]-b);
				System.out.println(now);
			}
			b = a[i];
		}
		System.out.println(all - Math.abs(a[n-1])-Math.abs(a[n-1]-a[n-2])+Math.abs(a[n-2]));
	}

	static class FastScanner {
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
}
