
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9);
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		double dicePossibility = (1.0 / n);
      	int k = sc.nextInt();
      	double res = 0.0;
      	
      	for (int i = 1; i <= n; i++) {
      		// i是骰子的點數 iはサイコロの出目です
      		int score = i;
      		int pow = 0;
      		double coinPossibility = 1.0;
      		if (i < k) {
          		while (score < k) {
          			score *= 2;
          			pow += 1;
          		}
          		// System.out.println(pow);
          		coinPossibility = Math.pow(0.5, pow * 1.0);
      		}
      		res += dicePossibility * coinPossibility;
      	}
      	System.out.println(res);
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
