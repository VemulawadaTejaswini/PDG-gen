import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long K = scan.nextLong();
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            Pair p = new Pair();
            p.a = a;
            p.b = b;
            pairs.add(p);
        }
        pairs.sort(new PairComparator());
        for (int i = 0; i < N; i++) {
            Pair p = pairs.get(i);
            if (K <= p.b) {
                System.out.println(p.a);
                return;
            }
            K -= p.b;
        }
    }
    class Pair {
        int a;
        int b;
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.a == o2.a) {
                return Integer.compare(o1.b, o2.b);
            }
            return Integer.compare(o1.a, o2.b);
        }
    }
}
