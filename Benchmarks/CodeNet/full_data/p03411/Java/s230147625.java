import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        static int search(int n, Set<TaskC.Point> a, Set<TaskC.Point> b) {
            int cn = n;
            for (TaskC.Point ca : a) {
                for (TaskC.Point cb : b) {
                    if (ca.getX() < cb.getX() && ca.getY() < cb.getY()) {
                        Set<TaskC.Point> na = new HashSet<>();
                        Set<TaskC.Point> nb = new HashSet<>();
                        na.addAll(a);
                        nb.addAll(b);
                        na.remove(ca);
                        nb.remove(cb);
                        cn = Math.max(cn, search(n + 1, na, nb));
                    }
                }
            }
            return cn;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int n = in.nextInt();
            Set<TaskC.Point> pointA = new HashSet<>();
            Set<TaskC.Point> pointB = new HashSet<>();

            for (int i = 0; i < n; i++) {
                pointA.add(new TaskC.Point(in.nextInt(), in.nextInt()));
            }
            for (int i = 0; i < n; i++) {
                pointB.add(new TaskC.Point(in.nextInt(), in.nextInt()));
            }

            out.println(search(0, pointA, pointB));
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

