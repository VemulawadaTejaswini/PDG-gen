
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[][] studentPos = new int[n][2];
		int[] useCheckPoint = new int[n];
		int m = sc.nextInt();
		int[][] checkPointPos = new int[m][2];
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			studentPos[i][0] = x;
			studentPos[i][1] = y;
		}
		
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			checkPointPos[i][0] = x;
			checkPointPos[i][1] = y;
		}
		
		for (int i = 0; i < n; i++) {
			int dist = Integer.MAX_VALUE;
			int pos = 0;
			for (int j = 0; j < m; j++) {
				int currDist = Math.abs(studentPos[i][0] - checkPointPos[j][0]) + Math.abs(studentPos[i][1] - checkPointPos[j][1]);
				if (currDist < dist) {
					dist = currDist;
					pos = j + 1;
				}
			}
			useCheckPoint[i] = pos;
		}
		for (int i = 0; i < useCheckPoint.length; i++) {
			System.out.println(useCheckPoint[i]);
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
