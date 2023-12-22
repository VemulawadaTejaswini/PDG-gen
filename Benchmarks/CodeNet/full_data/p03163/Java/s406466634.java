import java.util.*;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        int W = scanner.nextInt();
        int value[] = new int[N+1];
        int weights[] = new int[N+1];
        for(int i = 1 ; i<= N ; i++){
            weights[i] = scanner.nextInt();
            value[i] = scanner.nextInt();
        }
        System.out.println(knapsack(N , W , weights,value));


    }
    public static long knapsack(int N , int W , int[] weights , int[] value){
        long dp[][] = new long[N+1][W+1];

         dp[1][weights[1]] = value[1];

         for(int i = 2 ; i<= N ; i++){
             for(int w = 0 ; w<= W ; w++){

                 dp[i][w] = dp[i-1][w];
                 if(weights[i] > w)
                     continue;
                 dp[i][w] = Math.max(dp[i][w] , value[i] + dp[i - 1][w - weights[i]]);
             }
         }
         
        return dp[N][W];
    }
}
