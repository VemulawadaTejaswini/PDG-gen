import java.util.*;
import java.io.*;

//atcoder need change class name to Main
//I - Coins
//https://atcoder.jp/contests/dp/tasks/dp_i

// need read other guy code
public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
  
        int N = nextInt(); 
   
        // Dp array 
        double[][] dp = new double[2][2*N+1]; 
        // 0 row store Temp result
        // 1 row store final result
        // -3 -2 -1 0 1 2 3  --> H-T
        // 0  1  2  3 4 5 6  --> need convert

        // Dp array 
        
        double h = 0;
        double t = 0;
        
        // Let N be a positive odd number.
        h = nextDouble();
        dp[1][N+1] = h;
        dp[1][N-1] = 1 - h;
  
        for (int i=2; i<=N;  i++) {
            h = nextDouble();
            t = 1 - h;
            for (int j=i+N-1; j>0;  j--) {
                dp[0][j+1] += dp[1][j] *h; 
            }
            for (int j=i+N-1; j>0;  j--) {
                dp[0][j-1] += dp[1][j]*t; 
            }
            for (int j=i+N; j>=0;  j--) {
                dp[1][j] = dp[0][j]; 
                dp[0][j] = 0; 
            }
        }


        double sum = 0;
        for (int i=N+1; i<2*N+1;  i++) {
            sum += dp[1][i];
        }
        
        System.out.println(sum);
  
    }
    

    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}