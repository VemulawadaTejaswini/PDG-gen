import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] count = new int[n+1];
		int[][] cities = new int[m][3];
		String[] res = new String[m];
		
		for (int i = 0; i < m; i++) {
			int P = sc.nextInt();
			int Y = sc.nextInt();
			
			cities[i] = new int[]{P, Y, i};
		}
		
		Arrays.sort(cities, (a, b) -> (a[1] - b[1]));
		
		for (int i = 0; i < m ; i++) {
			//System.out.println(Arrays.toString(cities[i]));
			count[cities[i][0]]++;
			String s = String.format("%06d%06d", cities[i][0], count[cities[i][0]]);
			res[cities[i][2]] = s;
		}
		
		for (String s: res) {
			System.out.println(s);
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