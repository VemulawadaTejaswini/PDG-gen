import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = Math.abs(nums[1] - nums[0]);
        for(int i = 2; i < n; i++) {
            for(int h = k; h >= 1; h--) {
                try{
                    dp[i] = Math.min(dp[i], dp[i - h] + Math.abs(nums[i] - nums[i - h]));
                } catch(Exception e) {

                }

            }
        }
        System.out.println(dp[n - 1]);
    }
}
