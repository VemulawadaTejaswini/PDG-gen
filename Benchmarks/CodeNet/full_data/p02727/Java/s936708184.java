import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

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
        RedGreenApples solver = new RedGreenApples();
        solver.solve(1, in, out);
        out.close();
    }

    static class RedGreenApples {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int x = in.nextInt();
            int y = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            List<Long> p = new ArrayList<>();
            List<Long> q = new ArrayList<>();
            List<Long> r = new ArrayList<>();
            for (int i = 0; i < a; i++) {
                p.add(Long.parseLong(in.next()));
            }
            for (int i = 0; i < b; i++) {
                q.add(Long.parseLong(in.next()));
            }
            for (int i = 0; i < c; i++) {
                r.add(Long.parseLong(in.next()));
            }
            p.sort(Comparator.reverseOrder());
            q.sort(Comparator.reverseOrder());

            PriorityQueue<Long> s = new PriorityQueue<>(a, (o1, o2) -> Long.compare(o2, o1));
            for (int i = 0; i < x; i++) {
                s.add(p.get(i));
            }
            for (int i = 0; i < y; i++) {
                s.add(q.get(i));
            }
            for (int i = 0; i < c; i++) {
                s.add(r.get(i));
            }
            long result = 0;
            for (int i = 1; i <= x + y; i++) {
                result += s.poll();
            }

            out.println(result);

        }

    }
}

