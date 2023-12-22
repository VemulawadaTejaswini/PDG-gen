import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] X = new int[N][2];
        for (int i = 0; i < N; i++) {
            X[i][0] = in.nextInt();
            X[i][1] = in.nextInt();
        }
        Arrays.sort(X, Comparator.comparing(x -> x[0]));
        int[] dp = new int[N+1];
        dp[N] = 1;
        dp[N-1] = 1;
        List<Integer> start = new ArrayList<>();
        start.add(N - 1);
        for (int i = N - 2; i >= 0; i--) {
            int j = 0;
            int right = X[i][0] + X[i][1];
            for (; j < start.size(); j++) {
                if (right > X[start.get(j)][0]) {
                    dp[i] = dp[start.get(j)] + start.get(j) - i;
                    while (start.size() > j) {
                        start.remove(j);
                    }
                }
            }
            start.add(i);
            if (dp[i] == 0) dp[i] = 1;
        }

        int res = 1;
        for (int i = N - 1; i >= 0; i--) {
            res += dp[i + dp[i]];
            dp[i] = res;
        }
        System.out.println(res);
    }
}