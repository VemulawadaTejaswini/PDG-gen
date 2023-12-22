
import java.math.BigDecimal;
import java.util.*;

public class Main {
    private final static Main main = new Main();

    public static void main(String[] args) {
        main.contest();
    }

    private void contest() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long[] list = new long[n];
        for (int i = 0; i < n; ++i) {
            list[i] = sc.nextLong();
        }

        long[][] counts = new long[n + 1][b + 1];
        counts[0][0] = 1;
        long[][] costs = new long[n + 1][b + 1];
        for (long[] row : costs) {
            Arrays.fill(row, -1);
        }
        costs[0][0] = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= b; ++j) {
                long cost = costs[i][j];
                if (cost == -1) {
                    continue;
                }
                // i番目の品を選ばない
                if (costs[i + 1][j] < cost) {
                    costs[i + 1][j] = cost;
                    counts[i + 1][j] = counts[i][j];
                } else if (costs[i + 1][j] == cost) {
                    counts[i + 1][j] += counts[i][j];
                }

                // i番目の品を選ぶ
                if (j < b) {
                    if (costs[i + 1][j + 1] < cost + list[i]) {
                        costs[i + 1][j + 1] = cost + list[i];
                        counts[i + 1][j + 1] = counts[i][j];
                    } else if (costs[i + 1][j + 1] == cost + list[i]) {
                        counts[i + 1][j + 1] += counts[i][j];
                    }
                }
            }
        }

        long num = 0;
        double max = -1;
        for (int i=a; i<=b; ++i) {
            double ave = costs[n][i]/(double) i;
            if (max < ave) {
                max = ave;
                num = counts[n][i];
            } else if (toString(max).equals(toString(ave))) {
                num += counts[n][i];
            }
        }


        System.out.println(BigDecimal.valueOf(max).toPlainString());
        System.out.println(num);
    }

    private String toString(double d) {
        String s = BigDecimal.valueOf(d).toPlainString();
        int index = s.indexOf(".");
        return index == -1 ? s : s.substring(0, index + Math.min(7, s.length()-index));
    }
}
