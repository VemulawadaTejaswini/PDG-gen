import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

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
        ERedAndGreenApples solver = new ERedAndGreenApples();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERedAndGreenApples {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int x = in.nextInt();
            int y = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            int[] p = new int[a];
            int[] q = new int[b];
            int[] r = new int[c];

            for (int i = 0; i < a; i++) {
                p[i] = in.nextInt();
            }
            for (int i = 0; i < b; i++) {
                q[i] = in.nextInt();
            }
            for (int i = 0; i < c; i++) {
                r[i] = in.nextInt();
            }

            Arrays.sort(p);
            Arrays.sort(q);
            Arrays.sort(r);
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            for (int i = 0; i < x; i++) {
                pq.add(p[p.length - 1 - i]);
            }
            for (int i = 0; i < y; i++) {
                pq.add(q[q.length - 1 - i]);
            }
            for (int i = 0; i < c; i++) {
                pq.add(r[i]);
            }

            long res = 0;
            for (int i = 0; i < x + y; i++) res += pq.poll();

            out.println(res);
        }

    }
}

