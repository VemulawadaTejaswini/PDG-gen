import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();   
   int W = sc.nextInt();
   int[] a = new int[N+1];
   int[] b = new int[N+1];
 
   for(int i=1;i<=N;i++)
   {
     a[i] = sc.nextInt();
     b[i] = sc.nextInt();
   }
   long[][] dp = new long[N+1][W+1];
   //N個のうち重さWを超えない最大値のメモ
   dp[0][W]=0;
   for(int i=1;i<=N;i++)
   {
     for(int j =0;j<=W;j++)
     {
       if(j-a[i]>=0&&dp[i-1][j-a[i]]+b[i]>dp[i-1][j]) dp[i][j]=dp[i-1][j-a[i]]+(long)b[i]; 
       else dp[i][j]=dp[i-1][j];
     }
   }
   System.out.println(dp[N][W]);
 }
}