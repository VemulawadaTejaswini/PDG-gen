import java.util.Scanner;
import java.util.Arrays;

public class Main{

     // Bottom-up Dynamic Programming approach.
    private static int helper(int[] nums){

        if(nums.length <=1)
            return 0;

        int[] dp = new int[nums.length];
        dp[0] = 0; // not needed, just for verobsity.
        dp[1] = Math.abs(nums[1] - nums[0]);

        for(int i = 2; i < dp.length; i++){
            dp[i] = Math.min(
                Math.abs(nums[i] - nums[i - 1]) + dp[i - 1],
                Math.abs(nums[i] - nums[i - 2]) + dp[i - 2]);
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0){
            System.out.println(0);
            return;
        }
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) nums[i] = in.nextInt();

        System.out.println(helper(nums));
    }
}