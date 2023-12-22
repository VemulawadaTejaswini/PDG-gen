import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int k = stdin.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = stdin.nextInt();
        }

        Arrays.sort(a);

        int lo = -1;
        int hi = n;
        while (Math.abs(hi - lo) > 1) {
            int mi = (lo + hi) / 2;
            if (ok(n, k, a, mi)) {
                hi = mi;
            } else {
                lo = mi;
            }
        }
        System.out.println(hi);
    }

    private static boolean ok(int n, int k, int[] a, int x) {
        List<Map<Integer, Integer>> dp = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            dp.add(new HashMap<>());
        }
        dp.get(0).put(0, 0);

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> pre = dp.get(i);
            Map<Integer, Integer> nxt = dp.get(i + 1);
            nxt.putAll(pre);
            if (i == x) {
                continue;
            }
            for (int j : pre.keySet()) {
                if (j + a[i] < k) {
                    int v = nxt.getOrDefault(j + a[i], 0) + pre.get(j);
                    nxt.put(j + a[i], v);
                }
            }
        }

        return dp.get(n).keySet().stream().anyMatch(i -> k - a[x] <= i && i < k);
    }
}
