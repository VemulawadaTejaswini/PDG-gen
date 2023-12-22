import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        int[] ts = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i < N; i++) {
            ts[i] += ts[i - 1];
        }
        int[] vs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        BigDecimal[] dp = new BigDecimal[200 * 100 + 1];
        Arrays.fill(dp, BigDecimal.ZERO);
        int curr = 0;
        for (int i = 1; i < 200 * 100 + 1; i++) {
            if (i >= 2 * ts[N - 1] && dp[i - 1].compareTo(BigDecimal.ZERO) == 0) {
                break;
            }
            BigDecimal vNext = curr == N - 1 ? BigDecimal.ZERO : BigDecimal.valueOf(vs[curr + 1]);
            if (dp[i - 1].subtract(vNext).compareTo(BigDecimal.valueOf(ts[curr]).subtract(BigDecimal.valueOf(i - 1).divide(BigDecimal.valueOf(2)))) == 0) {
                dp[i] =  dp[i - 1].subtract(BigDecimal.valueOf(0.5));
            } else if (BigDecimal.valueOf(vs[curr]).compareTo(dp[i - 1]) > 0) {
                dp[i] =  dp[i - 1].add(BigDecimal.valueOf(0.5));
            } else if (BigDecimal.valueOf(vs[curr]).compareTo(dp[i - 1]) == 0) {
                dp[i] =  dp[i - 1];
            }
            // System.out.printf("%.1f %.1f \n", i / 2.0, dp[i].doubleValue());
            if (curr != N - 1 && 2 * ts[curr] == i) {
                curr++;
            }
        }
        System.out.printf("%.3f\n", Arrays.stream(dp).mapToDouble(BigDecimal::doubleValue).sum() / 2.0);
    }

}