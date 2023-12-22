import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        static int search(int n, List<TaskC.Point> a, List<TaskC.Point> b, Set<TaskC.Point> c) {
            int cn = n;
            for (TaskC.Point ca : a) {
                if (c.contains(ca)) continue;
                for (TaskC.Point cb : b) {
                    if (c.contains(cb)) continue;
                    if (ca.getX() < cb.getX() && ca.getY() < cb.getY()) {
                        Set<TaskC.Point> checked = new HashSet<>();
                        checked.addAll(c);
                        checked.add(ca);
                        checked.add(cb);
                        cn = Math.max(cn, search(n + 1, a, b, checked));
                    }
                }
            }
            return cn;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int n = in.nextInt();
            List<TaskC.Point> pointA = new ArrayList<>();
            List<TaskC.Point> pointB = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                pointA.add(new TaskC.Point(in.nextInt(), in.nextInt()));
            }
            for (int i = 0; i < n; i++) {
                pointB.add(new TaskC.Point(in.nextInt(), in.nextInt()));
            }

            Set<TaskC.Point> checked = new HashSet<>();
            out.println(search(0, pointA, pointB, checked));
        }

        static class Point {
            private int x;
            private int y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public int getX() {
                return this.x;
            }

            public int getY() {
                return this.y;
            }

        }

    }
}

