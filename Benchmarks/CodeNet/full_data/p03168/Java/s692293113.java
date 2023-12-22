import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      double ar[]=new double[n];
      for(int i=0;i<n;i++){
          ar[i]=sc.nextDouble();
      }
      int num = (int)Math.ceil((n+1)/2);
      double dp[][]=new double[n+1][n+1];
      for(double arr[]:dp){
          Arrays.fill(arr, -1.0);
      }
      double sum=0.0;
      for(int i=num;i<=n;i++){
          
          sum+=findCoins(dp, i, n, ar,0);
      }
      System.out.println(sum);
    }
    public static double findCoins(double[][] dp, int heads, int coins, double ar[], int st){
        
        if(heads > coins){
            return dp[coins][heads]=0.0;
        }
        if(coins==0){
            return  dp[coins][heads]=1.0;
           
        }
        if(dp[coins][heads]!=-1.0){
            return dp[coins][heads];
        }
        if(heads>0) {
            dp[coins][heads]=ar[st]*findCoins(dp,heads-1, coins-1,ar,st+1)+(1-ar[st])*findCoins(dp,heads, coins-1,ar,st+1);
        }
        else{
            dp[coins][heads] = (1-ar[st])*findCoins(dp,heads, coins-1,ar,st+1);
        }
        return dp[coins][heads];
    }
    
}