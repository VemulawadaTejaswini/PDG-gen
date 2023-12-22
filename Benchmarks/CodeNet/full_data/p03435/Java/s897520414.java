
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9);
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = 3;
		int[][] f = new int[n][n];
		int[][] rowDiff = new int[n][n];
		int[][] colDiff = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				f[i][j] = sc.nextInt();
			}
		}
		int pos = 0;
		for (int i = 0 ; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = 0; k < n; k++) {
					rowDiff[pos][k] = f[j][k] - f[i][k];
				}
				pos++;
			}
		}
		
		pos = 0;
		for (int i = 0 ; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = 0; k < n; k++) {
					colDiff[k][pos] = f[k][j] - f[k][i];
				}
				pos++;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if ((rowDiff[i][0] != rowDiff[i][1]) || (rowDiff[i][1] != rowDiff[i][2])) {
				System.out.println("No");
				System.exit(0);
			}
			 //System.out.print(Arrays.toString(rowDiff[i]));
		}
		
		for (int i = 0; i < n; i++) {
			if ((colDiff[0][i] != colDiff[1][i]) || (colDiff[1][i] != colDiff[2][i])) {
				System.out.println("No");
				System.exit(0);
			}
			// System.out.print(Arrays.toString(colDiff[i]));
		}
		System.out.println("Yes");
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
