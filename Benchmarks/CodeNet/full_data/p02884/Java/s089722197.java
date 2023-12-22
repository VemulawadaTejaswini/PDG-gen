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
        for (int ni = 0; ni < N - 1; ni++) {
            if (edges[ni].size() == 1) continue;
            int nj = edges[ni].get(0);
            for (int next: edges[ni]) {
                if (dp[nj] < dp[next]) {
                    nj = next;
                }
            }
            // ignore edge (ni -> nj)

            double[] dp2 = new double[N];
            for(int i = N - 2; i >= 0; i--) {
                double sum = 0;
                for (int next: edges[i]) {
                    if (i == ni && next == nj) continue;
                    sum += dp2[next];
                }
                int deg = edges[i].size();
                if (i == ni) deg--;
                sum /= deg;
                sum += 1;
                dp2[i] = sum;
            }

            ans = Math.min(ans, dp2[0]);
        }

        System.out.printf("%.10f\n", ans);
    }
}
