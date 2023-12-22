import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int S = sc.nextInt() - 1;
            int T = sc.nextInt() - 1;
            g.get(S).add(T);
        }
        double ans = 1e10;
        double[] dp = new double[N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp, 0.0);
            for (int j = N - 2; j >= 0; j--) {
                double sum = 0;
                double max = 0;
                for (int n : g.get(j)) {
                    sum += dp[n];
                    max = Math.max(max, dp[n]);
                }
                dp[j] = sum / g.get(j).size() + 1;
                if (j == i && g.get(j).size() > 1) {
                    dp[j] = (sum - max) / (g.get(j).size() - 1) + 1;
                }
            }
            ans = Math.min(ans, dp[0]);
        }
        System.out.printf("%.9f\n", ans);
    }
}
