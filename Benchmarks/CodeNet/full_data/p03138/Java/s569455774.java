import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long K = scan.nextLong();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        long sum = Arrays.stream(A).sum();
        int[] digits = new int[40];
        for (int i = 0; i < N; i++) {
            long current = A[i];
            int index = 0;
            while (0 < current) {
                if ((current & 1) == 1) {
                    digits[index] += 1;
                }
                index += 1;
                current /= 2;
            }
        }
        long[] diff = new long[40];
        long[] cost = new long[40];
        for (int i = 0; i < 40; i++) {
            cost[i] = pow(i);
            diff[i] = pow(i) * (N - digits[i] * 2);
        }
        Map<Long, Long> dp = new HashMap<>();
        dp.put(0L, 0L);
        for (int i = 0; i < 40; i++) {
            Map<Long, Long> next_dp = new HashMap<>();
            for (long key : dp.keySet()) {
                long value = dp.get(key);
                next_dp.merge(key, value, Long::max);
                if (key + cost[i] <= K) {
                    next_dp.merge(key + cost[i], value + diff[i], Long::max);
                }
            }
            dp = next_dp;
        }
        System.out.println((dp.values().stream().mapToLong(i -> Long.valueOf(i)).max().getAsLong())+sum);
    }
    private long pow(int N) {
        if (N == 0) {
            return 1;
        }
        if (N % 2 == 1) {
            return 2 * pow(N-1);
        }
        long x = pow(N / 2);
        return x * x;
    }
}
