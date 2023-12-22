import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ERoadwork solver = new ERoadwork();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERoadwork {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();

            TreeSet<ERoadwork.Event> events = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                int s = in.nextInt();
                int t = in.nextInt();
                int x = in.nextInt();

                events.add(new ERoadwork.Event(s - x, x, 2));
                events.add(new ERoadwork.Event(t - x, x, 1));
            }
            for (int i = 0; i < q; i++) {
                events.add(new ERoadwork.Event(in.nextInt(), i, 3));
            }

            TreeSet<Integer> currents = new TreeSet<>();
            int[] res = new int[q];
            for (ERoadwork.Event event : events)
                if (event.type == 2)
                    currents.add(event.x);
                else if (event.type == 1)
                    currents.remove(event.x);
                else {
                    res[event.x] = currents.isEmpty() ? -1 : currents.first();
                }

            for (int i = 0; i < q; i++) {
                out.println(res[i]);
            }

        }

        public static class Event implements Comparable<ERoadwork.Event> {
            int t;
            int x;
            int type;

            public Event(int t, int x, int type) {
                this.t = t;
                this.x = x;
                this.type = type;
            }

            public int compareTo(ERoadwork.Event o) {
                return t != o.t ? t - o.t : (type != o.type ? type - o.type : x - o.x);
            }

        }

    }
}

