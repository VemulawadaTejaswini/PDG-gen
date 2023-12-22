import java.util.*;
import java.io.*;

//C - Vacation
//simple dp
//build your logic

//https://atcoder.jp/contests/dp/tasks/dp_c

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 
    public static void main(String[] args) throws IOException {
  
        int N = nextInt(); 
        int[][] dp = new int[N+1][3];

        for (int i=1; i<=N;  i++) {
            int a = nextInt();
            int b = nextInt();
            int c = nextInt();
            dp[i][0] = Math.max(dp[i-1][1],dp[i-1][2]) + a;
            dp[i][1] = Math.max(dp[i-1][0],dp[i-1][2]) + b;
            dp[i][2] = Math.max(dp[i-1][1],dp[i-1][0]) + c;
        }
 
        int ans = Math.max(dp[N][1],dp[N][2]);
        ans = Math.max(ans,dp[N][0]);
        
        System.out.println(ans);
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