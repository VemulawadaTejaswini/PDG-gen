import java.util.Scanner;
import java.util.Arrays;

class Main{
        private static int helper(int[] nums, int k){

            int[] dp = new int[nums.length];
            Arrays.fill(dp,Integer.MAX_VALUE);
    
            dp[0] = 0;
    
            for(int i = 0; i < nums.length; i++){
    
                for(int j = i+1;j <= i + k; j++){
                    if(j<nums.length)
                        dp[j] = Math.min(dp[j], dp[i] + Math.abs(nums[i] - nums[j]));
                }
            }
            return dp[dp.length - 1];
        }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        if(k > n){
            System.out.println(0);
            in.close();
            return;
        }

        int[] nums = new int[n];
        for(int i = 0; i < n; i++) nums[i] = in.nextInt();
        in.close();

        System.out.println(helper(nums, k));
        
    }
}