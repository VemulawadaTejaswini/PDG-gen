import java.util.*;
import java.io.*;

//atcoder need change class name to Main
//H - Grid 1
//https://atcoder.jp/contests/dp/tasks/dp_h


public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
  
        int H = nextInt(); 
        int W = nextInt(); 

       
        // Dp array 
        long[][] dp = new long[H+1][W+1]; 

        dp[0][1] = 1; //set initial start point

        for (int i=1; i<=H;  i++) {
            char[] temp = next().toCharArray();
            for (int j=1; j<=W;  j++) {
                if(temp[j-1] == '#'){//temp is 0 base 
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
                dp[i][j] = dp[i][j] % (1000000007);
            }
        }
 
        //System.out.println(dp[H][W] % (1000000000 + 7));

        System.out.println(dp[H][W]);
  
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