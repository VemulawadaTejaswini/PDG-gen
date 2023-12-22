import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cap = scan.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];

        int maxValue = 0;
        for(int i = 0 ; i < n ; i++) {
            weights[i] = scan.nextInt();
            values[i] = scan.nextInt();
            maxValue += values[i];
        }

        // approach = bottom-up. but state has value and index.
        // we build the min weights table and find out if we are including the new item or not. 

        long[][] dp = new long[n+1][maxValue+1];
        long optimalValue = 0;
        for(int index = 0 ; index <= n ; index++) {
            for(int value = 1 ; value <= maxValue ; value++) {
                dp[index][value] = 1000000009; // initialize with +INF for the current cell.
            }
        }

        for(int index = 1 ; index <= n ; index++) {
            // Row signifies set of all the elements until this row index. 
            int vi = values[index-1];
            int wi = weights[index-1];
            for(int value = 1 ; value <= maxValue ; value++) {
                if(vi <= value){
                    dp[index][value] = Math.min(dp[index-1][value], wi + dp[index-1][value-vi]);
                } else {
                    dp[index][value] = dp[index-1][value];
                }
            }
        }

        int result = 0;
        for(int col = 0 ; col < maxValue+1;col++){
            if(dp[n][col] <= cap){
                result = col;
            } 
        }
                System.out.println(result);
    }
}
