import java.util.*;
import java.io.*;

class Main {

     public static void main(String []args){
        FastReader sc = new FastReader();
        
        int n = sc.nextInt(), k = sc.nextInt();
        int [] heights = new int [n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        int [] dp = new int [n];
        
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
            for (int j = i - 2; j >= Math.max(0, i - k); j--) {
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(heights[i] - heights[j]));
            }
        }
        
        System.out.println(dp[n - 1]);
     }
     
     static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
  
}