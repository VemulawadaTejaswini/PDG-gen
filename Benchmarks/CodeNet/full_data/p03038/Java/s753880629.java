import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        IntegerCards solver = new IntegerCards();
        solver.solve(1, in, out);
        out.close();
    }

    static class IntegerCards {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            PriorityQueue<Long> pq = new PriorityQueue<>(n, Long::compare);
            // 降順
            PriorityQueue<Pair> conditions = new PriorityQueue<>(n, (o1, o2) -> Long.compare(o2.value, o1.value));
            for (int i = 0; i < n; i++) {
                pq.add(Long.parseLong(in.next()));
            }

            for (int i = 0; i < m; i++) {
                long b = Long.parseLong(in.next());
                long c = Long.parseLong(in.next());
                conditions.add(new Pair(c, b));
            }
            while (!conditions.isEmpty()) {
                Pair p = conditions.poll();
                for (int i = 0; i < p.time; i++) {
                    Long a = pq.poll();
                    if (p.value < a) {
                        conditions.clear();
                        pq.add(a);
                        break;
                    }
                    pq.add(p.value);
                }
            }
            long result = 0;
            while (!pq.isEmpty()) {
                result += pq.poll();
            }
            out.print(result);

        }

        class Pair {
            public final Long value;
            public final Long time;

            public Pair(Long value, Long time) {
                this.value = value;
                this.time = time;
            }

        }

    }
}

