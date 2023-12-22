import java.util.*;

public class Main {
    public static final long INF = 1L << 60;
    public static long[] dp = new long[100100];
    public static void main(String[] args) throws Exception {
        Arrays.fill(dp,INF);
       Scanner sc = new Scanner(System.in);
       int N = Integer.parseInt(sc.next());
       dp[0] = 0;
       for(int i=0;i<=N;i++){
           dp[i+1] = Math.min(dp[i+1],dp[i]+1);
           for(int j=6;j<=N;j*=6){
               dp[i+j] = Math.min(dp[i+j],dp[i]+1);
           }
           for(int j=9;j<=N;j*=9){
               dp[i+j] = Math.min(dp[i+j],dp[i]+1);
           }
       }
       System.out.println(dp[N]);
    }
}
