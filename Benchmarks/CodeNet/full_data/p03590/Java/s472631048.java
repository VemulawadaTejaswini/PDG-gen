import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created on 2017/09/30 21:46.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String binaryK = Integer.toBinaryString(K);
            int sizeK = binaryK.length();
            List<AbstractMap.SimpleEntry> t = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                t.add(new AbstractMap.SimpleEntry(sc.nextInt(), sc.nextInt()));
            }
            t = t.stream().sorted(
                    (o1, o2) -> Integer.compare((int) o2.getKey(), (int) o1.getKey())
            ).collect(Collectors.toList());

            long[][] dp = new long[N + 1][sizeK + 1];
            for (int i = 0; i < N + 1; i++) {
                Arrays.fill(dp[i], -1);
            }
            dp[0][0] = 0;
            long ans = 0;

            for (int i = 0; i < N; i++) {
                int A = (int) t.get(i).getKey();
                int B = (int) t.get(i).getValue();

                for (int eqSize = 0; eqSize < sizeK + 1; eqSize++) {
                    dp[i + 1][eqSize] = Math.max(dp[i + 1][eqSize], dp[i][eqSize]);

                    if (A > K) {
                        continue;
                    }

                    int cutK = K & (((1 << sizeK) - 1) - ((1 << (sizeK - eqSize)) - 1));
                    int X = cutK | A;

                    if (X > K) {
                        continue;
                    }
                    String binaryX = Integer.toBinaryString(X);
                    while (binaryX.length() < sizeK) {
                        binaryX = "0" + binaryX;
                    }
                    int nextEqSize = 0;
                    while (nextEqSize < sizeK && binaryK.charAt(nextEqSize) == binaryX.charAt(nextEqSize)) {
                        nextEqSize++;
                    }
                    dp[i + 1][nextEqSize] = Math.max(dp[i + 1][nextEqSize], dp[i][eqSize] + B);
                    ans = Math.max(ans, dp[i + 1][nextEqSize]);
                }
            }

            System.out.println(ans);
        }

    }
}