import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		long a = sc.nextLong(), b = sc.nextLong(), m = sc.nextLong();
		long[] fr = new long[(int)a], wa = new long[(int)b];
		
		long frm = Long.MAX_VALUE;
		for(int i = 0; i < a; i++) {
			long frn = sc.nextLong();
			fr[i] = frn;
			if(frn < frm) frm = frn;
		}
		
		long wam = Long.MAX_VALUE;
		for(int j = 0; j < b; j++) {
			long wan = sc.nextLong();
			wa[j] = wan;
			if(wan < wam) wam = wan;
		}
		
		long to = frm + wam;
		
		long ans = Long.MAX_VALUE;
		
		for(; m > 0; m--) {
			long x = sc.nextLong(), y = sc.nextLong(), c = sc.nextLong();
			long total = fr[(int)x-1]+wa[(int)y-1]-c;
			if(total < ans) ans = total;
		}
		
		if(ans > to) ans = to;
		
		pw.print(ans);
		pw.close();
		
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