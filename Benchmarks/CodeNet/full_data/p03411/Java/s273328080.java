import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int n = in.nextInt();
            List<TaskC.Point> pointA = new ArrayList<>();
            List<TaskC.Point> pointB = new ArrayList<>();
            Comparator<TaskC.Point> min = Comparator.comparing(TaskC.Point::getMin);
            Comparator<TaskC.Point> max = Comparator.comparing(TaskC.Point::getMax);

            for (int i = 0; i < n; i++) {
                pointA.add(new TaskC.Point(in.nextInt(), in.nextInt()));
            }
            for (int i = 0; i < n; i++) {
                pointB.add(new TaskC.Point(in.nextInt(), in.nextInt()));
            }

            pointA.sort(max);
            pointB.sort(min);
            int ans = 0;
            int index = pointA.size() - 1;
            while (index >= 0) {
                TaskC.Point ca = pointA.get(index);
                for (int i = 0; i < pointB.size(); i++) {
                    TaskC.Point cb = pointB.get(i);
                    if (ca.getX() < cb.getX() && ca.getY() < cb.getY()) {
                        pointA.remove(ca);
                        pointB.remove(cb);
                        ans++;
                        index--;
                        break;
                    } else if (i == pointB.size() - 1) {
                        index--;
                    }
                }
            }
            out.println(ans);
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

            public int getMax() {
                return Math.max(x, y);
            }

            public int getMin() {
                return Math.min(x, y);
            }

        }

    }
}

