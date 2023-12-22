
import java.util.*;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        HashMap<Integer, LinkedList<V>> input = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int p = sc.nextInt(), y = sc.nextInt();
            if (input.containsKey(p)) {
                LinkedList<V> l = input.get(p);
                l.add(new V(i, y));
            } else {
                LinkedList<V> l = new LinkedList<>();
                l.add(new V(i, y));
                input.put(p, l);
            }
        }

        PriorityQueue<V> q = new PriorityQueue<>(Comparator.comparingInt(o -> o.idx));

        for (Map.Entry<Integer, LinkedList<V>> entry: input.entrySet()) {
            LinkedList<V> l = entry.getValue();
            Collections.sort(l, Comparator.comparingLong(o -> o.y));
            int i = 1;
            for (V v: l) {
                v.y = entry.getKey() * 1000000 + i;
                q.add(v);
                i++;
            }
        }
        for (;!q.isEmpty();) {
            V v = q.remove();
            System.out.println(String.format(String.format("%012d", v.y)));
        }
    }

    class V {

        int idx;
        long y;
        V(int idx, long y) {
            this.idx = idx;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
