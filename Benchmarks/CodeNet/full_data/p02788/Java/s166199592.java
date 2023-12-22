import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int ENEMY = 0;
    private static int DIFF = 1;
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long D = scan.nextLong();
        long A = scan.nextLong();
        PriorityQueue<Pair> deque = new PriorityQueue<>(new PairComparator());
        for (int i = 0; i < N; i++) {
            deque.add(new Pair(ENEMY, scan.nextLong(), scan.nextLong()));
        }
        long ans = 0;
        long damage = 0;
        while(!deque.isEmpty()) {
            Pair p = deque.poll();
            if (p.type == ENEMY) {
                if (p.H <= damage) {
                    continue;
                }
                long remain = p.H - damage;
                long t = (remain + A - 1) / A;
                ans += t;
                damage += t * A;
                deque.add(new Pair(DIFF, p.X + D * 2, -A*t));
                continue;
            }
            damage += p.H;
        }
        System.out.println(ans);
    }
    class Pair {
        int type;
        long X;
        long H;
        Pair (int type, long X, long H) {
            this.type = type;
            this.X = X;
            this.H = H;
        }
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.X != o2.X) {
                return Long.compare(o1.X, o2.X);
            }
            if (o1.type != o2.type) {
                return Integer.compare(o1.type, o2.type);
            }
            return Long.compare(o1.H, o2.H);
        }
    }
}
