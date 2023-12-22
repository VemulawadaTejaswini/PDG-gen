import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int Z = in.nextInt();
            int W = in.nextInt();

            int[] a = new int[N + 1];
            a[0] = W;
            for (int i = 0; i < N; i++) {
                a[i + 1] = in.nextInt();
            }
            int score = -1;
            for (int i = N; i >= 1; i--) {
                int dfs = dfs(i, 0, a);
                if (dfs > score) {
                    score = dfs;
                } else {
                    break;
                }
            }
            System.out.println("" + score);
        }
    }

    private static int dfs(int i, int j, int[] a) {
        if (memo[i][0][j] != -1) {
            return memo[i][0][j];
        }

        if (i == a.length - 1 || j == a.length - 1) {
            int l = Math.abs(a[i] - a[j]);
            memo[i][0][j] = l;
            return l;
        }

        if (i < j) {
            int max = 0;
            for (int l = j + 1; l < a.length; l++) {
                max = Math.max(max, dfs(l, j, a));
            }
            memo[i][0][j] = max;
            return max;
        } else {
            int min = (int) 1e9;
            for (int l = i + 1; l < a.length; l++) {
                min = Math.min(min, dfs(i, l, a));
            }
            memo[i][0][j] = min;
            return min;
        }
    }

    private static int[][][] memo = new int[2002][2][2002];
    static {
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }
    }

}

final class Utils {
    private Utils() {
    }

    public static final void debug(Object... o) {
        System.err.println(toString(o));
    }

    public static final String toString(Object... o) {
        return Arrays.deepToString(o);
    }

}
