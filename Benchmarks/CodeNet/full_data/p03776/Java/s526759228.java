import java.util.Scanner;

public class Main{
  static int n, a, b;
  static long[] v;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    a = sc.nextInt();
    b = sc.nextInt();
    v = new long[n];
    for(int i = 0; i < n; i++){
      v[i] = sc.nextLong();
    }

    long[][] dp = new long[n + 1][b + 1];
    long[][] dp2 = new long[n + 1][b + 1];
    for(int i = 0; i <= n; i++){
      dp2[i][0] = 1;
    }
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= b; j++){
        if(dp[i - 1][j] > dp[i - 1][j - 1] + v[i - 1]){
          dp[i][j] = dp[i - 1][j];
          dp2[i][j] = dp2[i - 1][j];
        }
        else if(dp[i - 1][j] < dp[i - 1][j - 1] + v[i - 1]){
          dp[i][j] = dp[i - 1][j - 1] + v[i - 1];
          dp2[i][j] = dp2[i - 1][j - 1];
        }
        else{
          dp[i][j] = dp[i - 1][j];
          dp2[i][j] = dp2[i - 1][j] + dp2[i - 1][j - 1];
        }
      }
    }

    double max = 0;
    for(int j = a; j <= b; j++){
      double ave = (double)dp[n][j] / (double)j;
      if(ave > max){
        max = ave;
      }
    }

    long count = 0;
    for(int j = a; j <= b; j++){
      if(((double)dp[n][j]) == max * j){
        count += dp2[n][j];
      }
    }

    System.out.println(max);
    System.out.println(count);
  }
}
