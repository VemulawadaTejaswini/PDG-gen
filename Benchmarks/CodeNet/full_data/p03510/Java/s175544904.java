import java.util.Scanner;
import java.util.stream.LongStream;
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] x = new long[N];
        long[] s = new long[N];
        for(int i=0;i<N;++i){
            x[i] = scan.nextLong();
            s[i] = scan.nextLong();
        }
        long[] dp = new long[N];
        Arrays.fill(dp, Long.MIN_VALUE);
        dp[0] = s[0];
        long ans = dp[0];
        for(int i=1;i<N;++i){
            dp[i] = Math.max(s[i], s[i]+dp[i-1] - (x[i] - x[i-1]));
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);

    }
}