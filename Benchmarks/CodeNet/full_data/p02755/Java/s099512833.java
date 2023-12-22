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
		int a = sc.nextInt(), b = sc.nextInt();
		int es = eight(a)[0], eb = eight(a)[1], ts = ten(b)[0], tb = ten(b)[1];
		if((es >= ts && tb >= eb && tb >= es) || (es >= ts && eb >= tb && tb >= es)) {
			pw.print(es);
		}else if((ts >= es && eb >= tb && eb >= ts) || (ts >= es && tb >= eb && eb >= ts)) {
			pw.print(ts);
		}else {
			pw.print(-1);
		}
		pw.close();


	}

	static int[] eight(int n) {
		int eb = (int)Math.floor((n+0.99)/0.08);
		int es = (int)Math.ceil(n/0.08);
		int[] ei = {es, eb};
		return ei;
	}
	static int[] ten(int n) {
		int tb = (int)Math.floor((n+0.9)/0.1);
		int ts = (int)Math.ceil(n/0.1);
		int[] tn = {ts, tb};
		return tn;
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