import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String[] num = sc.nextLine();
    String[] s = sc.nextLine();
    String[] t = sc.nextLine();
    int n = Integer.parseInt(num[0]);
    int m = Integer.parseInt(num[1]);
    int[][] dp = new int[n+1][m+1]
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= m; j++){
        dp[i][j] = 1 + dp[i-1][j] + dp[i][j-1];
        if (s[i-1].equals(t[j-1])){
          dp[i][j] -= 1 + dp[i-1][j-1];
        }
      }
    }
    System.out.println((dp[-1][-1]+1) % 1000000007);
  }
}
