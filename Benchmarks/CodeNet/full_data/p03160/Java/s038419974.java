import java.util.*;
public static class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n ; i++) arr[i] = sc.nextInt();
    int[] dp = new int[n];
    Arrays.fill(dp , Integer.MAX_VALUE);
    dp[0] = 0;
    for(int i = 0 ; i < n ; i++){
      for(int j = i + 1 ; j <= i + 2 ; j++){
        if(j < n) dp[j] = Math.min(dp[i] , dp[i] + Math.abs(arr[j] - arr[i])); 
      }
    }System.out.println(dp[n-1]);
  }
}