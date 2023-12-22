import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		char[] a = sc.next().toCharArray();
	//	Arrays.sort(a);
		int[] n = new int[3];
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 'a') n[0]++;
			else if(a[i] == 'b') n[1]++;
			else n[2]++;
		}
		Arrays.sort(n);
		if(n[0] == 0 && (n[1] > 1 || n[2] > 1)) {
			System.out.println("NO");
		}else if(n[0] == 0 && n[1] == 0 && n[2] > 1){
			System.out.println("NO");
		}else if(n[0] == 0 && n[1] == 0 && n[2] == 1) {
			System.out.println("YES");
		}else if(n[2] - n[0] < 3 && n[1] - n[0] < 3) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
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
