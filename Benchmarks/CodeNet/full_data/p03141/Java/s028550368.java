import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
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
        CDifferentStrokes solver = new CDifferentStrokes();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDifferentStrokes {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            // 高橋君にとって、各皿は食べることによってa+bの価値があるのでその順に食えばいい
            // 青木にとってもそれは同じ

            int n = in.nextInt();
            ArrayList<Pair> p = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                p.add(new Pair(a, b));
            }

            p.sort(Comparator.comparing(q -> -(q.x + q.y)));

            long res = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    res += p.get(i).x;
                } else {
                    res -= p.get(i).y;
                }
            }

            out.println(res);


        }

    }

    static class Pair {
        public long x;
        public long y;

        public Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

    }
}

