import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static List<Long> reverseV(List<Long> v) {
        List<Long> newList = new ArrayList<>(v);
        Collections.reverse(newList);
        return newList;
    }

    private static List<Long> reverseX(long C, List<Long> x) {
        List<Long> newList = x.stream().map(val -> C - val).collect(Collectors.toList());
        Collections.reverse(newList);
        return newList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            long C = sc.nextLong();
            List<Long> x = new ArrayList<>();
            List<Long> v = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                x.add(sc.nextLong());
                v.add(sc.nextLong());
            }
            System.out.println(Math.max(
                solve(N, C, x, v),
                solve(N, C, reverseX(C, x), reverseV(v))));
        }
    }

    private static long solve(int N, long C, List<Long> x, List<Long> v) {
        long[] maxR = getMaxArray(N, x, v);
        long[] maxL = getMaxArray(N, reverseX(C, x), reverseV(v));

        long ans = 0;

        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, maxR[i]);
            if ( N >= 2 && i < N - 1 ) {
                ans = Math.max(ans, maxR[i] - x.get(i) + maxL[N - i - 2]);
            }
        }

        return ans;
    }

    private static long[] getMaxArray(int N, List<Long> x, List<Long> v) {
        long[] max = new long[N];
        long cost = 0;
        for (int i = 0; i < N; i++) {
            cost += v.get(i);
            long costWithWalk = cost - x.get(i);
            if ( i > 0 ) {
                max[i] = Math.max(costWithWalk, max[i - 1]);
            } else {
                max[i] = Math.max(0, costWithWalk);
            }
        }
        return max;
    }
}
