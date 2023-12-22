import java.util.*;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    // long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), T = scanner.nextInt();
        scanner.nextLine();
        int[][] q = new int[N][2];
        for (int i = 0; i < N; i++) {
            q[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        Arrays.sort(q, Comparator.comparing(x -> x[0]));

        int[][] dp = new int[N + 1][T + 1];
        for (int i = 1; i < N + 1; i++) {
            for (int j = 0; j < T + 1; j++) {
                if (j >= q[i - 1][0]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - q[i - 1][0]] + q[i - 1][1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans = Math.max(ans, q[i - 1][1] + dp[i - 1][T - 1]);
        }


        System.out.println(ans);
    }

}
