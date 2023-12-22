import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[n];
        String[] line = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }

        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(nums[1] - nums[0]);

        for(int i = 2; i < n; i++) {
            int choice1 = Math.abs(nums[i] - nums[i - 1]);
            int choice2 = Math.abs(nums[i] - nums[i - 2]);

            if(choice1 > choice2) {
                dp[i] = dp[i - 2] + choice2;
            } else {
                dp[i] = dp[i - 1] + choice1;
            }
        }

        System.out.println(dp[n - 1]);
    }
}
