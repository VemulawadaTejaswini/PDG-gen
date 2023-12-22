
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9);
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String s = sc.next();
		
		int res = 0;
		
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i-1)) { res++; }
		}
		
		System.out.println(res);
	}
	
	private static boolean isTwoGroup(int[] w, int[] v, int ingore, int m, int n) {
		int[] groups = new int[n+1];
		for (int i = 1; i < n + 1; i++) {
			groups[i] = i;
		}
		
		for (int i = 0; i < w.length; i++) {
			if (i == ingore) { continue; }
			int pId = groups[w[i]];
			int qId = groups[v[i]];
			
			for (int j = 1; j < n + 1; j++) {
				if (groups[j] == pId) {
					groups[j] = qId;
				}
			}
		}
		
		Set<Integer> set = new HashSet<>();
		
		for (int g: groups) {
			if (g > 0) { set.add(g); }
		}
		
		return set.size() != 1;
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
