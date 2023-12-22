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
        int M = scan.nextInt();
        int[] P = new int[M];
        int[] Y = new int[M];
        List<Pair> list = new ArrayList<Pair>();
        HashMap<Integer, Pair> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            P[i] = scan.nextInt();
            Y[i] = scan.nextInt();
            Pair p = new Pair();
            p.id = i+1;
            p.p = P[i];
            p.y = Y[i];
            list.add(p);
            map.put(i+1, p);
        }
        list.sort(new PairComparator());
        int prev_city = -1;
        int city_count = 0;
        for (Pair p : list) {
            if (p.p != prev_city) {
                city_count = 1;
                prev_city = p.p;
            }
            p.addr_id = String.format("%06d%06d", prev_city, city_count++);
        }
        for (int i = 1; i <= M; i++) {
            System.out.println(map.get(i).addr_id);
        }
    }
    class Pair {
        int id;
        int p;
        int y;
        String addr_id;
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.p == o2.p) {
                return Integer.compare(o1.y, o2.y);
            }
            return Integer.compare(o1.p, o2.p);
        }
    }
}
