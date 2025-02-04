import java.util.*;
import java.io.*;

//A - Frog 1

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 
    public static void main(String[] args) throws IOException {
  
        int N = nextInt();
        int dp[] = new int[N+1];

        int input[] = new int[N+1];


        for (int i=1; i<=N;  i++) {
            input[i] = nextInt();
        }

        // now dp time
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;
        for (int i=1; i<=N;  i++) {
            if(i+1<=N){
                dp[i+1] = Math.min(dp[i+1], dp[i] + Math.abs(input[i+1]- input[i]));
            }
            if(i+2<=N){
                dp[i+2] = Math.min(dp[i+2], dp[i] + Math.abs(input[i+2]- input[i]));
            }
        }

        System.out.println(dp[N]);
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