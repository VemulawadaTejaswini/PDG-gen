import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    class P implements Comparable<P> {
        int value;
        int index;

        @Override
        public int compareTo(P o) {
            if (o.value != value) {
                return value < o.value ? -1 : 1;
            }
            if (o.index != index) {
                return index > o.index ? -1 : 1;
            }
            return 0;
        }

        @Override
        public String toString() {
            return "{" + value + ", " + index + "}";
        }
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<P> set = new TreeSet<>();
        for (int i = 0; i < n; ++i) {
            int v = sc.nextInt();
            P p = new P();
            p.value = v;
            p.index = i;
            P q = set.lower(p);
            if (q != null) {
                set.remove(q);
            }
            set.add(p);
            // System.err.println(set);
        }
        System.out.println(set.size());
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
