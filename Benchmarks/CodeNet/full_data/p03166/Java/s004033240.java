import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] dp = new int[n];
        @SuppressWarnings("unchecked")
        List<Integer>[] sideList = IntStream.range(0, n).mapToObj(i -> new ArrayList()).toArray(List[]::new);
        IntStream.range(0, m).forEach(i -> sideList[scanner.nextInt() - 1].add(scanner.nextInt() - 1));

        int max, max1 = 0;
        boolean hasChanged = true;
        while (hasChanged) {
            hasChanged = false;
            max = max1;
            for (int i = 0; i < n; i++) {
                if (dp[i] == max) {
                    for (int j : sideList[i]) {
                        if (dp[j] <= dp[i]) {
                            max1 = dp[j] = dp[i] + 1;
                            hasChanged = true;
                        }
                    }
                }
            }
        }
        Arrays.stream(dp).max().ifPresent(System.out::println);
    }
}