import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[] cards = new int[n+1];
		
		for (int i = 1; i <= n; i++) {
			 int card = sc.nextInt();
			 cards[i] += card;
		}
		
		long res = 0;
		
		for (int i = 1; i <= n; i++) {
			res += cards[i]/2;
			cards[i] -= cards[i]/2 * 2;
			if (i < n && cards[i] > 0 && cards[i+1] > 0) {
				int min = Math.min(cards[i], cards[i+1]);
				res += min;
				cards[i] -= min;
				cards[i+1] -= min;
			} 
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