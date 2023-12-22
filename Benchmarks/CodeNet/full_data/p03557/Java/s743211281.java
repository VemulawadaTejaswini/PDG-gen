import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < n; ++i) a.add(sc.nextInt());
        for (int i = 0; i < n; ++i) b.add(sc.nextInt());
        for (int i = 0; i < n; ++i) c.add(sc.nextInt());
        Collections.sort(a);
        Collections.sort(c);

        int res = 0;
        for (int i = 0; i < n; ++i) {
            int key = b.get(i);

            int ng = -1;
            int ok = n;
            while (ok - ng > 1) {
                int mid = (ok + ng) / 2;
                if (key <= a.get(mid)) ok = mid;
                else ng = mid;
            }
            int tmpA = ok;

            ng = -1;
            ok = n;
            while (ok - ng > 1) {
                int mid = (ok + ng) / 2;
                if (key < c.get(mid)) ok = mid;
                else ng = mid;
            }
            int tmpC = n - ok;
            res += tmpA * tmpC;
        }

        System.out.println(res);
    }
}