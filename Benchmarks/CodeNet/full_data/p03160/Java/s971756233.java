
import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int stones[] = new int[n+1];
        int dp[] = new int[n+1];
        for(int i = 1 ; i <= n ; i++ ){
            stones[i] = scanner.nextInt();
        }
        System.out.println(solve(stones,dp , n));

    }
    public static int solve(int[] stones , int[] dp , int n ){
        if(n <=1){
            return 0;
        }
        for(int j = 2 ; j<= n ; j++) {
            int opt1 = Math.abs(stones[j] - stones[j-1]) + dp[j-1];
            int opt2= 0;
            if(j == 2){
                opt2 = Integer.MAX_VALUE;
            }else{
                opt2 = Math.abs(stones[j] - stones[j-2]) + dp[j - 2];
            }
            dp[j] = Math.min(opt1, opt2);

        }
        return dp[n];
    }

}
