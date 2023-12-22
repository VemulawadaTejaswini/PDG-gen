import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), W = scanner.nextInt();
        scanner.nextLine();

        int w = 0;
        List<List<Integer>> items = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            items.add(new ArrayList<>());
        }
        for (int i = 0; i < N; i++) {
            int[] item = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i == 0) {
                w = item[0];
            }
            items.get(item[0] - w).add(item[1]);
        }
        for (List<Integer> l : items) {
            l.sort(Comparator.comparingInt(x -> -x));
        }

        int w1 = items.get(0).size();
        int w2 = items.get(1).size();
        int w3 = items.get(2).size();
        int w4 = items.get(3).size();

        long[][][][] dp = new long[w1 + 1][w2 + 1][w3 + 1][w4 + 1];
        long ans = 0L;
        for (int i1 = 0; i1 <= w1; i1++) {
            for (int i2 = 0; i2 <= w2; i2++) {
                for (int i3 = 0; i3 <= w3; i3++) {
                    for (int i4 = 0; i4 <= w4; i4++) {
                        if (i1 * w + i2 * (w + 1) + i3 * (w + 2) + i4 * (w + 4) > W) {
                            continue;
                        }
                        if (i1 > 0) {
                            dp[i1][i2][i3][i4] =
                                    Math.max(
                                            dp[i1][i2][i3][i4],
                                            dp[i1 - 1][i2][i3][i4] + items.get(0).get(i1 - 1));
                        }
                        if (i2 > 0) {
                            dp[i1][i2][i3][i4] =
                                    Math.max(
                                            dp[i1][i2][i3][i4],
                                            dp[i1][i2 - 1][i3][i4] + items.get(1).get(i2 - 1));
                        }
                        if (i3 > 0) {
                            dp[i1][i2][i3][i4] =
                                    Math.max(
                                            dp[i1][i2][i3][i4],
                                            dp[i1][i2][i3 - 1][i4] + items.get(2).get(i3 - 1));
                        }
                        if (i4 > 0) {
                            dp[i1][i2][i3][i4] =
                                    Math.max(
                                            dp[i1][i2][i3][i4],
                                            dp[i1][i2][i3][i4 - 1] + items.get(3).get(i4 - 1));
                        }
                        ans = Math.max(ans, dp[i1][i2][i3][i4]);
                    }
                }
            }
        }

        System.out.println(ans);
    }

}
