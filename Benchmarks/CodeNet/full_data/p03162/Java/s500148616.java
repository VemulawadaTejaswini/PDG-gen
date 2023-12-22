import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] a=new int[3][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<3;j++){
        a[j][i]=sc.nextInt();
      }
    }
    int[][] dp=new int[3][n];
    for(int i=0;i<3;i++){
      dp[i][0]=a[i][0];
    }
    for(int i=1;i<n;i++){
      for(int j=0;j<3;j++){
        dp[j][i]=Math.max(
          dp[m(j+1)][i-1]+a[j][i],
          dp[m(j+2)][i-1]+a[j][i]
        );
      }
    }
    int ans=Math.max(Math.max(dp[0][n-1],dp[1][n-1]),dp[2][n-1]);
    System.out.println(ans);
  }
  static int m(int i){
    return i>2?i-3:i;
  }
}