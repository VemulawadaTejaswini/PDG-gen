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
        int K = scan.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        long[] sum = new long[N + 1];
        for (int i = 0; i < N; i++) {
            sum[i + 1] = sum[i] + A[i];
        }
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i <= Math.min(K-1, N); i++) {
            long m = (sum[i] - i + K) % K;
            if (!map.containsKey(m)) {
                map.put(m, 0L);
            }
            long c = map.get(m);
            map.put(m, c + 1);
        }
        long answer = 0;
        for (int i = 0; i <= N; i++) {
            long m = (sum[i] - i + K) % K;
            long x = map.get(m);
            answer += x - 1;
            map.put(m, x - 1);
            if (i + K <= N) {
                long n = (sum[i + K] - (i + K) + K) % K;
                if (!map.containsKey(n)) {
                    map.put(n, 0L);
                }
                long c = map.get(n);
                map.put(n, c+1);
            }
        }
        System.out.println(answer);
    }
}
