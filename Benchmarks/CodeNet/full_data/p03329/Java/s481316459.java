import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] dp = new int[100010];
    dp[0] = 0;
    for (int i = 1; i < 100010; i++){
      dp[i] = i;
    }
    int[] coins = {1, 6, 9, 36, 81, 216, 729, 1296, 6561, 7776, 46656, 59049};

    for (int i = 0; i < 100010; i++){
      for (int j = 0; j < 12; j++){
        if(i-coins[j] < 0) continue;
        dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
      }
    }
    System.out.println(dp[N]);
  }
}