import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Map<Integer, Map<Long, Long>> cache = new HashMap<>();
        for (int i = 0; i < N; i++) {
            cache.put(A[i], divisors(A[i]));
        }
        long answer = 0;
        long mod = 998244353;
        for (int i = 0; i < N-1; i++) {
            for (int j = i + 1; j < N; j++) {
                answer += lcd(cache, A[i], A[j]);
                answer %= mod;
            }
        }
        System.out.println(answer);
    }
    private long lcd(Map<Integer, Map<Long, Long>> cache, int i, int j) {
        Map<Long, Long> i_divisors = cache.get(i);
        Map<Long, Long> j_divisors = cache.get(j);
        long lcd = 1;
        for (long x : i_divisors.keySet()) {
            long i_c = i_divisors.get(x);
            if (j_divisors.containsKey(x)) {
                i_c = Math.max(i_c, j_divisors.get(x));
            }
            lcd *= pow(x, i_c);
        }
        for (long x : j_divisors.keySet()) {
            long j_c = j_divisors.get(x);
            if (i_divisors.containsKey(x)) {
                continue;
            }
            lcd *= pow(x, j_c);
        }
        return lcd;
    }
    private long pow(long x, long y) {
        if (y == 1) {
            return x;
        }
        if (y % 2 == 1) {
            return x * pow(x, y - 1);
        }
        long z = pow(x, y / 2);
        return z * z;
    }
    private Map<Long, Long> divisors(long N) {
        Map<Long, Long> divisors = new HashMap<>();
        for (long i = 2; i <= N; i++) {
            if (N % i != 0) {
                continue;
            }
            long count = 0;
            while (N % i == 0) {
                N /= i;
                count += 1;
            }
            divisors.put(i, count);
        }
        return divisors;
    }
}
