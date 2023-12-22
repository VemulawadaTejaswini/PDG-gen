import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static final long MOD = 998244353;
    static long inv2 = inv(2);

    public static void main(String[] args) {
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(sc.next());
        }
        ArrayList<ArrayList<Integer>> divisor = new ArrayList<>();
        for (int i = 0; i < 1_000_001; i++) {
            divisor.add(new ArrayList<>());
        }
        for (int i = 1; i < divisor.size(); i++) {
            for (int j = i; j < divisor.size(); j += i) {
                divisor.get(j).add(i);
            }
        }
        long[] sum = new long[divisor.size()];
        long[] sum2 = new long[divisor.size()];
        long[] sub = new long[divisor.size()];
        for (int i = 0; i < N; i++) {
            for (int d : divisor.get((int) A[i])) {
                sum[d] += A[i];
                sum2[d] += A[i] * A[i];
            }
        }
        long ans = 0;
        for (int i = divisor.size() - 1; i > 0; i--) {
            if (sum[i] == 0) continue;
            sum[i] %= MOD;
            sum2[i] %= MOD;
            long cur = sum[i] * sum[i] - sum2[i];
            if (cur < 0) cur += MOD;
            cur %= MOD;
            cur *= inv2;
            cur %= MOD;
            cur *= inv(i);
            cur += MOD - sub[i];
            cur %= MOD;
            if (cur == 0) continue;
            ans += cur;
            for (int d : divisor.get(i)) {
                if (d == i) continue;
                sub[d] += cur * i / d;
                sub[d] %= MOD;
            }
        }
        System.out.println(ans % MOD);
    }

    static long inv(long v) {
        return pow(v, (int) MOD - 2);
    }

    static long pow(long v, int p) {
        if (p == 0) return 1;
        if (p == 1) return v;
        long ret = pow(v, p / 2);
        ret *= ret;
        ret %= MOD;
        if (p % 2 == 1) {
            ret *= v;
            ret %= MOD;
        }
        return ret;
    }
}
