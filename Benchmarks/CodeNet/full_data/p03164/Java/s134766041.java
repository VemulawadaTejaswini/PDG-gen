import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static long[] we;
    static long[] va;
    static long w;
    static int n;
    static HashMap<Long, Long>[] memo;

    static long go(int i, long weight) {
        if (i == n) {
            return 0;
        }
        if (memo[i].containsKey(weight)) {
            return memo[i].get(weight);
        }

        long res = 0;

        // take:
        if (weight + we[i] <= w) { // if we can
            res = Math.max(res,
                    va[i] + go(i + 1, weight + we[i])
                    );
        }

        // not take:
        res = Math.max(res,
                go(i + 1, weight)
        );

        memo[i].put(weight, res);
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        w = scan.nextLong();
        we = new long[n];
        va = new long[n];
        for (int i = 0; i < n; ++i) {
            we[i] = scan.nextLong();
            va[i] = scan.nextLong();
        }
        memo = new HashMap[n];
        for (int i = 0; i < n; ++i) {
            memo[i] = new HashMap<>();
        }
        System.out.println(go(0, 0));
    }
}
