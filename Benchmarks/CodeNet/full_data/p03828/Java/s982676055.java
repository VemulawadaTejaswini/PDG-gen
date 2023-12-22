
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	private static final long MOD = (long)Math.pow(10, 9) + 7l;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		
		int[] primes = new int[1001];
		primes[1] = 1;
		int pos = 1;
		
		for (int i = 2; i <= n; i++) {
			int num = i;
			int k = 2;
			while (num >= k) {
				if (num == k) {
					primes[k]++;
					break;
				}
				if (num % k == 0) {
					primes[k]++;
					num /= k;
				} else {
					k++;
				}
			}
		}
		long res = 1L;
		
		for (int i = 1; i <= 1000; i++) {
			if (primes[i] >= 1) {
				res = (res % MOD) * ((primes[i]+1) % MOD);
			}
		}
		// System.out.println(Arrays.toString(primes));
		System.out.println(res/2);
	}
  
    static class FastReader {
	    BufferedReader br;
	    StringTokenizer st;
	
	    public FastReader() {
	      br = new BufferedReader(new InputStreamReader(System.in));
	    }
	  
	    String next() { 
	      while (st == null || !st.hasMoreElements()) {
	        try {
	          st = new StringTokenizer(br.readLine());
	        } catch (IOException  e) {
	          e.printStackTrace();
	        }
	      }
	      return st.nextToken();
	    }
	
	    int nextInt() {
	      return Integer.parseInt(next());
	    }
	
	    long nextLong() {
	      return Long.parseLong(next());
	    }
	
	    double nextDouble() { 
	      return Double.parseDouble(next());
	    }
	
	    String nextLine() {
	      String str = "";
	        try{
	            str = br.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	      }
	  }
}
