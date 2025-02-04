
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 107
	// https://atcoder.jp/contests/abc107/tasks
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] candies = new int[n];
		int res = Integer.MAX_VALUE;
 		for (int i = 0; i < n; i++) {
 			candies[i] = sc.nextInt();
		}
 		
 		for (int i = 0; i < n - k + 1; i++) {
 			int left = Math.abs(candies[i]) + (candies[i + k - 1] - candies[i]);
 			int right = Math.abs(candies[i + k - 1]) + (candies[i + k - 1] - candies[i]);
 			int tmp = Math.min(left, right);
 			res = Math.min(res, tmp);
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
