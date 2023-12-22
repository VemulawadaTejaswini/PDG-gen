import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int n=0; n<N; n++){
            A[n]=sc.nextInt();
            B[n]=sc.nextInt();
        }

        //dp[n][h]:n種類の魔法で, hのダメージを与えるのに必要な最小魔力

        long[][] dp = new long[N+1][21000];
        for(int n=0; n<=N; n++)for(int h=0; h<21000; h++) dp[n][h]=5000000000000000L;


        for(int n=0; n<=N; n++) for(int h=0; h<21000; h++){
            if(h==0) dp[n][h]=0;
            if(n>0 && h-A[n-1]>=0){
                dp[n][h] = Math.min(dp[n][h], dp[n-1][h]);
                dp[n][h] = Math.min(dp[n][h], B[n-1]+dp[n-1][h-A[n-1]]);
                dp[n][h] = Math.min(dp[n][h], B[n-1]+dp[n][h-A[n-1]]);
            }
        }

        long ans = 5000000000000000L;
        for(int h=H; h<21000; h++){
            ans = Math.min(ans, dp[N][h]);
        }
        System.out.println(ans);
    }
}
