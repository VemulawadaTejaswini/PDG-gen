import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int minCost(int[] h, int i, int[] dp) {

        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return Math.abs(h[0] - h[1]);
        }
        if(dp[i] !=-1){
            return dp[i];
        }


        return dp[i] = Math.min(minCost(h, i - 1,dp) + Math.abs(h[i] - h[i - 1]), minCost(h, i - 2,dp) + Math.abs(h[i] - h[i - 2]));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int size = scanner.nextInt();
            int[] nums = new int[size];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = scanner.nextInt();
            }
            int[] dp = new int[size];
            Arrays.fill(dp, -1);
            System.out.println(minCost(nums, size - 1, dp));
        } finally {
            scanner.close();
        }
    }
}