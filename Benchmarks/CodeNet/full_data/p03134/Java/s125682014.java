import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static long mod = 998244353;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        char[] s= sc.next().toCharArray();
        int n = s.length;
        int[] red = new int[n+1], blue = new int[n+1];
        for(int i=1;i<=n;i++){
            int curBlue = s[i-1]-'0';
            red[i]=red[i-1]+2-curBlue;
            blue[i]=blue[i-1]+curBlue;
        }
        int maxBlue = blue[n];
        // dp[i][j]: take i balls, among which j are blue (i-j are red);
        long[][] dp = new long[n*2+1][maxBlue+1];
        //long all = red[n]+blue[n];
        dp[0][0]=1;
        for(int i=1;i<=2*n;i++){
            for(int j=0;j<=Math.min(i,blue[Math.min(i,n)]);j++){
                if(red[Math.min(i,n)]<i-j) continue;
                dp[i][j] = dp[i-1][j];
                if(j>=1) dp[i][j] = (dp[i][j]+dp[i-1][j-1])%mod;
            }
        }
        System.out.println(dp[2*n][maxBlue]);
    }
}
