import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[][] t = new int[n-1][3];
		
		for (int i = 0; i < n - 1; i++) {
			t[i][0] = sc.nextInt();
			t[i][1] = sc.nextInt();
			t[i][2] = sc.nextInt();
		}
		
		for (int i = 0; i < n - 1; i++) {
			int res = 0;
			int c = t[i][0];
			int s = t[i][1];
			long arrive = c + s;
			
			for (int j = i + 1; j < n - 1; j++) {
				int readyToGo = t[j][1] + t[j][2];
				
				if (arrive < readyToGo) {
					arrive = readyToGo + t[j][0];
				} else {
					if ((arrive - t[j][1]) % t[j][2] == 0) {
						arrive += t[j][0]; 
					} else {
						arrive = arrive + (t[j][2]) - ((arrive - t[j][1]) % t[j][2]) + t[j][0];
					}
				}
			}
			
			System.out.println(arrive);
		}
		System.out.println(0);
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