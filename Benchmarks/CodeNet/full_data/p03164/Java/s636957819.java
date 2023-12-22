import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();
        int[] w = new int[n];
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        //long start = System.nanoTime();
        System.out.println(solve(n, W, w, v));
        //long end = System.nanoTime();
        //System.err.println("execution time: " + ((end-start)/1_000_000) + "ms");
    }
    private static int solve(int n, int W, int[] w, int[] v) {
        int[] dp = new int[W+1];
        for (int j = 1; j < W+1; j++) {
            dp[j] = (w[0] <= j) ? v[0]: 0;
        }
        for (int i = 1; i < n; i++) {
            for (int j = W; j >= w[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
            }
        }
        return dp[W];
    }
}
