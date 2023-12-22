import java.io.*;
import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();

    int a[] = new int[n];
    for(int i=0;i<n;i++) a[i] = in.nextInt();

    int dp[] = new int[k+1];
    dp[0]=0;
    for(int i=0;i<dp.length;i++)
      for(int j=0;j<a.length;j++){
        if(i-a[j]<0) continue;
        dp[i] += (dp[i-a[j]] == 0 ? 1 : 0);
      }
//      System.out.println(Arrays.toString(dp));
    System.out.println(dp[k]>0 ? "First" : "Second");

  }
}