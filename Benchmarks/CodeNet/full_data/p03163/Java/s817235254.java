import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt(),
            w=sc.nextInt();
        int[][] a=new int[n][2];
        for(int i=0;i<n;i++) {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        long[][] dp=new long[n+1][w+1];
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=w;j++) {
                if((i==0) || (j==0))
                    dp[i][j]=0;
                else {
                    dp[i][j]=dp[i-1][j];
                    if(a[i-1][0]<=j)
                        dp[i][j]=Math.max(dp[i][j],dp[i-1][j-a[i-1][0]]+a[i-1][1]);
                }
            }
        }
        pw.println(dp[n][w]);
        pw.close();
    }
}