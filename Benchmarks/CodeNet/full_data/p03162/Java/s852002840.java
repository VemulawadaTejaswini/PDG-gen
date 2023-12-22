import java.util.*;
import java.lang.*;
import java.io.*;
 
public final class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        int[] c = new int[n+1];
        int[][] dp = new int[n+1][4];
        for(int i =0; i< n; i++){
          a[i] = in.nextInt();
          b[i] = in.nextInt();
          c[i] = in.nextInt();
        }
        dp[1][1] = a[1];
        dp[1][2] = b[1];
        dp[1][3] = c[1];

        for(int i =2; i<=n; i++){
           for(int  j =1; j<=3; j++){
              if(j==1){
                dp[i][j] =a[i]+ Math.max(pd[i-1][2],dp[i-1][3]);
              }else if (j == 2) {
                dp[i][j] = b[i] + Math.max(dp[i -1][1], dp[i -1][3]);
              } else {
                dp[i][j] = c[i] + Math.max(dp[i -1][1], dp[i -1][2]);
              }
        }
             
      System.out.println(Math.max(dp[n][1], Math.max(dp[n][2], Math.dp[n][3])));
    }
}