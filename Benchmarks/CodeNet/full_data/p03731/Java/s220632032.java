
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9) + 7;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		List<Integer[]> intervals = new ArrayList<>();
		
		// 記錄開始與結束段落
		Integer[] interval = new Integer[2];
		
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] time = new int[n];
        
        for (int i = 0; i < n; i++) {
        	time[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
        	int startTime = time[i];
        	int endTime = startTime + t;
        	
        	if (i == 0) {
        		interval[0] = startTime;
        		interval[1] = endTime;
        	} else {
        		if (startTime <= interval[1]) {
        			interval[1] = endTime;
        		} else {
        			intervals.add(Arrays.copyOf(interval, 2));
        			interval[0] = startTime;
        			interval[1] = endTime;
        		}
        	}
        }
        intervals.add(Arrays.copyOf(interval, 2));
        long res = 0;
        for (Integer[] i: intervals) {
        	res += (i[1] - i[0]);
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
