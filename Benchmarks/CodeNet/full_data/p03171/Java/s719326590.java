import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class Main {
    public static String longer(String x, String y){
        if(x.length() > y.length()) return x;
        else return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        for(int n=0; n<N; n++) a[n]=sc.nextLong();

        long[][] dp = new long[N+1][N+1];
        //dp[i][j] : taro's point with deque which starts with a_i and have j elms
        //a[i], a[i+1], ... +a[i+j-1]
        for(int i=0; i<=N; i++) dp[i][0]=0;
        for(int j=1;j<=N; j++) for(int i=0; i<N; i++) if(i+j<=N){
            dp[i][j] = Math.max(a[i+j-1] - dp[i][j-1],   a[i] - dp[i+1][j-1]);
        }

        System.out.println(dp[0][N]);

    }
}
