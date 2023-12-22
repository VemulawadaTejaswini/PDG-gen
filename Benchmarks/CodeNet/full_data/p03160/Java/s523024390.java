import java.util.Arrays;
import java.util.Scanner;

class Main {


    public static int totalCostIncurred(int[] height, int[] memo) {
        return totalCostHelper(0, height, memo);
    }

    private static int totalCostHelper(int i, int[] height, int[] memo) {
        if(i == height.length - 1) {
            return 0;
        }

        if(memo[i] != -1) {
            return memo[i];
        }

        int cost1 = Math.abs(height[i+1]-height[i]) + totalCostHelper(i+1,height, memo);
        int cost2 = i+2 < height.length ? Math.abs(height[i+2]-height[i]) + totalCostHelper(i+2,height, memo): Integer.MAX_VALUE;
        return memo[i] = Math.min(cost1, cost2);
    }

    private static int totalCostHelperDP(int [] height) {
        int N = height.length;
        int[] dp = new int[N];

        dp[0] = 0;

        for(int i=1; i<N; i++) {
            int possibility1 = (i-1 >= 0) ? dp[i-1] + Math.abs(height[i]-height[i-1]) : Integer.MAX_VALUE;
            int possibility2 = (i-2 >= 0) ? dp[i-2] + Math.abs(height[i]-height[i-2]) : Integer.MAX_VALUE;
            dp[i] = Math.min(possibility1, possibility2);
        }
        return dp[N-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStones = scanner.nextInt();
        int[] height = new int[numberOfStones];
        int[] memo = new int[numberOfStones];
        Arrays.fill(memo, -1);

        for(int i=0; i<height.length; i++)
            height[i] = scanner.nextInt();
        System.out.println(totalCostHelperDP(height));
    }
}