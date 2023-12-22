import java.util.*;

public class Main {

    static int lowerBound(List<Integer> ls, int key) {
        int ng = -1;
        int ok = ls.size();

        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (key <= ls.get(mid)) ok = mid;
            else ng = mid;
        }

        return ok;
    }
    static int upperBound(List<Integer> ls, int key) {
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
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for (int j = 0; j < n; ++j) a.add(sc.nextInt());
        for (int j = 0; j < n; ++j) b.add(sc.nextInt());
        for (int j = 0; j < n; ++j) c.add(sc.nextInt());
        Collections.sort(a);
        Collections.sort(c);

        int res = 0;
        for (int i = 0; i < n; ++i) {
            res += (lowerBound(a, b.get(i))) * (n - upperBound(c, b.get(i)));
        }

        System.out.println(res);
    }
}