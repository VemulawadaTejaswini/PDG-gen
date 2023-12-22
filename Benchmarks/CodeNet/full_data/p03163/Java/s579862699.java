import java.util.*;

class Main{


    private static int solver(int[] weights, int[] values, int n, int w){
        
        int[][] dp = new int[n + 1][w + 1];
        for(int[] row: dp) Arrays.fill(row, 0);

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= w; j++){
                if(weights[i - 1] <= j){
                    dp[i][j] = Math.max(dp[i - 1][j], values[i - 1] + dp[i - 1][j - weights[i - 1]]);
                } else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][w];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // number of items
        int w = in.nextInt(); // max weight
        int[] weights = new int[n];
        int[] values = new int[n];
        
        for(int i = 0; i < n; i++){
            weights[i] = in.nextInt();
            values[i] = in.nextInt();
        }

        System.out.println(solver(weights, values, n, w));
    }



}