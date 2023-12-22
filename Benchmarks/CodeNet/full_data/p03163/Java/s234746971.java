import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

/**
 * Knapsack problem 1 - N items each having weight w(i). 
 * Find the maximum amount of items that Taro can take. 
 */

public class Main {  
 
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
  
    public static void main(String[] args) { 
        
        FastReader s=new FastReader(); 

        int N = s.nextInt(); // can be upto 100
        int W = s.nextInt(); // limit - 10^5

        int[] w = new int[N]; // has W elements
        long[] v = new long[N]; // limit - 10^9 
        
        long[][] dp = new long[N+1][W+1];
        

        for (int i = 0; i < N; i++) {
            w[i] = s.nextInt();
            v[i] = s.nextLong();
        }

        // System.out.println("Weights: " + Arrays.toString(w));
        // System.out.println("Values: " + Arrays.toString(v));

        // for (int i = 0; i < 1; i++) {
        //     for (int j = 0; j < 1; j++) {
        //         dp[i][j] = 0;
        //     }
        // }

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= W; j++) {
                // if (i-1 >= 0 && j-w[i-1] >= 0) {
                    /*
                    if (w[i-1] <= W) {
                        dp[i][j] = Math.max(v[i-1] + dp[i-1][j-w[i-1]], dp[i-1][j]);
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                    */
                    if (j < w[i-1]) {
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = Math.max(v[i-1] + dp[i-1][j-w[i-1]], dp[i-1][j]);
                    }
                // }
            }
        }
        
        // System.out.println(Arrays.deepToString(dp));
        System.out.println(dp[N][W]);
    }
        

}
