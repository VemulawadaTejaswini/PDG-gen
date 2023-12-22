import java.util.Scanner;

// https://atcoder.jp/contests/dp/tasks/dp_a

class Main {
    // Frog 1
    public static int forg1(int[] stones) {
        int[] dp = new int[stones.length];
        dp[0] = 0;
        dp[1] = Math.abs(stones[1] - stones[0]);

        for (int i = 2; i < stones.length; i++) {
            dp[i] = Math.min(dp[i-1]+Math.abs(stones[i-1]-stones[i]),
            dp[i-2]+Math.abs(stones[i-2]-stones[i]));
        }
        return dp[stones.length-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        // call function hear
        int ret = forg1(arr);
        System.out.println(ret);
    }
}