import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bars = { 0, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
        Integer[] as = new Integer[m];
        for (int i = 0; i < m; i++) {
            as[i] = sc.nextInt();
        }
        Arrays.sort(as, Comparator.reverseOrder());

        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < m; j++) {
                if (i - bars[as[j]] < 0) {
                    continue;
                }

                dp[i] = Math.max(dp[i], dp[i - bars[as[j]]] + 1);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int remainBars = n;
        while (remainBars > 0) {
            for (int j = 0; j < m; j++) {
                if (remainBars - bars[as[j]] >= 0 && dp[remainBars - bars[as[j]]] == dp[remainBars] - 1) {
                    sb.append(as[j]);
                    remainBars -= bars[as[j]];
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
