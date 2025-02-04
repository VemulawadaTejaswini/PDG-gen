import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        int[] nums = new int[n];
        int[] dp = new int[n];
        line = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(line[i]);
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            int maxLen = Math.max(i + k, nums.length);

            for (int j = i; j < maxLen; j++) {
                dp[i] = Math.min(dp[i], dp[i] + Math.abs(nums[j] - nums[i]));
            }
        }

        System.out.println(dp[n - 1]);
    }
}
