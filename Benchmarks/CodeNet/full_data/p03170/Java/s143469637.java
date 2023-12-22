import java.util.*;

public class Main {
    public static void main(String args[]) {
//        System.out.println(playStones(new int[] { 1}, 100000));
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        scan.close();

        System.out.println(playStones(A, K));
    }
    private static String playStones(int[] A, int K) {
        boolean[] dp = new boolean[K + 1];

        for (int k = 1; k <= K; k++) {
            for (int a : A) {
                int leftover = k - a;
                if (leftover < 0) continue;
                if (!dp[leftover]) {
                    dp[k] = true;
                    break;
                }
            }
        }

        return dp[K] ? "First" : "Second";
    }

}