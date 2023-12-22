import java.util.*;

public class Main {

    static long lowerBound(List<Long> ls, long key) {
        int ng = -1;
        int ok = ls.size();

        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (key <= ls.get(mid)) ok = mid;
            else ng = mid;
        }

        return ok;
    }
    static long upperBound(List<Long> ls, long key) {
        int ng = -1;
        int ok = ls.size();

        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (key >= ls.get(mid)) ng = mid;
            else ok = mid;
        }

        return ok;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        List<Long> b = new ArrayList<>();
        List<Long> c = new ArrayList<>();
        for (int j = 0; j < n; ++j) a.add(sc.nextLong());
        for (int j = 0; j < n; ++j) b.add(sc.nextLong());
        for (int j = 0; j < n; ++j) c.add(sc.nextLong());
        Collections.sort(a);
        Collections.sort(c);

        long res = 0L;
        for (int i = 0; i < n; ++i) {
            long lower = lowerBound(a, b.get(i));
            long upper = n - upperBound(c, b.get(i));
            res += lower * (upper);
        }

        System.out.println(res);
    }
}