import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Problem {
    private int N;
    private int W;
    private int[] weights;
    private int[] values;

    private ArrayList<HashMap<Integer, Long>> dp;

    Problem() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        W = sc.nextInt();

        weights = new int[N];
        values = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }
    }

    long maximize(int n, int w) {
        if (n >= N || w <= 0) return 0;

        HashMap<Integer, Long> map = dp.get(n);
        if (map.containsKey(w)) {
            return map.get(w);
        }

        long ret = -1;
        if (weights[n] > w) {
            ret = maximize(n + 1, w);
        } else {
            ret = Math.max(
                    maximize(n+1, w),
                    maximize(n+1, w - weights[n]) + (long) values[n]
            );
        }

        map.put(w, ret);

        return ret;
    }

    long solve() {
        dp = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            dp.add(i, new HashMap<>());
        }

        return maximize(0, W);
    }
}

public class Main {
    public static void main(String[] args) {
        long ans = new Problem().solve();
        System.out.println(ans);
    }
}
