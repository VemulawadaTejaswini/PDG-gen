import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.function.IntUnaryOperator;

/**
 * League
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            Queue<Integer>[] A = new Queue[N];
            for (int i = 0; i < N; i++) {
                A[i] = new ArrayDeque<>();
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N - 1; j++) {
                    A[i].add(sc.nextInt() - 1);
                }
            }

            IntUnaryOperator operator = i -> {
                if (A[i].isEmpty()) {
                    return -1;
                }

                int j = A[i].peek();

                if (A[j].isEmpty()) {
                    return -1;
                }

                if (i == A[j].peek()) {
                    return j;
                }

                return -1;
            };

            Set<Pair> queue = new HashSet<>();
            for (int i = 0; i < N; i++) {
                int j = operator.applyAsInt(i);

                if (j == -1) {
                    continue;
                }

                queue.add(new Pair(i, j));
            }

            int day = 0;

            while (queue.size() > 0) {
                day++;

                for (Pair pair : queue) {
                    A[pair.i].remove();
                    A[pair.j].remove();
                }

                Set<Pair> queue2 = new HashSet<>();
                for (Pair pair : queue) {
                    int i2 = operator.applyAsInt(pair.i);
                    if (i2 != -1) {
                        queue2.add(new Pair(pair.i, i2));
                    }

                    int j2 = operator.applyAsInt(pair.j);
                    if (j2 != -1) {
                        queue2.add(new Pair(pair.j, j2));
                    }
                }

                queue = queue2;
            }

            for (int i = 0; i < N; i++) {
                if (A[i].size() > 0) {
                    System.out.println(-1);
                    return;
                }
            }

            System.out.println(day);
        }
    }

    static class Pair {

        int i;

        int j;

        public Pair(int i, int j) {
            if (i < j) {
                this.i = i;
                this.j = j;
            } else {
                this.i = j;
                this.j = i;
            }
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + i;
            result = prime * result + j;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Pair other = (Pair) obj;
            if (i != other.i)
                return false;
            if (j != other.j)
                return false;
            return true;
        }

    }

}
