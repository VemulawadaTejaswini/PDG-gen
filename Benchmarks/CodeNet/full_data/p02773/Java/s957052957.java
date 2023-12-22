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
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = scan.next();
            int x = map.getOrDefault(s, 0);
            map.put(s, x+1);
        }
        List<Pair> list = new ArrayList<>();
        for(String s : map.keySet()) {
            Pair p = new Pair(s, map.get(s));
            list.add(p);
        }
        list.sort(new PairComparator());
        int count = list.get(0).count;
        for (Pair p : list) {
            if (p.count == count) {
                System.out.println(p.S);
            }
        }
    }
    class Pair {
        String S;
        int count;
        Pair(String S, int count) {
            this.S = S;
            this.count = count;
        }
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.count != o2.count) {
                return -Integer.compare(o1.count, o2.count);
            }
            return o1.S.compareTo(o2.S);
        }
    }
}
