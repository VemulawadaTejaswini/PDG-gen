import java.util.*;
import java.util.stream.LongStream;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        System.out.println(solve(A, B));
    }

    /**
     * https://atcoder.jp/contests/abc142/submissions/7746549
     * AとBで共通する素数の約数の個数+1が解
     * @param A
     * @param B
     * @return
     */
    private static int solve(long A, long B) {
        int count = 1;
        Set<Long> primeSet = eratosthenes(Math.min(A, B));

        for (long p : primeSet) {
            if (A%p == 0 && B%p == 0) {
                count++;
            }
        }

        return count;
    }

    private static Set<Long> eratosthenes(long x) {
        Set<Long> primeSet = new HashSet<>();

        LongStream.rangeClosed(2, x)
                .filter(i -> LongStream.rangeClosed(2, (int) Math.sqrt(i))
                        .allMatch(j -> i % j != 0))
                .forEach(n -> {
                    primeSet.add(n);
                });

        return primeSet;
    }
}