import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i<n; i++)
      a[i] = sc.nextInt();
    int[] dp = new int[n+1];
    for(int i = 2; i<=n; i++) {
        dp[i] = dp[i-1]+Math.abs(a[i-1]-a[i-2]);
        if(i>=3)
            dp[i] = Math.min(dp[i], dp[i-2]+Math.abs(a[i-3]-a[i-1]));
    }
    System.out.println(dp[n]);
  }
}