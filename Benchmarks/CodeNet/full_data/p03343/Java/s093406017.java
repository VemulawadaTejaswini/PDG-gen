import java.util.*;

public class Main {
    public static class Pair<E1 extends Comparable<E1>, E2 extends Comparable<E2>>
            implements Comparable<Pair<E1, E2>> {
        public E1 first;
        public E2 second;

        public Pair(E1 first, E2 second) {
            this.first = first;
            this.second = second;
        }

        public E1 getFirst() {
            return first;
        }

        public E2 getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return getClass().getName() + "[first=" + first + ",second=" + second + "]";
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null) {
                return false;
            }
            if (getClass() != other.getClass()) {
                return false;
            }
            Pair<?, ?> p = (Pair<?, ?>) other;
            return Objects.equals(first, p.first) && Objects.equals(second, p.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }

        @Override
        public int compareTo(Pair<E1, E2> other) {
            return Comparator.comparing(Pair<E1, E2>::getFirst)
                    .thenComparing(Pair<E1, E2>::getSecond).compare(this, other);
        }
    }

    public static int INF = 1000000000;

    public static void moveKMin(TreeSet<Pair<Integer, Integer>> p1s,
            TreeSet<Pair<Integer, Integer>> p2s, int K) {
        for (int k = 0; k < K; k++) {
            Pair<Integer, Integer> p = p1s.first();
            p2s.add(p);
            p1s.remove(p);
        }
    }

    public static void main(String[] args) {
        // read inputs
        Scanner in = new Scanner(System.in);
        final int N = in.nextInt(), K = in.nextInt(), Q = in.nextInt();
        List<Integer> as = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            as.add(in.nextInt());
        }

        // sort as
        List<Integer> bs = new ArrayList<>(as);
        Collections.sort(bs);

        // solve
        int ans = INF;
        for (int i = 0; i < N - Q + 1; i++) {
            final int y = bs.get(i);
            // System.out.printf("i = %d, y = %d\n", i, y);

            // check if it is possible to take y
            int jY = -1;
            int numAroundY = 1;
            for (int j = 0; j < N; j++) {
                if (as.get(j) == y) {
                    jY = j;
                    break;
                }
            }
            for (int j = jY + 1; j < N && as.get(j) >= y; j++) {
                numAroundY++;
            }
            for (int j = jY - 1; j >= 0 && as.get(j) >= y; j--) {
                numAroundY++;
            }
            if (numAroundY < K) {
                continue;
            }
            // System.out.printf("y is removeable\n");

            // check number of elements >= y that we can remove
            int numRemove = 0, numBlock = 0;
            TreeSet<Pair<Integer, Integer>> ps = new TreeSet<>(), pBlocks = new TreeSet<>();
            for (int j = 0; j < N; j++) {
                final int a = as.get(j);
                if (a >= y) {
                    numBlock++;
                    pBlocks.add(new Pair<>(a, j));
                } else {
                    moveKMin(pBlocks, ps, numBlock >= K ? numBlock - K + 1 : 0);
                    numBlock = 0;
                }
            }
            moveKMin(pBlocks, ps, numBlock >= K ? numBlock - K + 1 : 0);
            if (ps.size() < Q) {
                continue;
            }
            int x = 0;
            for (int k = 0; k < Q; k++) {
                Pair<Integer, Integer> p = ps.first();
                x = p.first;
                ps.remove(p);
            }
            // System.out.printf("enough elements above y to remove, x = %d\n", x);
            ans = Math.min(ans, x - y);
        }
        System.out.printf("%d\n", ans);
    }
}
