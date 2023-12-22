import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        List<Pair> l = new ArrayList<>();
        Map<Pair, String> map1 = new HashMap<>();
        Map<Integer, List<Integer>> map2 = new HashMap<>();
        for (int i = 0; i < m; i++) {
            Pair p = new Pair(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
            List<Integer> list = map2.getOrDefault(p.p, new ArrayList<>());
            list.add(p.y);
            map2.put(p.p, list);
            l.add(p);
        }

        for (Map.Entry<Integer, List<Integer>> entry : map2.entrySet()) {
            int p = entry.getKey();
            List<Integer> list = entry.getValue();
            list.sort(Comparator.comparingInt(value -> value));
            for (int i = 0; i < list.size(); i++) {
                int y = list.get(i);
                Pair pair = new Pair(p, y);
                String id = String.format("%06d", p) + String.format("%06d", i + 1);
                map1.put(pair, id);
            }
        }

        for (Pair pair : l) {
            System.out.println(map1.get(pair));
        }


    }

    public static class Pair {
        int p;
        int y;

        public Pair(int p, int y) {
            this.p = p;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return p == pair.p &&
                    y == pair.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(p, y);
        }
    }
}
