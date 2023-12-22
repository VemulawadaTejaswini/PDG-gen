
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    private long fac[];
    private long finv[];
    private long inv[];
    private static int MAX_LEN = 510000;
    private static int MOD = 1000000007;
    public static void main(String[] args) {
        Main main = new Main();
        main.COMinit();
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
        Arrays.sort(A);
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int count = map.getOrDefault(A[i], 0);
            map.put(A[i], count + 1);
        }
        List<Point> list = new ArrayList<>();
        for (long x : map.keySet()) {
            Point p = new Point(x, map.get(x));
            list.add(p);
        }
        list.sort(new PointComparator());
        int len = list.size();
        long max_sum = 0;
        long min_sum = 0;
        int count = 0;
        for (int i = 0; i < len; i++) {
            int current_group = list.get(i).count;
            long current_value = list.get(i).x;
            int remain = N - count;
            for (int j = 0; j < current_group; j++) {
                long x = COM(remain - (j + 1), K - 1) * current_value;
                x %= MOD;
                min_sum += x;
                min_sum %= MOD;
            }
            for (int j = 0; j < current_group; j++) {
                long x = COM(count +  j, K - 1) * current_value;
                x %= MOD;
                max_sum += x;
                max_sum %= MOD;
            }
            count += current_group;
        }
        long answer = max_sum - min_sum + MOD;
        answer %= MOD;
        System.out.println(answer);
    }
    void COMinit() {
        this.fac = new long[MAX_LEN];
        this.finv = new long[MAX_LEN];
        this.inv = new long[MAX_LEN];
        this.fac[0] = this.fac[1] = 1;
        this.finv[0] = this.finv[1] = 1;
        this.inv[1] = 1;
        for (int i = 2; i < MAX_LEN; i++) {
            fac[i] = fac[i-1] * i % MOD;
            inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
            finv[i] = finv[i-1] * inv[i] % MOD;
        }
    }
    long COM(int n, int k) {
        if (n < k) {
            return 0;
        };
        if (n <0 || k < 0) {
            return 0;
        }
        return fac[n] * (finv[k] * finv[n - k]%MOD)%MOD;
    }
    class Point {
        long x;
        int count;
        Point(long x, int count) {
            this.x = x;
            this.count = count;
        }
    }
    class PointComparator implements Comparator<Point> {
        @Override
        public int compare(Point o1, Point o2) {
            return Long.compare(o1.x, o2.x);
        }
    }
}
