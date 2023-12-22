import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n+1][4];
        for(int i=1;i<=n;i++)
         for(int j=1;j<=3;j++)
            a[i][j]=sc.nextInt();

        int dp[][]=new int[n+1][4];
        dp[1][1]=a[1][1];
        dp[1][2]=a[1][2];
        dp[1][3]=a[1][3];
        for(int i=2;i<=n;i++)
        {
            dp[i][1]=a[i][1]+Math.max(dp[i-1][2],dp[i-1][3]);
            dp[i][2]=a[i][2]+Math.max(dp[i-1][1],dp[i-1][3]);
            dp[i][3]=a[i][3]+Math.max(dp[i-1][2],dp[i-1][1]);
        }
        int ans=Math.max(dp[n][3],Math.max(dp[n][1],dp[n][2]));
        System.out.println(ans); 
    }
}