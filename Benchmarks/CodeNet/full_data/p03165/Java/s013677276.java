import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		String a = sc.next();
		String b = sc.next();
		
		int[][] dp = new int[3100][3100];
		
		for(int i = 0; i < a.length(); i++) {
			for(int j = 0; j < b.length(); j++) {
				if(a.charAt(i) == b.charAt(j)) dp[i+1][j+1] = Math.max(dp[i][j] +1, dp[i+1][j+1]);
				
				dp[i+1][j+1] = Math.max(dp[i+1][j+1],  dp[i+1][j]);
				dp[i+1][j+1] = Math.max(dp[i+1][j+1], dp[i][j+1]);
			}
		}
		
		String res = "";
		
		int i = a.length();
		int j = b.length();
		
	    while (i > 0 && j > 0){
	        if (dp[i][j] == dp[i-1][j]) {
	        	i--;
	        }else if (dp[i][j] == dp[i][j-1]) {
	        	j--;
	        }else {
	            res = a.charAt(i-1) + res;
	            i--;
	            j--;
	        }
	    }
		
		out.println(res);
		
		out.flush();
	}
	
	public static int gcd(int a, int b) {
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {

    public Pair(final K key, final V value) {
        super(key, value);
    }
 }

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