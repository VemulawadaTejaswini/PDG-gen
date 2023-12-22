import java.util.*;
import java.io.*;

//atcoder need change class name to Main
//E - Knapsack 2
//stand dp 
//this time Weight is to big, can not use it as lenght of dp
//loop from right to left

//https://atcoder.jp/contests/dp/tasks/dp_c

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 
    public static void main(String[] args) throws IOException {
  
        int N = nextInt(); 
        int W = nextInt(); 
 
        //no need calc sum, use max 100* 1000
        int maxValue = 100000;
        long[] dp = new long[maxValue+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i=1; i<=N;  i++) {
            int w = nextInt();
            int v = nextInt();
            for (int j=maxValue; j>=v; j--) {// from right to left
                //from right to left,  make usue only use 1
                //this can be use limit item
                //use count array 
                dp[j] = Math.min(dp[j], dp[j-v] + w); 
            }
        }

        for (int i = maxValue; i>=0; i--){
            if (dp[i] <=W) {
                System.out.println(i);
                return;
            }
        }
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