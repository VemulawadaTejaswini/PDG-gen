import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt() ,m = scan.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) arr[i] = scan.nextInt();

    long result = 0;
    long[][][] dp = new long[n][n][m*n+1];
    for(int i = 0; i < n; i++) {
      dp[i][0][arr[i]]++;
      for(int j = 0; j < dp[i].length; j++) {
        for(int k = 0; k < dp[i][j].length; k++) {
          if(dp[i][j][k]>0 && i!=n-1) {
            dp[i+1][j][k] += dp[i][j][k];
            if(k+arr[i+1] <= m*n) dp[i+1][j+1][k+arr[i+1]] += dp[i][j][k];
          }
        }
      }
    }

    //System.out.println(Arrays.deepToString(dp));

/*
    for(int i = 0; i < n; i++) {
      int dummyResult = 0;
      for(int maisu = 0; maisu < n; maisu++) {
        dummyResult = Math.max(dp[i][maisu][(maisu+1)*m],dummyResult);
        System.out.printf("(%d,%d,%d) = %d\n",i+1,maisu+1,(maisu+1)*m,dp[i][maisu][(maisu+1)*m]);
      }
      result += dummyResult;
      System.out.println("  "+i+","+dummyResult);
    }
    */
    for(int loop = 0; loop < n; loop++) {
      long dummyResult = 0;
      for(int i = 0; i < n; i++) {
        dummyResult = Math.max(dummyResult,dp[i][loop][(loop+1)*m]);
      }
      result += dummyResult;
    }

    System.out.println(result);
  }
}
