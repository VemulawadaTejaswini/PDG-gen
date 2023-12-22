import java.util.*;
public class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      
      int[] arr = new int[n];
      int[] dp = new int[n];
      if(k>n){
           arr = new int[k+1];
      dp = new int[k+1];
      }
      dp[0]=0;
      
      for(int i=0; i<n;i++){
          arr[i] = in.nextInt();
      }
      for(int i=1; i<=k;i++){
          dp[i] = Math.abs(arr[i]-arr[0]);
      }
    //   for(int i=0; i<n; i++){
    //       System.out.print(dp[i]+" ");
    //   }
      
    //   System.out.println();
      for(int i=k+1; i<n;i++){
          dp[i] = dp[i-1]+Math.abs(arr[i]-arr[i-1]);
          for(int j=1; j<=k; j++){
              dp[i] = Math.min(dp[i],dp[i-j]+Math.abs(arr[i]-arr[i-j]));
          }
          
      }
      
    //   for(int i=0; i<n; i++){
    //       System.out.print(dp[i]+" ");
    //   }
    //   System.out.println();
      System.out.print(dp[n-1]);
      
    }
}