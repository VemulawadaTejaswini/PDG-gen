import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N+1];
        for(int n=0; n<=N; n++) dp[n] = n;
        for(int n=1; n<=N; n++){
            int m = 1;
            while(m<=N){
                if(n>=m) dp[n] = Math.min(dp[n], 1+dp[n-m]);
                m *= 6;
            }
            m = 1;
            while(m<=N){
                if(n>=m) dp[n] = Math.min(dp[n], 1+dp[n-m]);
                m *= 9;
            }
        }
        System.out.println(dp[N]);
    }
}
