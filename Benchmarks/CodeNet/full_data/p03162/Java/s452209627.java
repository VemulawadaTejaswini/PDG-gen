public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int dp[][] = new int[n+1][4];
        int activity[][] = new int[n+1][4];
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=3 ; j++){
                activity[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solve(n,activity,dp));
    }
  public static int solve(int n , int[][] activity , int[][] dp){
        dp[1][1] = activity[1][1];
        dp[1][2] = activity[1][2];
        dp[1][3] = activity[1][3];
        for(int i = 2 ; i<= n ; i++){
            dp[i][1] = activity[i][1] + Math.max(dp[i-1][2] ,dp[i-1][3]);
            dp[i][2] = activity[i][2] + Math.max(dp[i-1][1] , dp[i-1][3]);
            dp[i][3] = activity[i][3] + Math.max(dp[i-1][2] ,dp[i-1][1]);
        }
      return Math.max(Math.max(dp[n][1],dp[n][2]),dp[n][3]);
  }
}





