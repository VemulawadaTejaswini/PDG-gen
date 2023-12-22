import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] weights = new int[n];
        long[] values = new long[n];

        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextLong();
        }

        Map<Integer, Map<Integer, Long>> dp = new HashMap<>();
        System.out.println(maxValue(weights, values, dp, w, n - 1));
    }

    public static long maxValue(int[] weights, long[] values, Map<Integer, Map<Integer, Long>> dp, int w, int n) {

        if (n == -1) {
            return 0;
        }

        if (dp.get(n) != null && dp.get(n).get(w) != null) {
            return dp.get(n).get(w);
        }
        
        long rp = -1;
        //放
        if (weights[n] <= w) {
            rp = maxValue(weights, values, dp, w - weights[n], n - 1) + values[n];
        }
        //不放
        long rnp = maxValue(weights, values, dp, w, n - 1);

        dp.putIfAbsent(n, new HashMap<Integer, Long>());
        dp.get(n).put(w, Math.max(rp, rnp));
        return dp.get(n).get(w);
    }
}
