
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9) + 7;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
      	String s = sc.next();
      	// 對每個字母計數
      	int[] charCnt = new int[26];
      	// 每個字母最遠到哪裡，例如finalLoc[0] = 15,代表a最後一次出現的位置
      	int[] finalLoc = new int[26];
      	int len = s.length();
      	
      	for (int i = 1; i < len; i++) {
      		if (s.charAt(i) == s.charAt(i - 1)) {
      			System.out.println((i) + " " + (i + 1));
  				System.exit(0);
      		}
      	}
      	
      	for (int i = 2; i < len; i++) {
      		if (s.charAt(i) == s.charAt(i - 2)) {
      			System.out.println((i - 1) + " " + (i + 1));
  				System.exit(0);
      		}
      	}
      	
      	System.out.println("-1 -1");
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
