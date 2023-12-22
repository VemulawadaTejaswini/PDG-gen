import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        private List<TaskB.Point> hull(List<TaskB.Point> points) {
            TaskB.Point origin = points.get(0);
            for (TaskB.Point e : points) {
                if (e.x < origin.x || e.x == origin.x && e.y < origin.y) {
                    origin = e;
                }
            }

            long deltaa = -origin.x;
            long deltab = -origin.y;
            for (TaskB.Point e : points) {
                e.x += deltaa;
                e.y += deltab;
            }

            Comparator<TaskB.Point> comparator = new Comparator<TaskB.Point>() {

                public int compare(TaskB.Point o1, TaskB.Point o2) {
                    long z = -o1.x * o2.y + o2.x * o1.y;
                    if (z < 0) return -2;
                    if (z > 0) return 2;
                    z = Math.abs(o1.x) + Math.abs(o1.y) - Math.abs(o2.x) - Math.abs(o2.y);
                    if (z < 0) return -1;
                    if (z > 0) return 1;
                    return 0;
                }
            };
            Collections.sort(points, comparator);

            List<TaskB.Point> hull = new ArrayList<>();
            for (TaskB.Point p : points) {
                if (!hull.isEmpty() && p.x == hull.get(hull.size() - 1).x && p.y == hull.get(hull.size() - 1).y) {
                    // Coinciding points
                    continue;
                }
                hull.add(p);
                while (hull.size() >= 3) {
                    TaskB.Point a = hull.get(hull.size() - 3);
                    TaskB.Point b = hull.get(hull.size() - 2);
                    TaskB.Point c = hull.get(hull.size() - 1);
                    if ((b.y - a.y) * (c.x - b.x) - (b.x - a.x) * (c.y - b.y) < 0) break;
                    hull.remove(hull.size() - 2);
                }
            }

            for (TaskB.Point e : points) {
                e.x -= deltaa;
                e.y -= deltab;
            }
            return hull;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            TaskB.Point[] p = new TaskB.Point[n];
            for (int i = 0; i < n; ++i) {
                p[i] = new TaskB.Point();
                p[i].x = in.nextInt();
                p[i].y = in.nextInt();
            }
            List<TaskB.Point> all = new ArrayList<>();
            for (TaskB.Point pp : p) all.add(pp);
            List<TaskB.Point> h = hull(all);
            for (int i = 0; i < h.size(); ++i) {
                TaskB.Point a = h.get(i);
                TaskB.Point b = h.get((i + 1) % h.size());
                TaskB.Point c = h.get((i + 2) % h.size());
                double a1 = Math.atan2(b.y - a.y, b.x - a.x);
                double a2 = Math.atan2(c.y - b.y, c.x - b.x);
                while (a2 < a1 - 1e-14) a2 += 2 * Math.PI;
                b.answer = (a2 - a1) / (2 * Math.PI);
            }
            for (TaskB.Point pp : p) {
                out.println(pp.answer);
            }
        }

        static class Point {
            long x;
            long y;
            double answer = 0.0;

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

