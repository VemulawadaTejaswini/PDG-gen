import java.util.*;
 
class solution{
  public static void main(String[] args){
    Sanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n ; i++) arr[i] = scn.nextInt();
    int[] dp = new int[n];
    Arrays.fill(dp , Integer.MAX_VALUE);
    for(int i = n - 1 ; i > 1 ; i--){
      for(int j = i - 1 ; j >= i - 2 ; j--){
        dp[j] = Math.min(dp[j] , dp[i] + Math.abs(arr[i] - arr[j]));
      }
    }return Math.min(dp[0] , dp[1]);
  }
}