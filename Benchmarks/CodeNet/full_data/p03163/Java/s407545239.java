import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private static int getInt() {
        try {
            return Integer.parseInt(READER.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] getIntArr(int n) {
        int[] ans = new int[n];

        StringTokenizer stringTokenizer = null;
        try {
            stringTokenizer = new StringTokenizer(READER.readLine(), " ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < n && stringTokenizer.hasMoreTokens(); i++) {
            ans[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        return ans;
    }

    private static long solve() {
        int[] nw = getIntArr(2);
        int n = nw[0];
        int w = nw[1];

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = Item.of(getIntArr(2));
        }
        return solveInternal(n, w, items);
    }

    private static long solveInternal(int n, int W, Item[] items) {
        long[][] dp = new long[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                Item item = items[i - 1];
                if (item.w > w) {
                    dp[i][w] = dp[i - 1][w];
                } else {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - item.w] + item.v);
                }
            }
        }

//        for (int i = 0; i <= n; i++) {
//            for (int w = 0; w <= W; w++) {
//                System.out.println(String.format("dp[%s,%s]=%s", i, w, dp[i][w]));
//            }
//        }

        return dp[n][W];
    }


    public static final class Item {
        public final int v;
        public final int w;

        private Item(int w, int v) {
            this.v = v;
            this.w = w;
        }

        public static Item of(int[] arr) {
            return new Item(arr[0], arr[1]);
        }
    }

    public static void main(String... args) {
        System.out.println(solve());
//        System.out.println(
//                solveInternal(6, 5, new Item[]{
//                        new Item(1, 1000000000),
//                        new Item(1, 1000000000),
//                        new Item(1, 1000000000),
//                        new Item(1, 1000000000),
//                        new Item(1, 1000000000)
//                })
//        );
    }
}