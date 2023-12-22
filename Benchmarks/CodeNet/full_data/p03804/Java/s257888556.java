import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9);
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] ori = new char[n][n];
		char[][] trg = new char[m][m];
		
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				ori[i][j] = c;
			}
		}
		
		for (int i = 0; i < m; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				trg[i][j] = c;
			}
		}
		
		for (int i = 0; i < n - m + 1; i++) {
			for (int j = 0; j < n - m + 1; j++) {
				if (ori[i][j] == trg[0][0]) {
					boolean isMatch = true;
					for (int k = i; k < i + m; k++) {
						for (int l = j; l < j + m; l++) {
							if (ori[k][l] != trg[k][l]) {
								isMatch = false;
							}
						}
					}
					if (isMatch) {
						System.out.println("Yes");
						System.exit(0);
					}
				}
			}
		}
		System.out.println("No");
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
