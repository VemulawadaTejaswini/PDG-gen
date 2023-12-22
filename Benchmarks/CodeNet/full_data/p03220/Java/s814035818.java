
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 113
	// https://atcoder.jp/contests/abc113/tasks
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int diff = Integer.MAX_VALUE;
		int res = 0;
		int[] heights = new int[n];
		
		for (int i = 0; i < n; i++) {
			heights[i] = sc.nextInt();
			heights[i] = t - (int)(heights[i] * 0.06);
		}
		
		for (int i = 0; i < n; i++) {
			if (Math.abs(heights[i] - a )< diff) {
				diff = Math.abs(heights[i] - a );
				res = i+1;
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
