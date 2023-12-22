import java.util.*;
import java.io.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.solve());
    }

    long solve() {
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++) a[i] = sc.nextLong();
        long[][] dp = new long[n][2];
        // if i%2=0, choose exactly i/2 from a[0:i]; onlyt dp[i][0] matters
        // else choose either (i-1)/2 (dp[i][0]) or (i+1)/2 (dp[i][1]) from [0:i];
        dp[0][0] = 0; dp[0][1] = a[0];
        dp[1][0] = Math.max(a[0],a[1]); dp[1][1] = dp[1][0];
        for(int i=2;i<n;i++){
            if(i%2==1){
                long temp = Math.max(dp[i-1][1], a[i]+dp[i-2][0]);
                dp[i][0] = temp; dp[i][1] = temp;
            } else{
                // first check dp[i][0], choose(i-1)/2
                long v1 = dp[i-1][0]; // choice 1: choose as i-1
                long v2 = a[i]+dp[i-2][0];
                dp[i][0] = Math.max(v1,v2);
                // then check dp[i][1], choose(i+1)/2
                dp[i][1] = a[i] + dp[i-2][1];
            }
        }
        return dp[n-1][0];
    }
}