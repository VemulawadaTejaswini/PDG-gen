import java.util.Scanner;

class Solver {
    public void Solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p[] = new int[n];
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        double max = 0;
        double dp[] = new double[n];
        for (int i = 0; i < k; i++) {
            max += (1.0 * p[i] + 1) / 2;
        }
        dp[k - 1] = max;
        for (int i = k; i < n; i++) {
            dp[i] = dp[i - 1] - (1.0 * p[i - k] + 1) / 2;
            dp[i] += (1.0 * p[i] + 1) / 2;
        }
        for (int i = k - 1; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        int a = 0;
        System.out.println(max);

    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver s = new Solver(sc);
        s.Solve();
        sc.close();
    }
}
