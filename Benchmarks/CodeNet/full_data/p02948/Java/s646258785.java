import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSummerVacation solver = new DSummerVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSummerVacation {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            ArrayList<Pair<Integer, Integer>> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new Pair<>(in.nextInt(), in.nextInt()));
            }
            long ans = 0, days = 0;
            int i = 0, jobs = 0;
            Collections.sort(a, (x, y) -> x.getSecond() == y.getSecond() ? y.getFirst() - x.getFirst() : y.getSecond() - x.getSecond());
            while (days < m && i < a.size()) {
                if (a.get(i).getFirst() + jobs <= m) {
                    ans += a.get(i).getSecond();
                    jobs++;
                }
                i++;
            }
            out.print(ans);
        }

    }

    static class Pair<T, V> {
        private T first;
        private V second;

        public Pair() {

        }

        public Pair(T f, V s) {
            this.first = f;
            this.second = s;
        }

        public T getFirst() {
            return this.first;
        }

        public V getSecond() {
            return this.second;
        }

    }
}

