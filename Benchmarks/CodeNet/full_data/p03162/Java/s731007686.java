import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int[] a = new int[N+1];
   int[] b = new int[N+1];
   int[] c = new int[N+1];
 
   for(int i=0;i<N;i++)
   {
     a[i] = sc.nextInt();
     b[i] = sc.nextInt();
     c[i] = sc.nextInt();
   }
   int[][] dp = new int[N+1][3];
   dp[0][0]=0;
   dp[0][1]=0;
   dp[0][2]=0;
   dp[1][0]=a[0];
   dp[1][1]=b[0];
   dp[1][2]=c[0];

   for(int i=2;i<=N;i++)
   {
     if(dp[i-1][0]+b[i-1]>dp[i-1][2]+b[i-1]) dp[i][1]=dp[i-1][0]+b[i-1];
     else dp[i][1]=dp[i-1][2]+b[i-1];
     if(dp[i-1][1]+a[i-1]>dp[i-1][2]+a[i-1]) dp[i][0]=dp[i-1][1]+a[i-1];
     else dp[i][0]=dp[i-1][2]+a[i-1];
     if(dp[i-1][0]+c[i-1]>dp[i-1][1]+c[i-1]) dp[i][2]=dp[i-1][0]+c[i-1];
     else dp[i][2]=dp[i-1][1]+c[i-1];
   }
   System.out.println(dp[N]);
 }
}