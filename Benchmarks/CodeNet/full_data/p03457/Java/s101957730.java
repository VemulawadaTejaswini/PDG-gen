
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner fc = new FastScanner(System.in);
		int N = fc.nextInt();
		int[] t = new int[N + 1];
		int[] x = new int[N + 1];
		int[] y = new int[N + 1];

		t[0] = 0;
		x[0] = 0;
		y[0] = 0;

		for (int i = 0; i < N; i++) {
			t[i + 1] = fc.nextInt();
			x[i + 1] = fc.nextInt();
			y[i + 1] = fc.nextInt();
		}

		boolean can = true;
		for(int i = 0; i < N; i++) {
			int dt = t[i + 1] - t[i];
			int dist = Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i]);
			if (dt < dist) can = false;
			// dt と distの偶奇は一致する
			if (dist % 2 != dt % 2) can = false;
		}

		if (can) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


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

