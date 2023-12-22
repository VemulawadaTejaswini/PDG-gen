import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    // k++;
    long[][] dp = new long[n][k+1];
    for(int i=0;i<n;i++){
      int a =sc.nextInt();
      int b = sc.nextInt();
      for(int j=0;j<k+1;j++){
        if(i==0){
          if(j>=a){
            dp[i][j]=b;
          }
        }
        else{
          if(j<a){
            dp[i][j]=dp[i-1][j];
          }
          else{
            dp[i][j]=Math.max(dp[i-1][j],b+dp[i-1][j-a]);
          }
        }
      }
    }
    // new helper().print(dp);
    System.out.println(dp[n-1][k]);
  }
}
class helper{
  public void print(long[][] ar){
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[0].length;j++){
        System.out.print(ar[i][j]+" ");
      }
      System.out.println();
    }
  }
}