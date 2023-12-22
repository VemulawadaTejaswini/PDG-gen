import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n + 1];
        long[] sums = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            arr[i] = x + arr[i - 1];
            sums[i] = sums[i - 1];
            if (x > 0) {
                sums[i] += x;
            }
        }
        long max = Integer.MIN_VALUE;
        for (int i = k; i <= n; i++) {
            max = Math.max(max, sums[n] - (sums[i] - sums[i - k]) + arr[i] - arr[i - k]);
            max = Math.max(max, sums[n] - (sums[i] - sums[i - k]));
        }
        System.out.println(max);
    }
}
