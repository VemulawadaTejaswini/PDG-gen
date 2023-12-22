import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());
        List<Integer>[] edges = new List[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int s = Integer.parseInt(scanner.next());
            int t = Integer.parseInt(scanner.next());
            edges[s - 1].add(t - 1);
        }

        double[] dp = new double[N];
        for(int i = N - 2; i >= 0; i--) {
            double sum = 0;
            for (int next: edges[i]) {
                sum += dp[next];
            }
            sum /= edges[i].size();
            sum += 1;
            dp[i] = sum;
        }

        double ans = dp[0];
        for (int i = 0; i < N - 1; i++) {
            if (edges[i].size() == 1) continue;
            int maxNext = edges[i].get(0);
            for (int next: edges[i]) {
                if (dp[maxNext] < dp[next]) {
                    maxNext = next;
                }
            }
            // ignore edge (i -> maxNext)

            double[] dp2 = new double[N];
            for(int j = N - 2; j >= 0; j--) {
                double sum = 0;
                for (int next: edges[j]) {
                    if (j == i && next == maxNext) continue;
                    sum += dp[next];
                }
                sum /= (j == i) ? edges[j].size() - 1 : edges[j].size();
                sum += 1;
                dp2[j] = sum;
            }

            ans = Math.min(ans, dp2[0]);
        }

        System.out.printf("%.10f\n", ans);
    }
}
