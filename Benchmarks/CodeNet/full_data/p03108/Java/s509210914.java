import java.util.*;

public class Main {
    private static class UnionFind <T> {
        final Map<T, T> reprs;
        final Map<T, Integer> sizes;
        int count;

        public UnionFind(List<T> input) {
            Map<T, T> reprs = new HashMap<>();

            for (T e : input) {
                if (reprs.containsKey(e)) {
                    throw new RuntimeException(String.format("Input keys, not unique. %s appeared at least twice.", e.toString()));
                }

                reprs.put(e, e);
            }

            this.reprs = reprs;

            Map<T, Integer> tmpSizes = new HashMap<>();

            for (T e : input) {
                tmpSizes.put(e, 1);
            }

            this.sizes = tmpSizes;

            this.count = input.size();
        }

        public int size(T key) {
            return sizes.get(find(key));
        }

        public T find(T key) {
            if (!reprs.containsKey(key)) {
                throw new RuntimeException("Key was not in original input");
            }

            T cur = key;

            while (!reprs.get(cur).equals(cur)) {
                cur = reprs.get(cur);
            }

            // Path compression
            while (!key.equals(cur)) {
                T oldParent = reprs.get(key);
                reprs.put(key, cur);
                key = oldParent;
            }

            return cur;
        }

        public T union(T key1, T key2) {
            T repr1 = find(key1);
            T repr2 = find(key2);

            if (repr1.equals(repr2)) {
                return repr1;
            }

            count--;

            if (sizes.get(repr1) < sizes.get(repr2)) {
                reprs.put(repr1, repr2);
                sizes.put(repr2, sizes.get(repr2) + 1);
                return repr2;
            }

            reprs.put(repr2, repr1);
            sizes.put(repr1, sizes.get(repr1) + 1);
            return repr1;
        }

        public boolean connected(T e1, T e2) {
            return find(e1).equals(find(e2));
        }

        @Override
        public String toString() {
            List<T> topLevel = new ArrayList<>();

            for (T e : reprs.keySet()) {
                if (reprs.get(e) == e) {
                    topLevel.add(e);
                }
            }

            StringBuilder sb = new StringBuilder();

            // O(n^2). Could fix by giving each element a set of children.
            for (T topE : topLevel) {
                sb.append("{");
                for (T e : reprs.keySet()) {
                    if (reprs.get(e) == topE) {
                        sb.append(e.toString() + ", ");
                    }
                }
                sb.delete(sb.length() - 2, sb.length());
                sb.append("}");
            }

            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        int m = sc.nextInt();


        int[] bridgesFrom = new int[m];
        int[] bridgesTo = new int[m];

        for (int i = 0; i < m; i++) {
            bridgesFrom[i] = sc.nextInt();
            bridgesTo[i] = sc.nextInt();
        }

        //System.out.println(Arrays.toString(bridgesFrom));
        //System.out.println(Arrays.toString(bridgesTo));

        List<Integer> islands = new ArrayList<>((int) n);

        for (int i = 0; i < n; i++) {
            islands.add(i + 1);
        }

        //long curIncon = (n * (n - 1)) / 2;
        long curIncon = n * n / 2 - n / 2;
        List<Long> res = new ArrayList<>(m);

        res.add(curIncon);

        UnionFind<Integer> uf = new UnionFind<>(islands);

        for (int i = m - 1; i > 0; i--) {
            int from = bridgesFrom[i];
            int to = bridgesTo[i];

            if (uf.connected(from, to)) {
                res.add(curIncon);
                continue;
            }

            long conFrom = uf.size(from);
            long conTo = uf.size(to);

            curIncon -= conFrom * conTo;

            uf.union(from, to);

            //System.out.println(from + " " + to);
            //System.out.println(uf);

            res.add(curIncon);
        }

        for (int i = m - 1; i >= 0; i--) {
            System.out.println(res.get(i));
        }
    }
}
