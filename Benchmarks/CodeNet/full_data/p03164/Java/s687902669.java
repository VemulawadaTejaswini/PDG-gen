import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static long[] we;
    static long[] va;
    static long w;
    static int n;
    static HashMap<Long, Long>[] memo;

    static long go(int i, long weight) {
        if (i == -1) {
            return 0;
        }

        if (memo[i].containsKey(weight)) {
            return memo[i].get(weight);
        }

        long res = 0;

        if (we[i] <= weight) {
            // take:
            res = Math.max(
                    go(i - 1, weight),
                    va[i] + go(i - 1, weight - we[i])
                    );
        }
        else {
            // not take:
            res = go(i - 1, weight);
        }

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
        System.out.println(go(n - 1, w));
    }
}
