import java.util.*;

public class Main {

    private static final int[] ns = new int[]{2, 5, 5, 4, 5, 6, 3, 7, 6};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];
        for (int m = 0; m < M; m += 1) {
            A[m] = sc.nextInt();
        }

        int[] dp = new int[N + 1];
        dp[0] = 0;
        for (int n = 1; n <= N; n += 1) {
            int next = -1;
            for (int a : A) {
                if (n - ns[a - 1] < 0 || n - ns[a - 1] > N) {
                    continue;
                }
                int curNext = dp[n - ns[a - 1]] + 1;
                if (next < curNext) {
                    next = curNext;
                }
            }
            dp[n] = next;
        }

        String integer = "";
        int curN = N;
        for (int n = 0; n < dp[N]; n += 1) {
            int curA = 0;
            for (int a : A) {
                if (curA >= a || curN - ns[a - 1] < 0) {
                    continue;
                } else {
                    if (dp[curN - ns[a - 1]] == (dp[curN] - 1)) {
                        curA = a;
                    }
                }
            }
            curN = curN - ns[curA - 1];
            integer += curA;
        }

        System.out.println(integer);

    }

}
