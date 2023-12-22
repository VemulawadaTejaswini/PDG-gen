import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[][]=new int[n][3];
    int[][] dp=new int[n][3];
    for(int i=0;i<n;i++){
      for(int j=0;j<3;j++){
        a[i][j]=sc.nextInt();
        if(i==0){
          dp[i][j]=a[i][j];
        }
      }
    }
    for(int i=1;i<n;i++){
      for(int j=0;j<3;j++){
        if(j==0){
           dp[i][j]=a[i][j]+Math.max(dp[i-1][j+1],dp[i-1][j+2]);
        }
        else if(j==1){
           dp[i][j]=a[i][j]+Math.max(dp[i-1][j-1],dp[i-1][j+1]);
        }
        else if(j==2){
           dp[i][j]=a[i][j]+Math.max(dp[i-1][j-1],dp[i-1][j-2]);
        }
      }
    }
    System.out.print(Math.max(dp[n-1][2],Math.max(dp[n-1][1],dp[n-1][0])));
  }
}