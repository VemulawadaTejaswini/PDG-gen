import java.util.function.IntPredicate;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        int[] h = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
            max = Math.max(max, h[i]);
        }
        max = (int)Math.ceil((double)max / b) + 1;
        System.out.println(binarySearch(max, t -> {
            long count = 0;
            for (double i : h) {
                if (b * t < i) {
                    count += Math.ceil((i - b * t) / (a - b));
                }
            }
            Utils.println(t, count, count <= t);
            return count > t;
        }));
    }

    static int binarySearch(int max, IntPredicate predicate) {
        int ok = 0, ng = max;
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (predicate.test(mid)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }
}