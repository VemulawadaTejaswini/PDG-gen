
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final long MOD = (long)Math.pow(10, 9) + 7l;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] nums = new int[n];
		int[] dp = new int[n];
		
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		// Computer pairs in K = 1
		for (int i = n - 1; i >= 1; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (nums[i] < nums[j]) {
					dp[i]++;
				}
			}
			dp[i - 1] = dp[i];
		}
		
		long pairs = dp[0]% MOD;
		long res = 0;
		long total = (((1 + k)*k / 2)) % MOD;
		res = (pairs % MOD) * (total);
		
		// System.out.println(Arrays.toString(dp));
		System.out.println(res % MOD);
	}
  
	private static boolean isPalindromic(int n) {
		int num = n;
		int total = 0;
		while (num != 0) {
			total *= 10;
			total += (num % 10);
			num /= 10;
		}
		return n == total;
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
