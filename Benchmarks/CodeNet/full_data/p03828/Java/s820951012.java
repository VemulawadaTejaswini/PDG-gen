import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println( solve(N) );
    }

    private static long solve(int N) {
        // primes under 31
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        Map<Integer, Integer> primeCounts = new HashMap<>();

        for (int n = 2; n <= N; n++) {
            int remain = n;
            for (int p : primes) {
                Result result = countFactor(remain, p);
                if( result.cnt > 0 ) {
                    incrementPrime(p, result.cnt, primeCounts);
                    remain = result.remain;
                }
            }

            if( remain != 1 ) {
                incrementPrime(remain, 1, primeCounts);
            }
        }

        // 各素数の組み合わせ
        long ans = 1;
        for (Integer cnt : primeCounts.values()) {
            ans = (ans * (cnt + 1)) % MOD;
        }
        return ans;
    }

    private static Result countFactor(int n, int f) {
        int cnt = 0;
        while(true) {
            if( n % f == 0 ) {
                n = n / f;
                cnt++;
            } else {
                break;
            }
        }
        return new Result(cnt, n);
    }

    private static void incrementPrime(int p, int cnt, Map<Integer, Integer> countPrimes) {
        if( countPrimes.containsKey(p) ) {
            countPrimes.put(p, countPrimes.get(p) + cnt);
        } else {
            countPrimes.put(p, cnt);
        }
    }

    private static class Result {
        private final int cnt;
        private final int remain;

        public Result(int cnt, int remain) {
            this.cnt = cnt;
            this.remain = remain;
        }
    }
}
