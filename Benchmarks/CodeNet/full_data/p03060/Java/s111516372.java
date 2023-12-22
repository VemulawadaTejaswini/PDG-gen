
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9);
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[] v = new int[n];
		int[] c = new int[n];
		int[] res = {Integer.MIN_VALUE, 0};
		
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		pickGem(0, v, c, 0, 0, res);
		System.out.println(res[0]);
	}
	
	private static void pickGem(
			int pos,
			int[] values,
			int[] costs,
			int x,
			int y,
			int[] res) {
		if (pos == values.length) {
			res[0] = Math.max(res[0], x - y);
		} else {
			pickGem(pos + 1, values, costs, x + values[pos], y+ costs[pos], res);
			pickGem(pos + 1, values, costs, x, y, res);
		}
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
