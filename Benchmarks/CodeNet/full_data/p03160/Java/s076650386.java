public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= i + 2; j++) {
                if(j < n) {
                    dp[j] = Math.min(dp[j], dp[i] + Math.abs(nums[j] - nums[i]));
                }
            }
        }
        System.out.println(dp[n - 1]);
    }

}