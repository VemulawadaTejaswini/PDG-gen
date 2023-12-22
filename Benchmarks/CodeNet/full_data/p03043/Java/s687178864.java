import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int t = 0;
		long bottom = 1, up = 1;
		BigDecimal p = BigDecimal.ZERO;
		for(long i = 1; i <= n; i++) {
			if(i >= k) {
				up += bottom;
			}else if(i == 1){
				bottom = min(i);
			}else {
				long x = min(i);
				up += bottom / x;
			}
		}
		BigDecimal b = BigDecimal.valueOf(n*bottom);
		BigDecimal u = BigDecimal.valueOf(up);
		System.out.println(u.divide(b, 12, BigDecimal.ROUND_HALF_UP));
	}

	static long min(long i) {
		long x = 0;
		double r = 0;
		r = (Math.log(10) - Math.log(i)) / Math.log(2);
		x = (long)r;
		if(r-x != 0) {
			x++;
		}
		long big = (long)Math.pow(2, x);
		return big;
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
