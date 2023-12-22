import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt();
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++) {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
            a[i][2]=sc.nextInt();
        }
        long[][] dp=new long[n][3];
        for(int i=0;i<n;i++) {
            if(i>0) {
                dp[i][0]=a[i][0]+Math.max(dp[i-1][1],dp[i-1][2]);
                dp[i][1]=a[i][1]+Math.max(dp[i-1][0],dp[i-1][2]);
                dp[i][2]=a[i][2]+Math.max(dp[i-1][1],dp[i-1][0]);
            }
            else {
                dp[i][0]=a[i][0];
                dp[i][1]=a[i][1];
                dp[i][2]=a[i][2];
            }
        }
        pw.println(Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]));
        pw.close();
    }
}