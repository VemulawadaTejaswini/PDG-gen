import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CHonestOrUnkind2 solver = new CHonestOrUnkind2();
        solver.solve(1, in, out);
        out.close();
    }

    static class CHonestOrUnkind2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            ArrayList<Pair<Integer, Boolean>>[] info = new ArrayList[n];
            int max = 0;
            for (int i = 0; i < n; i++) {
                int m = in.nextInt();
                info[i] = new ArrayList<>();
                for (int j = 0; j < m; j++) {
                    Pair<Integer, Boolean> p = new Pair<>(in.nextInt() - 1, in.nextLong() == 1);
                    info[i].add(p);
                }
            }

            // System.out.println(Arrays.toString(info));

            for (int i = 0; i < Math.pow(2, n); i++) {
                boolean[] truth = new boolean[n];
                int x = i;
                for (int j = 0; j < n; j++) {
                    truth[j] = x % 2 == 1;
                    x /= 2;
                }
                // out.println(Arrays.toString(truth));

                max = Math.max(max, make(info, truth));
            }

            out.println(max);

        }

        int make(ArrayList<Pair<Integer, Boolean>>[] info, boolean[] truth) {
            boolean f = true;
            int res = 0;
            for (int i = 0; i < truth.length; i++) {
                if (truth[i]) res++;
            }

            for (int i = 0; i < info.length; i++) {
                if (!truth[i]) {
                    continue;
                }
                for (Pair<Integer, Boolean> p : info[i]) {
                    if (p.u != truth[p.t]) {
                        f = false;
                    }
                    if (!f) return -1;
                }
            }

            return res;
        }

    }

    static class Pair<T, U> {
        public T t;
        public U u;

        public Pair(T t, U u) {
            this.t = t;
            this.u = u;
        }

        public String toString() {
            return "Pair{" +
                    "t=" + t.toString() +
                    ", u=" + u.toString() +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(t, pair.t) &&
                    Objects.equals(u, pair.u);
        }

        public int hashCode() {
            return Objects.hash(t, u);
        }

    }
}

