import java.util.Scanner;

class Main{

  private static int solve(int[][] play){
      int N = play.length;
      int K = play[0].length;

      //int max = Math.max(play[0][0], Math.max(play[0][1], play[0][2]));
      int[][] dp = new int[N][K];
      dp[0][0] = play[0][0]; dp[0][1] = play[0][1]; dp[0][2] = play[0][2];
      for(int i = 1; i < N; i++){
          dp[i][0] = play[i][0] + Math.max(dp[i-1][1], dp[i-1][2]);
          dp[i][1] = play[i][1] + Math.max(dp[i-1][0], dp[i-1][2]);
          dp[i][2] = play[i][2] + Math.max(dp[i-1][0], dp[i-1][1]);
      }
      return Math.max(dp[N-1][0], Math.max(dp[N-1][1], dp[N-1][2]));
  }


  public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();

      int[][] play = new int[N][3];

      for(int i = 0; i< play.length; i++){
        for(int j = 0; j < play[0].length; j++){
            play[i][j] = sc.nextInt();
        }
      }

      System.out.println(solve(play));
      if(sc != null)
        sc.close();
  }
}